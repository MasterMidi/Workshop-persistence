package db;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import DBinterface.IDbProduct;
import model.Clothing;
import model.Equipment;
import model.GunReplica;
import model.Product;
import model.SalesPrice;
import model.SellableProduct;
import model.Supplier;

public class DatabaseProduct implements IDbProduct {

    private final static String PRODUCTSEARCH = "SELECT id,ean,name,description,purchase_price,country_of_origin,bought_date,supplier_id,type,clothing_size,clothing_color,equipment_type,gun_replica_caliber,gun_replica_material FROM product WHERE name LIKE ?";
    private final static String SELLABLEPRODUCTSEARCH = "SELECT id, product_id, min_stock FROM sellable_product WHERE product_id IN (?) ";

    public List<SellableProduct> searchProductSellable(String name) throws DataAccessException {
	ArrayList<SellableProduct> res = new ArrayList<>();
	ArrayList<Product> Products = new ArrayList<>();

	try {
	    Connection con = DBConnection.getInstance().getConnection();
	    PreparedStatement productSearch = con.prepareStatement(PRODUCTSEARCH);
	    PreparedStatement sellableProductSearch = con.prepareStatement(SELLABLEPRODUCTSEARCH);
	    productSearch.setString(1, "%" + name + "%");
	    ResultSet rs = productSearch.executeQuery();
	    Products = buildObjects(rs);
	    Array test = new Array<int>{ 1, 2, 3 };
	    sellableProductSearch.setArray(1, test);
	    rs = sellableProductSearch.executeQuery();
	    res = buildSellableProducts(Products, rs);
	} catch (SQLException ex) {
	    ex.printStackTrace();
	} finally

	{
	    DBConnection.getInstance().disconnect();
	}

	return res;
    }

    private String makeSellableSearchString(ArrayList<Product> products) {
	String res = "";
	for (int i = 0; i < products.size(); i++) {
	    if (i == products.size() - 1) {
		res = res + products.get(i).getEan();
	    } else {
		res = res + products.get(i).getEan() + ",";
	    }
	}
	return res;

    }

    public List<Product> searchProductRentable(String name) throws DataAccessException {
	// TODO: Function not implemented
	return null;
    }

    private ArrayList<SellableProduct> buildSellableProducts(ArrayList<Product> products, ResultSet rs)
	    throws SQLException {

	ArrayList<SellableProduct> sellableProdList = new ArrayList<>();
	for (Product curr : products) {
	    rs.next();
	    sellableProdList.add(new SellableProduct(rs.getInt("min_stock"), curr));
	}
	return null;
    }

    private ArrayList<Product> buildObjects(ResultSet rs) throws SQLException {
	ArrayList<Product> res = new ArrayList<>();
	while (rs.next()) {
	    res.add(buildObject(rs));
	}
	return res;
    }

    private Product buildObject(ResultSet rs) throws SQLException {
	// TODO: MAKE BELOW WORK WITH DB
	ArrayList<SalesPrice> emptyList = new ArrayList<>();
	LocalDate datenow = LocalDate.now();
	Supplier emptySupplier = null;
	Product res = null;

	switch (rs.getInt("type")) {
	case 1:

	    res = new Clothing(rs.getString("name"), rs.getString("description"), rs.getInt("ean"),
		    rs.getDouble("purchase_price"), rs.getString("country_of_origin"), datenow,
		    rs.getInt("clothing_size"), rs.getString("clothing_color"), emptySupplier, emptyList);
	    break;
	case 2:
	    res = new GunReplica(rs.getString("name"), rs.getString("description"), rs.getInt("ean"),
		    rs.getDouble("purchase_price"), rs.getString("country_of_origin"), datenow,
		    rs.getInt("gun_replica_cilbre"), rs.getString("gun_replica_material"), emptySupplier, emptyList);
	    break;
	case 3:
	    res = new Equipment(rs.getString("name"), rs.getString("description"), rs.getInt("ean"),
		    rs.getDouble("purchase_price"), rs.getString("country_of_origin"), datenow,
		    rs.getString("equipment_type"), emptySupplier, emptyList);
	    break;
	default:
	}

	return res;
    }

    @Override
    public List<Product> searchProduct(String name) throws DataAccessException {
	// TODO Auto-generated method stub
	return null;
    }
}

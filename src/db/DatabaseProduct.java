package db;

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

    private final static String PRODUCTSEARCHSELLABLE = "SELECT product.id,ean,name,description,purchase_price,country_of_origin,bought_date,supplier_id,type,clothing_size,clothing_color,equipment_type,gun_replica_caliber,gun_replica_material,sellable_product.id as sp_id, sellable_product.min_stock as sp_min_stock FROM product INNER JOIN sellable_product on sellable_product.id = product.id WHERE product.name LIKE ?";

    public List<SellableProduct> searchProductSellable(String name) throws DataAccessException {
	ArrayList<SellableProduct> res = new ArrayList<>();

	try {
	    Connection con = DBConnection.getInstance().getConnection();
	    PreparedStatement productSearch = con.prepareStatement(PRODUCTSEARCHSELLABLE);
	    productSearch.setString(1, "%" + name + "%");
	    ResultSet rs = productSearch.executeQuery();
	    res = buildObjects(rs);

	} catch (SQLException ex) {
	    ex.printStackTrace();
	} finally

	{
	    DBConnection.getInstance().disconnect();
	}

	return res;
    }

    public List<Product> searchProductRentable(String name) throws DataAccessException {
	// TODO: Function not implemented
	return null;
    }

    private ArrayList<SellableProduct> buildObjects(ResultSet rs) throws SQLException {
	ArrayList<SellableProduct> res = new ArrayList<>();
	while (rs.next()) {
	    res.add(buildObject(rs));
	}
	return res;
    }

    private SellableProduct buildObject(ResultSet rs) throws SQLException {
	// TODO: MAKE BELOW WORK WITH DB
	ArrayList<SalesPrice> emptyList = new ArrayList<>();
	LocalDate datenow = LocalDate.now();
	Supplier emptySupplier = null;
	Product currentProduct = null;
	SellableProduct res = null;
	switch (rs.getInt("type")) {
	case 1:

	    currentProduct = new Clothing(rs.getString("name"), rs.getString("description"), rs.getInt("ean"),
		    rs.getDouble("purchase_price"), rs.getString("country_of_origin"), datenow,
		    rs.getInt("clothing_size"), rs.getString("clothing_color"), emptySupplier, emptyList);
	    break;
	case 2:
	    currentProduct = new GunReplica(rs.getString("name"), rs.getString("description"), rs.getInt("ean"),
		    rs.getDouble("purchase_price"), rs.getString("country_of_origin"), datenow,
		    rs.getInt("gun_replica_cilbre"), rs.getString("gun_replica_material"), emptySupplier, emptyList);
	    break;
	case 3:
	    currentProduct = new Equipment(rs.getString("name"), rs.getString("description"), rs.getInt("ean"),
		    rs.getDouble("purchase_price"), rs.getString("country_of_origin"), datenow,
		    rs.getString("equipment_type"), emptySupplier, emptyList);
	    break;
	default:
	}
	res = new SellableProduct(rs.getInt("sp_min_stock"), currentProduct);
	return res;
    }

    @Override
    public List<Product> searchProduct(String name) throws DataAccessException {
	// TODO Auto-generated method stub
	return null;
    }
}

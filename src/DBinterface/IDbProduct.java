package DBinterface;

import java.util.List;

import db.DataAccessException;
import model.Product;
import model.RentableProductCopy;
import model.SellableProduct;

public interface IDbProduct {

    public List<SellableProduct> searchProductSellable(String name) throws DataAccessException;
    
    public List<RentableProductCopy> searchProductRentable(String name) throws DataAccessException;
}

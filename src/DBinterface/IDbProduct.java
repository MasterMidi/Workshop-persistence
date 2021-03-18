package DBinterface;

import java.util.List;

import db.DataAccessException;
import model.Product;

public interface IDbProduct {

    public List<Product> searchProduct(String name) throws DataAccessException;
}

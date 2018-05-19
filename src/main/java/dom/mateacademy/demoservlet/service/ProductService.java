package dom.mateacademy.demoservlet.service;

import dom.mateacademy.demoservlet.dao.ProductDao;
import dom.mateacademy.demoservlet.model.Product;

import java.sql.SQLException;
import java.util.List;

public class ProductService {
    ProductDao productDao = new ProductDao();

    public List<Product> allProducts() {
        return productDao.allProducts();
    }


    public void createProduct(Product newProduct) {
        try {
            productDao.createProduct(newProduct);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Product findProductById(int id) {
        try {
            return productDao.findProductById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void editProduct(Product product) {
        try {
            productDao.editProduct(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteProduct(int id) {
        try {
            productDao.deleteProduct(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

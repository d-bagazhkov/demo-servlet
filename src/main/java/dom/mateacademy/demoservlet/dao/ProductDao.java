package dom.mateacademy.demoservlet.dao;

import dom.mateacademy.demoservlet.configuration.DbUtil;
import dom.mateacademy.demoservlet.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private Connection connection;

    public ProductDao() {
        connection = DbUtil.getConnection();
    }

    public void createProduct(Product product) throws SQLException {
        PreparedStatement preparedStatement = connection
                .prepareStatement("INSERT INTO products (name, description) VALUES (?, ?)");
        preparedStatement.setString(1, product.getName());
        preparedStatement.setString(2, product.getDescription());
        preparedStatement.executeUpdate();
    }

    public List<Product> allProducts(){
        List<Product> products = new ArrayList<Product>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM products");
            while (resultSet.next()){
                Product product = new Product(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("description")
                );
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
    }


}

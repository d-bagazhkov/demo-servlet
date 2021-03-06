package dom.mateacademy.demoservlet.controller;

import dom.mateacademy.demoservlet.dao.ProductDao;
import dom.mateacademy.demoservlet.model.Product;
import dom.mateacademy.demoservlet.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class CreateNewProductServlet extends HttpServlet {

    ProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/views/create-product.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Product newProduct = new Product();
        newProduct.setName(request.getParameter("name"));
        newProduct.setDescription(request.getParameter("description"));
        productService.createProduct(newProduct);

        request.setAttribute("products", productService.allProducts());
        request.getRequestDispatcher("/WEB-INF/views/view-all.jsp").forward(request, response);
    }
}

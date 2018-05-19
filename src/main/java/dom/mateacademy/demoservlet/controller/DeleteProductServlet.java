package dom.mateacademy.demoservlet.controller;

import dom.mateacademy.demoservlet.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class DeleteProductServlet extends HttpServlet {

    ProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        productService.deleteProduct(id);

        request.setAttribute("products", productService.allProducts());
        request.getRequestDispatcher("/WEB-INF/views/view-all.jsp").forward(request, response);
    }

}

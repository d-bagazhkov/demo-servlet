package dom.mateacademy.demoservlet.controller;

import dom.mateacademy.demoservlet.dao.ProductDao;
import dom.mateacademy.demoservlet.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ViewAllServlet extends HttpServlet {

    ProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("products", productService.allProducts());
        request.getRequestDispatcher("/WEB-INF/views/view-all.jsp").forward(request, response);
    }

}

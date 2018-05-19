package dom.mateacademy.demoservlet.controller;

import dom.mateacademy.demoservlet.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ViewOneServlet extends HttpServlet {

    ProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("product", productService.findProductById(id));
        request.setAttribute("is", id);
        request.getRequestDispatcher("/WEB-INF/views/view-one.jsp").forward(request, response);
    }

}

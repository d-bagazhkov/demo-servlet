package dom.mateacademy.demoservlet.controller;

import dom.mateacademy.demoservlet.dao.ProductDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ViewAllServlet extends HttpServlet {

    ProductDao productDao = new ProductDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("products", productDao.allProducts());
        request.getRequestDispatcher("/WEB-INF/views/view-all.jsp").forward(request, response);
    }

}

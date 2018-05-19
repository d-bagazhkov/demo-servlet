package dom.mateacademy.demoservlet.controller;

import dom.mateacademy.demoservlet.model.Product;
import dom.mateacademy.demoservlet.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditProductServlet extends HttpServlet {

    ProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("product", productService.findProductById(id));
        request.getRequestDispatcher("/WEB-INF/views/edit.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Product product = new Product();
        System.out.println(request.getParameter("id") + " " + request.getParameter("name") + " " + request.getParameter("description"));
        product.setId(Integer.parseInt(request.getParameter("id")));
        product.setName(request.getParameter("name"));
        product.setDescription(request.getParameter("description"));
        productService.editProduct(product);

        request.setAttribute("products", productService.allProducts());
        request.getRequestDispatcher("/WEB-INF/views/view-all.jsp").forward(request, response);
    }


}

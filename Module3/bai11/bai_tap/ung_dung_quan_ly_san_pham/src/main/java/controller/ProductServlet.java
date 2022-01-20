package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {

    private final ProductService productService = new ProductServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null) {
            action ="";
        }
        switch (action) {
            case "create": {
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String price = request.getParameter("price");
                String description = request.getParameter("description");
                String producer = request.getParameter("producer");
                Product product = new Product(Integer.parseInt(id), name, Double.parseDouble(price), description, producer);
                productService.save(product);
                response.sendRedirect("/product");
            }
            case "delete":{
                deleteProduct;
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null) {
            action ="";
        }
        switch (action){
            case "display":{
                List<Product> productList = productService.display();
                request.setAttribute("productList", productList);
                request.getRequestDispatcher("Product/display.jsp").forward(request, response);
                break;
            }
            case "create":{
                request.getRequestDispatcher("Product/create.jsp").forward(request, response);
                break;
            }
            default:{
                request.getRequestDispatcher("Product/product.jsp").forward(request, response);
            }
        }
    }
}

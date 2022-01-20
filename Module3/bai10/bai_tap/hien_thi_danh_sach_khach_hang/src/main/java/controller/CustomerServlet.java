package controller;

import model.Customer;
import service.CustomerService;
import service.ICustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerController", urlPatterns = {"/customer"})
public class CustomerServlet extends HttpServlet {
    private ICustomerService iCustomerService = new CustomerService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null) {
            action ="";
        }
        switch (action){
            default:{
                List<Customer> customerList = iCustomerService.display();
                request.setAttribute("customerList", customerList);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }
    }
}

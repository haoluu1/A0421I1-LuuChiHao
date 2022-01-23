package controller;

import model.Customer;
import service.Customer.CustomerService;
import service.Customer.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer_control")
public class CustomerServlet extends HttpServlet {
    private CustomerService customerService = new CustomerServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null) {
            action ="";
        }
        switch (action){
            case "create":{
                String id = request.getParameter("id");
                String type_id = request.getParameter("type_id");
                String name = request.getParameter("name");
                String birthday = request.getParameter("birthday");
                String gender = request.getParameter("gender");
                String id_card = request.getParameter("id_card");
                String phone = request.getParameter("phone");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                Customer customer = new Customer(Integer.parseInt(id), Integer.parseInt(type_id), name, birthday, gender, id_card, phone, email, address);
                if(customerService.create(customer)) {
                    request.setAttribute("msg","Thêm mới thành công");
                    List<Customer> customerList = customerService.view();
                    request.setAttribute("customerList", customerList);
                    request.getRequestDispatcher("customer/view.jsp").forward(request,response);
                } else {
                    request.setAttribute("msg","Thêm mới thất bại");
                    request.getRequestDispatcher("customer/create.jsp").forward(request,response);
                }
                break;
            }
            case "search":{
                String id = request.getParameter("id");
                List<Customer> customerList = customerService.searchById(id);
                request.setAttribute("customerList", customerList);
                request.getRequestDispatcher("customer/view.jsp").forward(request,response);
            }
            case "edit":{
                String id = request.getParameter("id");
                String type_id = request.getParameter("type_id");
                String name = request.getParameter("name");
                String birthday = request.getParameter("birthday");
                String gender = request.getParameter("gender");
                String id_card = request.getParameter("id_card");
                String phone = request.getParameter("phone");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                customerService.save(id, type_id, name, birthday, gender, id_card, phone, email, address);
                response.sendRedirect("/customer_control?action=view");
            }
            case "delete":{
                String id = request.getParameter("id");
                customerService.delete(id);
                response.sendRedirect("/customer_control?action=view");
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null) {
            action ="";
        }
        switch (action){
            case "view":{
                List<Customer>customerList = customerService.view();
                request.setAttribute("customerList", customerList);
                request.getRequestDispatcher("customer/view.jsp").forward(request, response);
                break;
            }
            case "search":{
                request.getRequestDispatcher("customer/search.jsp").forward(request, response);
                break;
            }
            case "create":{
                request.getRequestDispatcher("customer/create.jsp").forward(request, response);
                break;
            }
            case "edit":{
                String id = request.getParameter("id");
                Customer customer = customerService.findById(id);
                request.setAttribute("customer", customer);
                request.getRequestDispatcher("customer/edit.jsp").forward(request,response);
                break;
            }
            case "delete":{
                String id = request.getParameter("id");
                Customer customer = customerService.findById(id);
                request.setAttribute("customer", customer);
                request.getRequestDispatcher("customer/delete.jsp").forward(request,response);
                break;
            }
        }
    }
}

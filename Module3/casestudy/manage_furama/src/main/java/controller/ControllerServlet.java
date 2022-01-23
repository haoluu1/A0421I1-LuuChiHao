package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ControllerServlet", urlPatterns = "/control")
public class ControllerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action =request.getParameter("action");
        if(action == null) {
            action ="";
        }
        switch (action){
            case "employee":{
                request.getRequestDispatcher("employee/control.jsp").forward(request, response);
                break;
            }
            case "customer":{
                request.getRequestDispatcher("customer/control.jsp").forward(request, response);
                break;
            }
        }
    }
}

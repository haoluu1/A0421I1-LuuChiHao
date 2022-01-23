package controller;

import model.Employee;
import service.Employee.EmployeeService;
import service.Employee.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/employee_control")
public class EmployeeServlet extends HttpServlet {
    private EmployeeService employeeService = new EmployeeServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null) {
            action ="";
        }
        switch (action){
            case "create":{
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String birthday = request.getParameter("birthday");
                String id_card = request.getParameter("id_card");
                String salary = request.getParameter("salary");
                String phone = request.getParameter("phone");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                String position_id = request.getParameter("position_id");
                String education_degree_id = request.getParameter("education_degree_id");
                String division_id = request.getParameter("division_id");
                String username = request.getParameter("username");
                Employee employee = new Employee(Integer.parseInt(id), name, birthday, id_card, Double.parseDouble(salary), phone, email, address, Integer.parseInt(position_id), Integer.parseInt(education_degree_id), Integer.parseInt(division_id), username);
                if(employeeService.create(employee)) {
                    request.setAttribute("msg","Thêm mới thành công");
                    List<Employee> employeeList = employeeService.view();
                    request.setAttribute("employeeList", employeeList);
                    request.getRequestDispatcher("employee/view.jsp").forward(request,response);
                } else {
                    request.setAttribute("msg","Thêm mới thất bại");
                    request.getRequestDispatcher("employee/create.jsp").forward(request,response);
                }
                break;
            }
            case "search":{
                String id = request.getParameter("id");
                List<Employee> employeeList = employeeService.searchById(id);
                request.setAttribute("employeeList", employeeList);
                request.getRequestDispatcher("employee/view.jsp").forward(request,response);
            }
            case "edit":{
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String birthday = request.getParameter("birthday");
                String id_card = request.getParameter("id_card");
                String salary = request.getParameter("salary");
                String phone = request.getParameter("phone");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                String position_id = request.getParameter("position_id");
                String education_degree_id = request.getParameter("education_degree_id");
                String division_id = request.getParameter("division_id");
                String username = request.getParameter("username");
                employeeService.save(id, name, birthday, id_card, salary, phone, email, address, position_id, education_degree_id, division_id, username);
                response.sendRedirect("/employee_control?action=view");
            }
            case "delete":{
                String id = request.getParameter("id");
                employeeService.delete(id);
                response.sendRedirect("/employee_control?action=view");
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
                List<Employee>employeeList = employeeService.view();
                request.setAttribute("employeeList", employeeList);
                request.getRequestDispatcher("employee/view.jsp").forward(request, response);
                break;
            }
            case "search":{
                request.getRequestDispatcher("employee/search.jsp").forward(request, response);
                break;
            }
            case "create":{
                request.getRequestDispatcher("employee/create.jsp").forward(request, response);
                break;
            }
            case "edit":{
                String id = request.getParameter("id");
                Employee employee = employeeService.findById(id);
                request.setAttribute("employee", employee);
                request.getRequestDispatcher("employee/edit.jsp").forward(request,response);
                break;
            }
            case "delete":{
                String id = request.getParameter("id");
                Employee employee = employeeService.findById(id);
                request.setAttribute("employee", employee);
                request.getRequestDispatcher("employee/delete.jsp").forward(request,response);
                break;
            }
        }
    }
}

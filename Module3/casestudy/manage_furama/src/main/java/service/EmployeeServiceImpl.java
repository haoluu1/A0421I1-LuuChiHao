package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeServiceImpl implements EmployeeService {
    private String jdbcURL = "jdbc:mysql://localhost:3306/furamamanage";
    private String jdbcUsername = "root";
    private String jdbcPassword = "haoluu123";

    private static final String CREATE_EMPLOYEE_SQL = "INSERT INTO employee" + "  (employee_id, employee_name, employee_birthday, employee_id_card, employee_salary, employee_phone, employee_email, employee_address, position, education_degree_id, division, username) VALUES " +
            " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public void search() {

    }

    @Override
    public void create() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }
}

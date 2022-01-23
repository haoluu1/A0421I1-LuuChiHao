package repository.Employee;

import model.Employee;
import repository.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Employee> view() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select * from employee");
            ResultSet resultSet = preparedStatement.executeQuery();
            Employee employee;
            while (resultSet.next()) {
                employee = new Employee();
                employee.setId(resultSet.getInt("Employee_ID"));
                employee.setName(resultSet.getString("Employee_Name"));
                employee.setBirthday(resultSet.getString("Employee_Birthday"));
                employee.setId_card(resultSet.getString("Employee_ID_Card"));
                employee.setSalary(resultSet.getDouble("Employee_Salary"));
                employee.setPhone(resultSet.getString("Employee_Phone"));
                employee.setEmail(resultSet.getString("Employee_Email"));
                employee.setAddress(resultSet.getString("Employee_Address"));
                employee.setPosition_id(resultSet.getInt("Position_ID"));
                employee.setEducation_degree_id(resultSet.getInt("Education_Degree_ID"));
                employee.setDivision_id(resultSet.getInt("Division_ID"));
                employee.setUsername(resultSet.getString("Username"));
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public void create(Employee employee) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("insert into employee(Employee_ID, Employee_Name, Employee_Birthday, Employee_ID_Card, Employee_Salary, Employee_Phone, Employee_Email, Employee_Address, Position_ID, Education_Degree_ID, Division_ID, Username) value (?,?,?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1, employee.getId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setString(3, employee.getBirthday());
            preparedStatement.setString(4, employee.getId_card());
            preparedStatement.setDouble(5, employee.getSalary());
            preparedStatement.setString(6, employee.getPhone());
            preparedStatement.setString(7, employee.getEmail());
            preparedStatement.setString(8, employee.getAddress());
            preparedStatement.setInt(9, employee.getPosition_id());
            preparedStatement.setInt(10, employee.getEducation_degree_id());
            preparedStatement.setInt(11, employee.getDivision_id());
            preparedStatement.setString(12, employee.getUsername());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Employee findById(String id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from employee where Employee_ID = ?");
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Employee employee = null;
            while (resultSet.next()) {
                employee = new Employee();
                employee.setId(resultSet.getInt("Employee_ID"));
                employee.setName(resultSet.getString("Employee_Name"));
                employee.setBirthday(resultSet.getString("Employee_Birthday"));
                employee.setId_card(resultSet.getString("Employee_ID_Card"));
                employee.setSalary(resultSet.getDouble("Employee_Salary"));
                employee.setPhone(resultSet.getString("Employee_Phone"));
                employee.setEmail(resultSet.getString("Employee_Email"));
                employee.setAddress(resultSet.getString("Employee_Address"));
                employee.setPosition_id(resultSet.getInt("Position_ID"));
                employee.setEducation_degree_id(resultSet.getInt("Education_Degree_ID"));
                employee.setDivision_id(resultSet.getInt("Division_ID"));
                employee.setUsername(resultSet.getString("Username"));
                break;
            }
            return employee;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Employee> searchById(String id) {
        List<Employee> employeeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select * from employee where Employee_ID = ?");
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Employee employee;
            while (resultSet.next()) {
                employee = new Employee();
                employee.setId(resultSet.getInt("Employee_ID"));
                employee.setName(resultSet.getString("Employee_Name"));
                employee.setBirthday(resultSet.getString("Employee_Birthday"));
                employee.setId_card(resultSet.getString("Employee_ID_Card"));
                employee.setSalary(resultSet.getDouble("Employee_Salary"));
                employee.setPhone(resultSet.getString("Employee_Phone"));
                employee.setEmail(resultSet.getString("Employee_Email"));
                employee.setAddress(resultSet.getString("Employee_Address"));
                employee.setPosition_id(resultSet.getInt("Position_ID"));
                employee.setEducation_degree_id(resultSet.getInt("Education_Degree_ID"));
                employee.setDivision_id(resultSet.getInt("Division_ID"));
                employee.setUsername(resultSet.getString("Username"));
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public void save(String id, String name, String birthday, String id_card, String salary, String phone, String email, String address, String position_id, String education_degree_id, String division_id, String username) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("update employee set Employee_Name = ? Employee_Birthday = ? Employee_ID_Card = ? Employee_Salary = ? Employee_Phone = ? Employee_Email = ? Employee_Address = ? Position_ID = ? Education_Degree_ID = ? Division_ID = ? Username = ? where Employee_ID = ?");
            preparedStatement.setString(12, id);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, birthday);
            preparedStatement.setString(3, id_card);
            preparedStatement.setString(4, salary);
            preparedStatement.setString(5, phone);
            preparedStatement.setString(6, email);
            preparedStatement.setString(7, address);
            preparedStatement.setString(8, position_id);
            preparedStatement.setString(9, education_degree_id);
            preparedStatement.setString(10, division_id);
            preparedStatement.setString(11, username);
            int num = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("delete from employee where Employee_ID = ?");
            preparedStatement.setString(1, id);
            int num = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

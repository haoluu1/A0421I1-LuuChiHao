package repository.Employee;

import model.Customer;
import model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> view();

    void create(Employee employee);

    Employee findById(String id);

    List<Employee> searchById(String id);

    void save(String id, String name, String birthday, String id_card, String salary, String phone, String email, String address, String position_id, String education_degree_id, String division_id, String username);

    void delete(String id);
}

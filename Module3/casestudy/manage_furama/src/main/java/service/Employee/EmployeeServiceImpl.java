package service.Employee;

import model.Employee;
import repository.Employee.EmployeeRepository;
import repository.Employee.EmployeeRepositoryImpl;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    @Override
    public List<Employee> view() {
        return employeeRepository.view();
    }

    @Override
    public boolean create(Employee employee) {
        Employee employee1 = findById(employee.getId()+"");
        if(employee1!=null) {
            return false;
        } else {
            employeeRepository.create(employee);
            return true;
        }
    }

    @Override
    public Employee findById(String id) {
        return employeeRepository.findById(id);
    }

    @Override
    public List<Employee> searchById(String id) {
        return employeeRepository.searchById(id);
    }

    @Override
    public void save(String id, String name, String birthday, String id_card, String salary, String phone, String email, String address, String position_id, String education_degree_id, String division_id, String username) {
        employeeRepository.save(id, name, birthday, id_card,salary, phone, email, address, position_id, education_degree_id, division_id, username);
    }

    @Override
    public void delete(String id) {
        employeeRepository.delete(id);
    }
}

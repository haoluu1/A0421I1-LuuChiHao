package repository.Customer;

import model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> view();

    void create(Customer customer);

    Customer findById(String id);

    List<Customer> searchById(String id);

    void save(String id, String type_id, String name, String birthday, String gender, String id_card, String phone, String email, String address);

    void delete(String id);
}

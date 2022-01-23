package repository.Customer;

import model.Customer;
import repository.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Customer> view() {
        List<Customer> customerList = new ArrayList<>();
        try {
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select * from customer");
        ResultSet resultSet = preparedStatement.executeQuery();
        Customer customer;
        while (resultSet.next()) {
            customer = new Customer();
            customer.setId(resultSet.getInt("Customer_ID"));
            customer.setType_id(resultSet.getInt("Customer_Type_ID"));
            customer.setName(resultSet.getString("Customer_Name"));
            customer.setBirthday(resultSet.getString("Customer_Birthday"));
            customer.setGender(resultSet.getString("Customer_Gender"));
            customer.setId_card(resultSet.getString("Customer_ID_Card"));
            customer.setPhone(resultSet.getString("Customer_Phone"));
            customer.setEmail(resultSet.getString("Customer_Email"));
            customer.setAddress(resultSet.getString("Customer_Address"));
            customerList.add(customer);
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public void create(Customer customer) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("insert into customer(Customer_ID, Customer_Type_ID, Customer_Name, Customer_Birthday, Customer_Gender, Customer_ID_Card, Customer_Phone, Customer_Email, Customer_Address) value (?,?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1, customer.getId());
            preparedStatement.setInt(2, customer.getType_id());
            preparedStatement.setString(3, customer.getName());
            preparedStatement.setString(4, customer.getBirthday());
            preparedStatement.setString(5, customer.getGender());
            preparedStatement.setString(6, customer.getId_card());
            preparedStatement.setString(7, customer.getPhone());
            preparedStatement.setString(8, customer.getEmail());
            preparedStatement.setString(9, customer.getAddress());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Customer findById(String id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from customer where Customer_ID = ?");
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer = null;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setId(resultSet.getInt("Customer_ID"));
                customer.setType_id(resultSet.getInt("Customer_Type_ID"));
                customer.setName(resultSet.getString("Customer_Name"));
                customer.setBirthday(resultSet.getString("Customer_Birthday"));
                customer.setGender(resultSet.getString("Customer_Gender"));
                customer.setId_card(resultSet.getString("Customer_ID_Card"));
                customer.setPhone(resultSet.getString("Customer_Phone"));
                customer.setEmail(resultSet.getString("Customer_Email"));
                customer.setAddress(resultSet.getString("Customer_Address"));
                break;
            }
            return customer;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Customer> searchById(String id) {
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select * from customer where Customer_ID = ?");
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setId(resultSet.getInt("Customer_ID"));
                customer.setType_id(resultSet.getInt("Customer_Type_ID"));
                customer.setName(resultSet.getString("Customer_Name"));
                customer.setBirthday(resultSet.getString("Customer_Birthday"));
                customer.setGender(resultSet.getString("Customer_Gender"));
                customer.setId_card(resultSet.getString("Customer_ID_Card"));
                customer.setPhone(resultSet.getString("Customer_Phone"));
                customer.setEmail(resultSet.getString("Customer_Email"));
                customer.setAddress(resultSet.getString("Customer_Address"));
                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public void save(String id, String type_id, String name, String birthday, String gender, String id_card, String phone, String email, String address) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("update customer set Customer_Type_ID = ?, Customer_Name = ?, Customer_Birthday = ?, Customer_Gender = ?, Customer_ID_Card = ?, Customer_Phone = ?, Customer_Email = ?, Customer_Address = ? where Customer_ID = ?");
            preparedStatement.setString(9, id);
            preparedStatement.setString(1, type_id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, birthday);
            preparedStatement.setString(4, gender);
            preparedStatement.setString(5, id_card);
            preparedStatement.setString(6, phone);
            preparedStatement.setString(7, email);
            preparedStatement.setString(8, address);
            int num = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("delete from customer where Customer_ID = ?");
            preparedStatement.setString(1, id);
            int num = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
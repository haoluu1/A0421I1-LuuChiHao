package com.example.demo.codegym.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.*;

public class UserDto implements Validator{
    private int id;

    @NotEmpty
    @Size(min = 5, max = 45)
    private String firstName;

    @NotEmpty
    @Size(min = 5, max = 45)
    private String lastName;

    @NotEmpty
    @Pattern(regexp = "^(0[3|5|7|8|9])+([0-9]{8})$")
    private String phoneNumber;

    @NotEmpty
    @Min(18)
    private String age;

    @NotEmpty
    @Email
    private String email;

    public UserDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto = (UserDto)target;
//        if ("".equals(userDto.getFirstName())){
//            errors.rejectValue("firstName", "errorFirstName");
//        }
    }
}

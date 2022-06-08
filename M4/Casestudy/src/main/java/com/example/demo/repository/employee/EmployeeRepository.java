package com.example.demo.repository.employee;

import com.example.demo.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query(value = "select * from employee where name like concat('%', :name , '%') and id_card like concat('%', :idCard , '%') and position_id like concat('%', :position , '%')",
            countQuery = "select count(*) from employee where name like concat('%', :name , '%') and id_card like concat('%', :idCard , '%') and position_id like concat('%', :position , '%')",
            nativeQuery = true)
    Page<Employee> findAll(@Param("name") String name, @Param("idCard") String idCard, @Param("position") String position, Pageable pageable);
}

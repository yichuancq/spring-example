package com.example.repostiory;

import com.example.domain.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yichuan
 * 员工
 */
@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {

    /**
     * 通过firstName和lastName查询雇员
     *
     * @param firstName
     * @param lastName
     * @return
     */
    List<Staff> findByFirstNameAndLastName(String firstName, String lastName);
}

package com.example.service;

import com.example.domain.Staff;

import java.util.List;

/**
 * @author yichuan
 */
public interface StaffService {

    /**
     * 通过firstName和lastName查询雇员
     *
     * @param firstName
     * @param lastName
     * @return
     */
    List<Staff> getOneByName(String firstName, String lastName);

    /**
     * findAll
     *
     * @return
     */
    List<Staff> findAll();
}

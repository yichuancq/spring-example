package com.example.service;

import com.example.domain.Staff;
import com.example.repostiory.StaffRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@EnableAspectJAutoProxy
@Slf4j
public class StaffServiceImpl implements StaffService {
    /**
     * 注入对象
     */
    @Autowired
    private StaffRepository staffRepository;

    /**
     * @param firstName
     * @param lastName
     * @return
     */
    @Override
    public List<Staff> getOneByName(String firstName, String lastName) {

        log.info("firstName:{},lastName:{}", firstName, lastName);
        return staffRepository.findByFirstNameAndLastName(firstName, lastName);
    }

    @Override
    public List<Staff> findAll() {
        return staffRepository.findAll();
    }
}

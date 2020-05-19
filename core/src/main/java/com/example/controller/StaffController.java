package com.example.controller;

import com.example.domain.Staff;
import com.example.service.StaffService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yichuan
 */

@Slf4j
@RestController
@RequestMapping("/staffController")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @PostMapping("queryStaffByName")
    @ResponseBody
    public List<Staff> queryStaffByName(@RequestBody Staff staff) {
        log.info("staff:{}", staff);
        return staffService.getOneByName(staff.getFirstName(), staff.getLastName());
    }

    /**
     * @return
     */
    @GetMapping("findALl")
    @ResponseBody
    public List<Staff> findALl() {
        log.info("findALl");
        return staffService.findAll();
    }
}

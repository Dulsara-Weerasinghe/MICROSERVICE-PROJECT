package com.epic.department.service.controller;

import com.epic.department.service.entity.LvmtJpUserParam;
import com.epic.department.service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/department")
@Slf4j
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/save")
    public LvmtJpUserParam saveDepartment(@RequestBody LvmtJpUserParam lvmtJpUserParam) {
        log.info("Department is saved");
        return departmentService.saveDepartment(lvmtJpUserParam);
    }
    @GetMapping("/get/{id}")
    public LvmtJpUserParam getDepatmentData(@PathVariable("id") String departmentId) {
        log.info("Getting department data");
        return departmentService.getDepatment(departmentId);
    }


}

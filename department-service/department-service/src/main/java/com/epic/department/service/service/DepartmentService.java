package com.epic.department.service.service;

import com.epic.department.service.entity.LvmtJpUserParam;
import com.epic.department.service.repository.LvmtJPUserParamRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    LvmtJPUserParamRepository lvmtJPUserParamRepository;

    public LvmtJpUserParam saveDepartment(LvmtJpUserParam lvmtJpUserParam) {
        return lvmtJPUserParamRepository.save(lvmtJpUserParam);
    }

    public LvmtJpUserParam getDepatment(String departmentId) {
        log.info("Getting department data was successful");
        return lvmtJPUserParamRepository.findById(departmentId).get();
    }
}

package com.epic.user.service.service;

import com.epic.user.service.dto.LvmtJPUserParamDto;
import com.epic.user.service.dto.ResponseDTO;
import com.epic.user.service.entity.LvmtUserParam;
import com.epic.user.service.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    RestTemplate restTemplate;


    public LvmtUserParam saveUserDetails(LvmtUserParam lvmtUserParam) {
        return userRepository.save(lvmtUserParam);
    }

    public ResponseDTO getUserDepartment(String userId) {
        LvmtUserParam lvmtUserParam=userRepository.findById(userId).get();
        ResponseDTO responseDto=new ResponseDTO();
        responseDto.setLvmtUserParam(lvmtUserParam);
        LvmtJPUserParamDto jpUserParamDto=restTemplate.getForObject("http://localhost:9090/api/department/get/"+userId,LvmtJPUserParamDto.class);
        responseDto.setLvmtJPUserParamDto(jpUserParamDto);

        log.info("Getting user details and depatment details succces");
        return responseDto;
    }
}

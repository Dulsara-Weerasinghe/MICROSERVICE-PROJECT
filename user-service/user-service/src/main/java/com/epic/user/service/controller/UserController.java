package com.epic.user.service.controller;

import com.epic.user.service.dto.ResponseDTO;
import com.epic.user.service.entity.LvmtUserParam;
import com.epic.user.service.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Slf4j
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/save")
    public LvmtUserParam saveUser(@RequestBody LvmtUserParam lvmtUserParam){
        log.info("User has been saved");
        return userService.saveUserDetails(lvmtUserParam);

    }

    @GetMapping("/get/{userId}")
    public ResponseDTO getUserDetailsWithDepartment(@PathVariable String userId){
        log.info("Getting user details and depatment details together");
        return userService.getUserDepartment(userId);

    }


}

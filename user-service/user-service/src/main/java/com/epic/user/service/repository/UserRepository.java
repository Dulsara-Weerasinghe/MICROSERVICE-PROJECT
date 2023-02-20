package com.epic.user.service.repository;

import com.epic.user.service.entity.LvmtUserParam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<LvmtUserParam,String> {
}

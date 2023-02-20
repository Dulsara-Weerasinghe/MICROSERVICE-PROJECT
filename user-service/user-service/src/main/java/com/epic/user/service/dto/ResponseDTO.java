package com.epic.user.service.dto;

import com.epic.user.service.entity.LvmtUserParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
    private LvmtUserParam lvmtUserParam;
    private LvmtJPUserParamDto lvmtJPUserParamDto;
}

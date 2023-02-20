package com.epic.user.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LvmtJPUserParamDto {

    private String paramCode;
    private String paramValue;
    private String description;
}

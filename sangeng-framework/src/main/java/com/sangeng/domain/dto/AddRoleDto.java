package com.sangeng.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddRoleDto {
    private String roleKey;

    private String roleName;

    private Integer roleSort;

    private String status;

    private List<Long> menuIds;

    private String remark;
}

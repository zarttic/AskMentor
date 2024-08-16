package org.zartt.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: zartt
 * @description: 查询请求
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryDTO {
    String name;
    String school;
    String major;
    Integer pageSize;
    Integer pageIndex;
}

package org.zartt.cloud.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: zartt
 * @description: 版本1
 */
@TableName("mentor_ver1")
@Data
public class Mentor implements Serializable {
    @JsonIgnore
    private Double emo;
    private String school;
    private String major;
    private String name;
    private String judge;
}

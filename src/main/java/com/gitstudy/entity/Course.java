package com.gitstudy.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@TableName("courses")
public class Course {
    private Integer courseId;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
}

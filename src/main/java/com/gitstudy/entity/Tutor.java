package com.gitstudy.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@TableName("tutors")
public class Tutor {
    private Integer tutorId;
    private String name;
    private String email;
    private Address address;
    private List<Course> courses;
}

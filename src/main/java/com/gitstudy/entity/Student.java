package com.gitstudy.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@TableName("students")
public class Student {
    private Integer id;
    private String name;
    private String email;
    private Address address;
}

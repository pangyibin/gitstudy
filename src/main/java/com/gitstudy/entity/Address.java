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
@TableName("addresses")
public class Address {
    private Integer addrId;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;

}

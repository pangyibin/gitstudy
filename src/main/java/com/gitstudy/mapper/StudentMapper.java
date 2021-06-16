package com.gitstudy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gitstudy.entity.Student;

import java.util.List;

public interface StudentMapper extends BaseMapper<Student> {

//    @Insert("insert into students(id,name,email,dob) values(#{id},#{name},#{email},#{dob})")
     List<Student> findAllStudents();

     Student findStudentById(int id);

}

package com.gitstudy;

import com.gitstudy.entity.Student;
import com.gitstudy.entity.Tutor;
import com.gitstudy.mapper.StudentMapper;
import com.gitstudy.mapper.TutorMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@MapperScan("com.gitstudy.mapper")
@SpringBootTest
class GitstudyApplicationTests {
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    TutorMapper tutorMapper;
    @Test
    void contextLoads() {
//        Student student=new Student(3,"cat","456@qq.com",);
//        List<Student> allStudents = studentMapper.findAllStudents();
//        allStudents.forEach(System.out::println);
        Tutor tutorById = tutorMapper.findTutorById(1);
        System.out.println(tutorById);
//        Student studentById = studentMapper.findStudentById(3);
//        System.out.println(studentById);
//        List<Student> allStudents = studentMapper.findAllStudents();
//        Student studentById = studentMapper.findStudentById(1);
//
//        System.out.println(studentById);
//        allStudents.forEach(System.out::println);

        System.out.println("111");

        System.out.println("feature-blue");
    }

}

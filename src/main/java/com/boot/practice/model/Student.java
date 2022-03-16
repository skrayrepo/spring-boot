package com.boot.practice.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
public class Student {

    String name;
    String rollNo;
    String section;

    @Autowired
    School school;

    public Student() {
        //this.school = new School();
        System.out.println("Object created>>>>>>>");
    }

    public String getName() {
        return name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", section='" + section + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void result(){
        System.out.println("Result is not too good");
        school.getResult();
    }
}

package com.boot.practice.model;

import com.boot.practice.properties.MyAddressProperties;
import com.boot.practice.properties.MyBootProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class School implements ExamResult{

    String schoolName;
    String group;
    String schoolCode;

    @Autowired
    MyBootProperties myBootProperties;


    @Value("${myboot.address}")
    String address;

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", group='" + group + '\'' +
                ", schoolCode='" + schoolCode + '\'' +
                '}';
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    @Override
    public void getResult() {

        System.out.println("Result of this school address istName()"+address);
        System.out.println("My URL information"+myBootProperties.getInfo().get("url"));
        System.out.println("My country list"+ Arrays.toString(myBootProperties.getCountry().toArray()));
    }
}

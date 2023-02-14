package com.boot.practice.model;

import com.boot.practice.properties.MyAddressProperties;
import com.boot.practice.properties.MyBootProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class School implements ExamResult{

    String schoolName;
    String group;
    String schoolCode;

    @Autowired
    MyBootProperties myBootProperties;

    @Autowired
    MyAddressProperties myAddressProperties;

    @Value("${myboot.address.address1}")
    String address1;

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

        System.out.println("Result of this school is average"+address1);
        System.out.println("My name is "+myBootProperties.getName()+" and my Address is "+myAddressProperties.getAddress2());
    }
}

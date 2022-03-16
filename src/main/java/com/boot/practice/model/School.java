package com.boot.practice.model;

import org.springframework.stereotype.Component;

@Component
public class School implements ExamResult{

    String schoolName;
    String group;
    String schoolCode;

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
        System.out.println("Result of this school is average");
    }
}

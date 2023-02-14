package com.boot.practice.properties;

import java.util.List;
import java.util.Map;

public class PropertiesReader {

    private String name;
    private Integer age;
    private String address;
    private Map<String,String> info;
    private List<String> country;

    public PropertiesReader(String name, Integer age, String address, Map<String, String> info, List<String> country) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.info = info;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Map<String, String> getInfo() {
        return info;
    }

    public void setInfo(Map<String, String> info) {
        this.info = info;
    }

    public List<String> getCountry() {
        return country;
    }

    public void setCountry(List<String> country) {
        this.country = country;
    }
}

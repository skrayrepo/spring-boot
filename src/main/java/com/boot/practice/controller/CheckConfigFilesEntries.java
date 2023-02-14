package com.boot.practice.controller;

import com.boot.practice.properties.MyBootProperties;
import com.boot.practice.properties.PropertiesReader;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckConfigFilesEntries {
    @Autowired
    private MyBootProperties myBootConfig;

    @RequestMapping(value="/config",method = {RequestMethod.GET})
    public String getProperties() throws JsonProcessingException {
        ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        PropertiesReader propertiesReader = new PropertiesReader(myBootConfig.getName(),
                myBootConfig.getAge(),myBootConfig.getAddress(),myBootConfig.getInfo(),myBootConfig.getCountry());
        String json = objectWriter.writeValueAsString(propertiesReader);
        System.out.println(json);
        return json;
    }
}

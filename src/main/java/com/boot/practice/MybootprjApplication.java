package com.boot.practice;

import com.boot.practice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MybootprjApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(MybootprjApplication.class, args);
		Student s = context.getBean(Student.class);
		s.result();

		/*Student s1 = context.getBean(Student.class);
		s1.result();*/
	}

}

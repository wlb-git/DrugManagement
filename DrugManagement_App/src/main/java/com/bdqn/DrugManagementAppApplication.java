package com.bdqn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@MapperScan(basePackages= {"com.bdqn.Mapper"})
public class DrugManagementAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(DrugManagementAppApplication.class, args);
	}

}

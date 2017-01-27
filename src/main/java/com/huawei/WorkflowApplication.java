package com.huawei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class WorkflowApplication {
	// #region main

	public static void main(String[] args) {
		SpringApplication.run(WorkflowApplication.class, args);
	}

	// #endregion
}

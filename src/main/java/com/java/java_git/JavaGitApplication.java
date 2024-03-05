package com.java.java_git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaGitApplication.class, args);
		StringPr pr = new StringPr();
		pr.show();
	}

}

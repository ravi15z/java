package com.java.java_git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.java_git.java9.Inter_Private_Method;
import com.java.java_git.java9.ter_Private_Method_Impl;

@SpringBootApplication
public class JavaGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaGitApplication.class, args);
		Inter_Private_Method ip = new ter_Private_Method_Impl();

		ip.defaultMethod();
		System.out.println("Overrided Method : ");
		ip.abstMethod();
		System.out.println("Static Method call");
		Inter_Private_Method.staticMethod();
		ter_Private_Method_Impl.staticMethod();
		StringPr pr = new StringPr();
		pr.show();
	}

}

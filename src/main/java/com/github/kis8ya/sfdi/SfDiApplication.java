package com.github.kis8ya.sfdi;

import com.github.kis8ya.sfdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());
	}

}

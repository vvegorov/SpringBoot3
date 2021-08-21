package com.apress.todo.todoinmemory_1;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TodoInMemory1Application {

//	public static void main(String[] args) {
//		SpringApplication.run(TodoInMemory1Application.class, args);
//	}

		public static void main(String[] args) {
			new SpringApplicationBuilder(TodoInMemory1Application.class)
					.bannerMode(Banner.Mode.OFF)
					.logStartupInfo(false)
					.run(args);
		}
}

package com.sparta.socketprac;

import com.sparta.socketprac.stomp.Greeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocketPracApplication {

	public static void main(String[] args) {

		SpringApplication.run(SocketPracApplication.class, args);
		Greeting gt = new Greeting();
	}
}

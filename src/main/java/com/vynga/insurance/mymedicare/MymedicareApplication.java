package com.vynga.insurance.mymedicare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@SpringBootApplication
public class MymedicareApplication {

	@RequestMapping("/vidhu")
	public ResponseEntity getIndex(){

		return new ResponseEntity("Hello this is my first project", HttpStatus.OK);
	}
	public static void main(String[] args) {
		SpringApplication.run(MymedicareApplication.class, args);
	}

}

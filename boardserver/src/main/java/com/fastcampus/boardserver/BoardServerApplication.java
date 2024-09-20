package com.fastcampus.boardserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@Log4j2
public class BoardServerApplication {

	public static void main(String[] args) {
		log.info("========Starting Board Server");
		SpringApplication.run(BoardServerApplication.class, args);
		log.info("========Ending Board Server");
	}

}

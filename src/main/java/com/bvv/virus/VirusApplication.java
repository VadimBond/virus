package com.bvv.virus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class VirusApplication {

  public static void main(String[] args) {
    SpringApplication.run(VirusApplication.class, args);
  }

}

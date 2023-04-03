package com.piyush.springcloud.tasks;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableTask
public class TasksApplication  implements ApplicationRunner {

  public static void main(String[] args) {
    SpringApplication.run(TasksApplication.class, args);
  }

  @Bean
  public TaskListener taskListener(){
    return new TaskListener();
  }

  /**
   * This is short-lived task that gets executed when application starts
   * @param args
   * @throws Exception
   */
  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println("Hello World!");
  }
}

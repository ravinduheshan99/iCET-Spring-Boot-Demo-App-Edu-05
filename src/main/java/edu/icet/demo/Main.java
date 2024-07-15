package edu.icet.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*(exclude = {DataSourceAutoConfiguration.class}
        //this is for disable auto configurations with database
        )
 */
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}
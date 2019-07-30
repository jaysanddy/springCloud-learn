package cn.springcloud.psh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ch43HttpclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch43HttpclientApplication.class, args);
    }

}

package cn.springcloud.psh.ch21eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ch21EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch21EurekaClientApplication.class, args);
    }

}

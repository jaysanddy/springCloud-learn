package cn.springcloud.psh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch82EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch82EurekaServerApplication.class, args);
    }

}
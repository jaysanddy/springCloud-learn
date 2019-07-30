package cn.springcloud.psh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ch45ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch45ConsumerApplication.class, args);
    }

}

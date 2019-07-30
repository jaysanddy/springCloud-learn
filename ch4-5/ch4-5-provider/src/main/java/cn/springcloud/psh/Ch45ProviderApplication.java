package cn.springcloud.psh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch45ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch45ProviderApplication.class, args);
    }

}

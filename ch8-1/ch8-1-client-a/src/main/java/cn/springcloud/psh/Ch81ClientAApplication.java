package cn.springcloud.psh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch81ClientAApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch81ClientAApplication.class, args);
    }

}

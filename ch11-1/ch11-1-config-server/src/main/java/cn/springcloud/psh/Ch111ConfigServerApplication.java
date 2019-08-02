package cn.springcloud.psh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Ch111ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch111ConfigServerApplication.class, args);
    }

}

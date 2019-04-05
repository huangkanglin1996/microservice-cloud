package cn.huangkanglin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
/**
 * 本服务启动后会自动注册进eureka服务中
 */
@EnableEurekaClient
public class DeptProvider {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider.class);
    }
}

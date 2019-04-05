package cn.huangkanglin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaServer
 * @Description TODO
 * @Author hkl
 * @Date 2019/4/6 1:55
 **/
@SpringBootApplication
@EnableEurekaServer //EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServer {
    public static void main(String[] args) {

        SpringApplication.run(EurekaServer.class, args);
    }
}

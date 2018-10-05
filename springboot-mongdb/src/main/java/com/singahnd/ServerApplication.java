package com.singahnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 ************************************************* 
 * @ClassName: ServerApplication 
 * @Description: TODO(系统启动类) 
 * @author mjy
 * @date 2018年5月24日 下午3:17:07 
 ************************************************
 */
@EnableAutoConfiguration
@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}

package com.jsonyao.cs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Ralation:
 *      a. https://www.cnblogs.com/liuyj-top/p/12976396.html
 */
@SpringBootApplication
@MapperScan("com.jsonyao.cs.mapper")
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

}

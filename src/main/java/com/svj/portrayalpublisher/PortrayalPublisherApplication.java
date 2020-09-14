package com.svj.portrayalpublisher;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.svj.portrayalpublisher.mapper")
public class PortrayalPublisherApplication {

    public static void main(String[] args){

        SpringApplication.run(PortrayalPublisherApplication.class, args);

    }


}

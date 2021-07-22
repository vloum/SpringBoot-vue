package com.huahang.estat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Auth: pipi
 * @Desc: 黑马智慧物业管理系统-springBoot引导类
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.huahang.estat.dao"}) //扫描继承了TKMapper Mapper<T>接口的接口
public class HuahangApplication<MapperScan> {

    public static void main(String[] args) {
        SpringApplication.run(HuahangApplication.class, args);
    }

}

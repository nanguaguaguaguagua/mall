package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication//声明这是一个启动类
@MapperScan("org.example.mall.mapper")//
public class Main {
    public static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。
        SpringApplication.run(Main.class, args);
    }
}
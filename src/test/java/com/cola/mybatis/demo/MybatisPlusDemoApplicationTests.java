package com.cola.mybatis.demo;

import com.cola.mybatis.demo.dao.NameMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MybatisPlusDemoApplicationTests {

    @Resource
    NameMapper nameMapper;

    @Test
    void countNames() {
        System.out.println(nameMapper.countNames());
    }

    @Test
    void baseMapper(){
        System.out.println(nameMapper.selectById(1));
    }
}

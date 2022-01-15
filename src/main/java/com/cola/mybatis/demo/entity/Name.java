package com.cola.mybatis.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Cola
 * @description 使用BaseMapper需要entity，并注解tablename
 * @date 2022/1/15
 * @email 1020151695@qq.com
 */
@Data
@TableName("mybatis_demo")
public class Name implements Serializable {
    private Long id;
    private String name;
}

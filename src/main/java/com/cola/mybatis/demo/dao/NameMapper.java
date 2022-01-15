package com.cola.mybatis.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cola.mybatis.demo.entity.Name;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Cola
 * @description
 * @date 2022/1/15
 * @email 1020151695@qq.com
 */
@Mapper
public interface NameMapper extends BaseMapper<Name> {
    Integer countNames();
}

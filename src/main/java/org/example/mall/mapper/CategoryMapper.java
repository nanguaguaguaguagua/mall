package org.example.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.mall.pojo.Category;

import java.util.List;

/**
 * 商品分类持久层接口
 * @Mapper 声明这是一个持久层
 * BaseMapper<Category> 继承了Mybatis-Plus的BaseMapper接口，提供了一些基本的CRUD操作
 */
@Mapper//声明这是一个持久层
public interface CategoryMapper extends BaseMapper<Category> {
    @Select("select * from category where id=#{id}")
    public List<Category> selectById(Integer id);
}

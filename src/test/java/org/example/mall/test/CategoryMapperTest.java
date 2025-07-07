package org.example.mall.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.example.mall.mapper.CategoryMapper;
import org.example.mall.pojo.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 商品分类持久层测试类
 * @SpringBootTest 表示当前是一个SPringBoot测试类
 */
@SpringBootTest//声明这是一个测试类
public class CategoryMapperTest {
    @Autowired//表示自动注入 引入Spring管理的对象
    private CategoryMapper categoryMapper;
    @Test
    public void testSelectAll(){
        //创建查询条件
        QueryWrapper<Category> queryWrapper = null;
        List<Category> list = categoryMapper.selectList(queryWrapper);
        System.out.println(list);
    }
}

package org.example.mall.service.impl;
import org.example.mall.mapper.CategoryMapper;
import org.example.mall.pojo.Category;
import org.example.mall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品分类业务层实现类
 * @service 声明这是一个业务层
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired//注入持久层CategortMapper对象
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> selectAll(){
        List<Category> list=categoryMapper.selectList(null);
        return list;
    }
    @Override
    public List<Category> selectByIdService(int id){
        List<Category> category=categoryMapper.selectById(id);
        return category;
    }

}

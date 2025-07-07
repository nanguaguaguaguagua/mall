package org.example.mall.service;

import org.example.mall.pojo.Category;

import java.util.List;

/**
 * 商品分类业务层接口
 */
public interface CategoryService {
    /**
     * 查询所有商品分类
     * @return
     */
    List<Category> selectAll();
    List<Category> selectByIdService(int id);
}

package org.example.mall.service;

import org.example.mall.pojo.Item;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ItemService {
    /**
     * 根据分类id查询商品
     * @param categoryId 分类id
     * @return 商品列表
     */
    List<Item> selectByCategoryId(Integer categoryId);
}

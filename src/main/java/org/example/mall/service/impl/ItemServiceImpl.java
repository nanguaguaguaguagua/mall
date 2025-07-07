package org.example.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.example.mall.mapper.ItemMapper;
import org.example.mall.pojo.Item;
import org.example.mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemMapper itemMapper;
    @Override
    public List<Item> selectByCategoryId(Integer categoryId) {
        QueryWrapper<Item> queryWrapper = new QueryWrapper<>();
        //eq 指设置sql语句为select * from item where category_id = #{categoryId}
        queryWrapper.eq("category_id", categoryId);
        return itemMapper.selectList(queryWrapper);
    }
    @Override
    public void insert(Item item) {
        int result = itemMapper.insert(item);
        if(result <1){
            throw new RuntimeException("添加商品失败");
        }

    }
}

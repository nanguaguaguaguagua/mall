package org.example.mall.control;

import org.example.mall.pojo.Item;
import org.example.mall.service.ItemService;
import org.example.mall.util.ServerResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/selectByCategoryId")
    public ServerResult<List<Item>> selectByCategoryId(Integer categoryId){
        List<Item> items = itemService.selectByCategoryId(categoryId);
        return ServerResult.success(items);
    }
}

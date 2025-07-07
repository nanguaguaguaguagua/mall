package org.example.mall.control;

import org.example.mall.pojo.Item;
import org.example.mall.service.ItemService;
import org.example.mall.util.ServerResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
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

    //@RequestMapping("/item/insert")默认是GET请求，不能携带大量数据，需修改为POST请求
    //@RequestMapping(value = "/item/insert",method = RequestMethod.POST)
    @PostMapping(value="/item/insert",consumes = "multipart/form-data")
    public ServerResult<Void> insert(Item item, MultipartFile file){
        File f = new File("D:/upload",file.getOriginalFilename());
        try {
            file.transferTo(f);
        }catch (Exception e){
            e.printStackTrace();
        }
        item.setImage(f.getName());
        try {
            itemService.insert(item);
        } catch (RuntimeException e) {
            return ServerResult.error(500,e.getMessage());
        }

        return ServerResult.success();
    }
}

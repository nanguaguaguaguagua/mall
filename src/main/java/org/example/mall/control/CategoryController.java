package org.example.mall.control;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.ibatis.annotations.Options;
import org.example.mall.pojo.Category;
import org.example.mall.service.CategoryService;
import org.example.mall.util.ServerResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品分类控制层
 * @RestController 声明这是一个控制器类，同时该控制器所有的方法全部以JSON返回数据
 * {'id':1,'name':'手机'}
 */
@RestController
@Tag(name = "商品分类接口")//一级菜单
public class CategoryController {
    @Autowired//注入业务层CategoryService对象
    private CategoryService categoryService;
    /**
     * 查询所有商品分类
     * @return
     */
    @RequestMapping("/category/selectAll")
    @Operation(summary = "查询所有商品分类")//二级菜单
    public ServerResult<List<Category>> selectAll() {
        List<Category> categories = categoryService.selectAll();
        return ServerResult.success(categories);
    }
    @RequestMapping("/category/selectById")
    @Operation(summary = "根据id查询商品分类")//二级菜单
    public ServerResult<List<Category>> selectByIdController(Integer id) {
        List<Category> categories = categoryService.selectByIdService(1);
        return ServerResult.success(categories);
    }

}

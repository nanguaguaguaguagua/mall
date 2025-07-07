package org.example.mall.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 商品封装实体类
 */
@TableName("category")
public class Category {
    //对应数据库字段id
    private Integer id;
    //对应数据库字段name
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

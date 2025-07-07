package org.example.mall.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("item")
public class Item {
    private Integer id;
    @TableField(value = "`category_id`")
    private Integer categoryId;
    private String name;
    private Integer price;
    private String image;
    @TableField(value = "`item_desc`")
    private String description;
}

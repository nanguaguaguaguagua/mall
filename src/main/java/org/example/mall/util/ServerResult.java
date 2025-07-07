package org.example.mall.util;

import lombok.Data;

/**
 * 服务器返回结果
 */
@Data
public class ServerResult<T> {
    //状态码
    private Integer code;
    //提示信息
    private String msg;
    //返回数据
    private T data;

    //针对查询
    public static<T> ServerResult<T> success(T data) {
        ServerResult<T> result = new ServerResult<T>();
        result.setCode(200);
        result.setMsg("success");
        result.setData(data);
        return result;
    }
    //针对添加、修改、删除
    public static ServerResult<Void> success() {
        return success(null);
    }
    //错误信息
    public static ServerResult<Void> error(Integer code, String msg) {
        ServerResult<Void> result = new ServerResult<Void>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}

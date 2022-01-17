package com.mzj.thebook;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    private String code;
    private String msg;
    private T data;

    public Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode("1");
        result.setMsg("成功");
        result.setData(data);
        return result;
    }

    public Result<T> error() {
        Result<T> result = new Result<>();
        result.setCode("0");
        result.setMsg("失败");
        result.setData(null);
        return result;
    }

}

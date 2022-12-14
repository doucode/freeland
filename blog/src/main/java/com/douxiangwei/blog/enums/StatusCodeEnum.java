package com.douxiangwei.blog.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusCodeEnum {
    SUCCESS(200,"操作成功"),
    FAIL(400,"操作失败");

    private final Integer code;
    private final String desc;


}

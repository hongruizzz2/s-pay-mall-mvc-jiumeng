package com.hongrui.controller.dto;

import lombok.Data;

/**
 * @author hongrui
 * @description
 * @date 2024-11-07 23:25
 */
@Data
public class CreatePayRequestDTO {

    // 用户ID 【实际产生中会通过登录模块获取，不需要透彻】
    private String userId;
    // 产品编号
    private String productId;

}

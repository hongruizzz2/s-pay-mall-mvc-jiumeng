package com.hongrui.domain.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author hongrui
 * @description
 * @date 2024-11-07 20:55
 */
@Data
public class ProductVO {

    /** 商品ID */
    private String productId;

    /** 商品名称 */
    private String productName;

    /** 商品描述 */
    private String productDesc;

    /** 商品价格 */
    private BigDecimal price;

}

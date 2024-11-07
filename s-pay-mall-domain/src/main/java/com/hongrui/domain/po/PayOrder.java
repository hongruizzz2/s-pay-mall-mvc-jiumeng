package com.hongrui.domain.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.math.BigDecimal;

/**
 * @author hongrui
 * @description
 * @date 2024-11-07 20:49
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PayOrder {

    private Long id;
    private String userId;
    private String productId;
    private String productName;
    private String orderId;
    private Date orderTime;
    private BigDecimal totalAmount;
    private String status;
    private String payUrl;
    private Date payTime;
    private Date createTime;
    private Date updateTime;

}
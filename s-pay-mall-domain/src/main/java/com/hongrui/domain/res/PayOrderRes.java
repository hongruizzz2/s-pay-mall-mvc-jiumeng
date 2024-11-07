package com.hongrui.domain.res;

import com.hongrui.common.constants.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hongrui
 * @description
 * @date 2024-11-07 20:54
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PayOrderRes {

    private String userId;

    private String orderId;

    private String payUrl;

    private Constants.OrderStatusEnum orderStatusEnum;

}

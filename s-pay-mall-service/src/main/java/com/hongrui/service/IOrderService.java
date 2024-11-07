package com.hongrui.service;

import com.hongrui.domain.req.ShopCartReq;
import com.hongrui.domain.res.PayOrderRes;

/**
 * @author hongrui
 * @description 订单服务接口
 * @date 2024-11-07 20:58
 */
public interface IOrderService {

    PayOrderRes createOrder(ShopCartReq shopCartReq) throws Exception;

}

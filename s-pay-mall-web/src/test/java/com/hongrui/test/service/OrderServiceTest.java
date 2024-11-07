package com.hongrui.test.service;

import com.hongrui.domain.req.ShopCartReq;
import com.hongrui.domain.res.PayOrderRes;
import com.hongrui.service.IOrderService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



import javax.annotation.Resource;

/**
 * @author hongrui
 * @description
 * @date 2024-11-07 22:02
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTest {

    @Resource
    private IOrderService orderService;

    @Test
    public void test_createOrder() throws Exception {
        ShopCartReq shopCartReq = new ShopCartReq();
        shopCartReq.setUserId("jiumeng");
        shopCartReq.setProductId("10003");
        PayOrderRes payOrderRes = orderService.createOrder(shopCartReq);
        log.info("请求参数:{}", JSON.toJSONString(shopCartReq));
        log.info("测试结果:{}", JSON.toJSONString(payOrderRes));
    }

}

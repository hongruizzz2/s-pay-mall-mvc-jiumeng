package com.hongrui.service.rpc;

import com.hongrui.domain.vo.ProductVO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author hongrui
 * @description
 * @date 2024-11-07 21:02
 */
@Service
public class ProductRPC {

    public ProductVO queryProductByProductId(String productId) {
        ProductVO productVO = new ProductVO();
        productVO.setProductId(productId);
        productVO.setProductName("测试商品");
        productVO.setProductDesc("这是一个测试商品");
        productVO.setPrice(new BigDecimal("1.68"));
        return productVO;
    }

}

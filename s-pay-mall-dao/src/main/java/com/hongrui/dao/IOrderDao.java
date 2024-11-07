package com.hongrui.dao;

import com.hongrui.domain.po.PayOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author hongrui
 * @description
 * @date 2024-11-07 20:57
 */
@Mapper
public interface IOrderDao {

    void insert(PayOrder payOrder);

    PayOrder queryUnPayOrder(PayOrder payOrder);

}

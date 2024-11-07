package com.hongrui.domain.res;

import lombok.Data;

/**
 * @author hongrui
 * @description
 * @date 2024-11-07 16:15
 */
@Data
public class WeixinQrCodeRes {

    private String ticket;
    private Long expire_seconds;
    private String url;

}

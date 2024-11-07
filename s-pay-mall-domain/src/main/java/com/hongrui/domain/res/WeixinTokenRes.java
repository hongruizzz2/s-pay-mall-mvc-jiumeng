package com.hongrui.domain.res;

import lombok.Data;

/**
 * @author hongrui
 * @description 获取微信登录二维码响应对象
 * @date 2024-11-07 16:15
 */
@Data
public class WeixinTokenRes {

    private String access_token;
    private int expires_in;
    private String errcode;
    private String errmsg;

}

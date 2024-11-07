package com.hongrui.service;

import java.io.IOException;

/**
 * @author hongrui
 * @description 微信服务
 * @date 2024-11-07 16:17
 */
public interface ILoginService {

    String createQrCodeTicket() throws Exception;

    String checkLogin(String ticket);

    void saveLoginState(String ticket, String openid) throws IOException;
}

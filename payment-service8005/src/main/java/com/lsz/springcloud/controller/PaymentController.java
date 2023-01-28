package com.lsz.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author lsz
 * @date 2023年01月18日 12:50
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")        //获取端口号
    private String serverPort;

    @RequestMapping("/payment/consul")
    public String paymentConsul(){
        return "springcloud with consul：" + serverPort + "\t" + UUID.randomUUID().toString();
    }

}

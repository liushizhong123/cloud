package com.lsz.springcloud.controller;

import com.lsz.springcloud.entities.CommonResult;
import com.lsz.springcloud.entities.Payment;
import com.lsz.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author lsz
 * @date 2023年01月16日 15:20
 */
@RestController
@Slf4j // 日志
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort; // 服务端口号

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.save(payment);
        log.info("插入的结果为：" + result);
        if(result > 0){
            return new CommonResult(200,"插入数据库成功，serverPort: " + serverPort,result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询的结果为：" + payment);
        if(payment != null){
            return new CommonResult(200,"查询成功，serverPort: " + serverPort,payment);
        }else {
            return new CommonResult(444,"查询库失败",null);
        }
    }
}

package com.lsz.cloud.service;

import org.springframework.stereotype.Component;

/**
 * @author lsz
 * @date 2023年01月27日 21:36
 */

//统一为接口里面的方法进行异常处理
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService\t fallback-paymentInfo_OK----";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService\t fallback-paymentInfo_TimeOut----";
    }
}

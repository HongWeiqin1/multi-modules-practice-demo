package com.hwq.serviceModule.implementation;

import com.hwq.serviceModule.ITestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImplement implements ITestService {
    /**
     * TODO：业务层测试1
     *
     * @param strParam 测试传参
     * @return String
     */
    @Override
    public String testService1(String strParam) {
        return strParam;
    }
}

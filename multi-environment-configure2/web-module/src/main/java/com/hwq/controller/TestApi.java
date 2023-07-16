package com.hwq.controller;

import com.hwq.serviceModule.ITestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(name = "", value = "/test/*")
@RestController
public class TestApi {

    private final ITestService iTestService;

    public TestApi(ITestService iTestService) {
        this.iTestService = iTestService;
    }

    /**
     * TODO: API接口
     * TODO: 【测试路径】：http://localhost:9001/test/test1?strParam=123456
     *
     * @param strParam 测试传参
     * @return String
     */
    @RequestMapping(name = "", value = "test1")
    public String test1(String strParam) {
        return iTestService.testService1(strParam);
    }

}

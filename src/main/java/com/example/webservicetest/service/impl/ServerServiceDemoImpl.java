package com.example.webservicetest.service.impl;

import com.example.webservicetest.service.ServerServiceDemo;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * @ClassName: ServerServiceDemoImpl
 * @Author: hechengyao
 * @Description:
 * @Date: Created in 16:57 2021/7/14
 * @Modified By:
 */
@Component
@WebService(name = "ServerServiceDemo", targetNamespace = "http://service.webservicetest.example.com",
        endpointInterface = "com.example.webservicetest.service.ServerServiceDemo")
public class ServerServiceDemoImpl implements ServerServiceDemo {
    @Override
    public String emrService(String data) {
        if(null == data || "".equals(data.trim())){
            return "传入的参数为空";
        }
        return "调用成功";
    }
}

package com.example.webservicetest.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @ClassName: ServerServiceDemo
 * @Author: hechengyao
 * @Description:
 * @Date: Created in 16:56 2021/7/14
 * @Modified By:
 */
@WebService(name = "ServerServiceDemo", targetNamespace = "http://service.webservicetest.example.com")
public interface ServerServiceDemo {
    @WebMethod
    String emrService(@WebParam String data);
}

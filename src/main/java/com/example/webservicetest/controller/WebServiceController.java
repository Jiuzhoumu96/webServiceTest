package com.example.webservicetest.controller;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: HeChengyao
 * @date: 2021/7/20 14:26
 */
@RestController
@RequestMapping("/abcd")
public class WebServiceController {

    @RequestMapping("/sss")
    public static void invokeService_2(){
        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8099/abc/ws/api?wsdl");
        // 需要密码的情况需要加上用户名和密码
        // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASS_WORD));
        Object[] objects = new Object[0];
        try {
            // invoke("方法名",参数1,参数2,参数3....);
            //这里注意如果是复杂参数的话，要保证复杂参数可以序列化
            objects = client.invoke("emrService", "hello world");
            System.out.println("返回数据:" + objects[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    @GetMapping("/find")
    public String findDog() throws Exception {

        String findDog = "";
        findDog = "fbawnbaewkjfnck";
        System.out.println(">>>>> findDog = " + findDog);
        return findDog;
    }

}

package com.example.webservicetest.config;

import com.example.webservicetest.service.ServerServiceDemo;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.xml.ws.Endpoint;


/**
 * @ClassName: WebServiceConfig
 * @Author: hechengyao
 * @Description:
 * @Date: Created in 16:59 2021/7/14
 * @Modified By:
 */
@Configuration
public class WebServiceConfig {

    @Autowired
    private ServerServiceDemo serverServiceDemo;

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), serverServiceDemo);
        endpoint.publish("/ws/api");
        return endpoint;
    }

}






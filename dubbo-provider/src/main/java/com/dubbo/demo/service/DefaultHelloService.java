package com.dubbo.demo.service;




import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.demo.api.HelloService;
import com.dubbo.demo.api.HelloServiceTest;

@Component
@Service(version = "1.0.0",timeout = 10000,interfaceClass = HelloService.class)
public class DefaultHelloService implements HelloService {
    

    @Reference(version = "1.0.0")
    private HelloServiceTest helloServiceTest;
    
    @Override
    public String sayHello(String name) {
        helloServiceTest.sayHelloTest("ds");
        return "Hello "+name+" !";
    }

    @Override
    public String sayGoodbye(String name) {
        helloServiceTest.sayGoodbyeTest("111");
        return "Goodbye "+name+" !";
    }
}

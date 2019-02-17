package com.demo.dubbo.test.service;




import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.demo.api.HelloServiceTest;

@Component
@Service(version = "1.0.0",timeout = 10000,interfaceClass = HelloServiceTest.class)
public class DefaultHelloServiceTest implements HelloServiceTest {
    @Override
    public void sayHelloTest(String name) {
        System.out.println("-----sayHelloTest-----");
    }

    @Override
    public void sayGoodbyeTest(String name) {
        System.out.println("-----sayGoodbyeTest-----");
    }
}

package com.simo.vsim;

import com.simo.vsim.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author alexouyang
 * @Date 2019-08-14
 */
public class MainApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        context.start();
        DemoService demoService = context.getBean("demoService", DemoService.class);
        String hello = demoService.sayHello("world");
        System.out.println("result: " + hello);
    }
}

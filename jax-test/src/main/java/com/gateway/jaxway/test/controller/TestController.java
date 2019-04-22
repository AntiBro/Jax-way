package com.gateway.jaxway.test.controller;

import com.gateway.jaxway.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author huaili
 * @Date 2019/4/10 21:09
 * @Description TODO
 **/
@RestController
public class TestController {

    @Autowired
    private Log log;
//    @RequestMapping("/testflux")
//    public Mono<String> getTest(){
//        return Mono.just("测试安全过滤器");
//    }

    @RequestMapping("/testflux")
    public String getTest(){
        log.log("调用testflux");
        return "测试安全过滤器";
    }
//
//    @GetMapping("/test")
//    public Mono<ResponseEntity<String>> proxy(ProxyExchange<String> proxy) throws Exception {
//        Mono<ResponseEntity<String>> responseEntityMono = proxy.uri("http://baidu.com").get();
////        System.out.println(responseEntityMono.doOnSuccess(e->{
////            System.out.println("内容");
////            System.out.println(e.getBody());
////        }));
//        return responseEntityMono;
//    }
}

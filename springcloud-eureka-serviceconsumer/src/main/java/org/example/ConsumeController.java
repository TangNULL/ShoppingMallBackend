package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/Hello")
public class ConsumeController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/Consumer")
    public String helloWorld(String s) {
        System.out.println("传入的值为：" + s);
        String forObject = restTemplate.getForObject("http://SERVICE-PROVIDER/Hello/World?s=" + s, String.class);
        return forObject;
    }
}


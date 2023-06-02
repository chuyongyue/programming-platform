package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @Description
 * @Author cy
 * @Date 2023/6/2 17:38
 **/
@RestController
@RequestMapping("/home")
public class HomeController {
    @RequestMapping(value="", method = GET)
    public String home(String name) {
        return "hello " + name;
    }
}

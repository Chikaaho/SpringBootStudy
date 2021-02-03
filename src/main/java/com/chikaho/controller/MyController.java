package com.chikaho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/demo")
public class MyController {

    @RequestMapping("/vue-index.html")
    public void test01(Model model) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "chika");
        map.put("age", "10");
        map.put("class", "software1");
        model.addAttribute("test-data", map);
    }

}

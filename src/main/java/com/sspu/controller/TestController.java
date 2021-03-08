package com.sspu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {


      @ResponseBody
      @RequestMapping("/test")
      String test(){

          return "this is test interface";
      }

}

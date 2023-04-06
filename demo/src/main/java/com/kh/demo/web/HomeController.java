package com.kh.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  // 초기 화면
  @GetMapping("/")
  public String home(){
    return "index";
  }
}

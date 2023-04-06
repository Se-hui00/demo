package com.kh.demo.web;

import com.kh.demo.svc.MemberSVC;
import com.kh.demo.web.from.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")

public class MemberController {

  private final MemberSVC memberSVC;

  public MemberController(MemberSVC memberSVC) {
    this.memberSVC = memberSVC;
  }

  // 회원가입 양식
  @GetMapping("/join")
  public String JoinFrom() {
    System.out.println("public String joinFrom() 호출됨");
    return "/member/join";
  }

  // 회원가입 처리
  @PostMapping("/join")
  public String join(Customer customer){
    System.out.println("public String join() 호출됨");
    System.out.println(customer.getId());
    System.out.println(customer.getName());
    System.out.println(customer.getAddress());
    System.out.println(customer.getPhone());

    memberSVC.joinMember(customer);
    return "index";
  }
}

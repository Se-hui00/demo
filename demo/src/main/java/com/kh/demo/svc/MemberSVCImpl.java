package com.kh.demo.svc;

import com.kh.demo.dao.MemberDAO;
import com.kh.demo.web.from.Customer;
import org.springframework.stereotype.Service;

@Service
public class MemberSVCImpl implements MemberSVC{

  private final MemberDAO memberDAO;

  public MemberSVCImpl(MemberDAO memberDAO) {
    this.memberDAO = memberDAO;
  }

  @Override
  public void joinMember(Customer customer) {
    memberDAO.joinMember(customer);
  }
}

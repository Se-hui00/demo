package com.kh.demo.dao;
// code -> implements methods
import com.kh.demo.web.from.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO{

  private final JdbcTemplate jdbcTemplate;

  public MemberDAOImpl(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public void joinMember(Customer customer) {

    String sql = "insert into customer values(?,?,?,?)";
    int row = jdbcTemplate.update(sql,customer.getId(),customer.getName(),customer.getAddress(),customer.getPhone());
    System.out.println("삽입한 행수=" + row);
  }
}

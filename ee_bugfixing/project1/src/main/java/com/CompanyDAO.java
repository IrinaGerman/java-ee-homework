package com;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

//@Resource//please use Resource for spring inject
@Repository
public class CompanyDAO {

  public List getAllCompanies() {
    return Arrays.asList(new Company(1, "addr1"), new Company(2, "addr2"));
  }
}

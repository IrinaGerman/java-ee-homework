package com.dao;

import com.models.Company;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyDao {

  List<Company> companyList = Arrays.asList
      (new Company("Alfa", 307456789, 123456, 260000000),
      new Company("Betta", 123456789, 302156, 260000001));

  public List<Company> getCompanyList() {
    return companyList;
  }
}

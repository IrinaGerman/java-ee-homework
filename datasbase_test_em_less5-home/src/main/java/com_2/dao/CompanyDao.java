package com_2.dao;

import com_2.models.Company;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyDao {

  List<Company> companyList = Arrays.asList
      (new Company("Alfa2", 307456789, 123456, 260000000),
          new Company("Betta2", 123456789, 302156, 260000001));

  public List<Company> getCompanyList() {
    return companyList;
  }
}

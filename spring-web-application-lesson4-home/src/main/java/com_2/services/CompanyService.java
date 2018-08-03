package com_2.services;

import com_2.dao.CompanyDao;
import com_2.models.Company;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

  @Autowired
  private CompanyDao companyDao;

  public List<Company> getCompanyList() {
    return companyDao.getCompanyList();
  }
}

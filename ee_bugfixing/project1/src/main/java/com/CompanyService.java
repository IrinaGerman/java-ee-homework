package com;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Resource //please use Resource for spring inject
@Service
public class CompanyService {

  @Autowired
  private CompanyDAO companyDAO;

  public List getAllCompanies() {
    return companyDAO.getAllCompanies();
  }
}

package com_2.services;

import com_2.dao.CompanyDao;
import com_2.dao.UserDao;
import com_2.models.UserCompany;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCompanyService {

  @Autowired
  private UserDao userDao;
  @Autowired
  private CompanyDao companyDao;

  @PostConstruct
  public List<UserCompany> getUserCompanyList() {
    List<UserCompany> userCompanyList = Arrays.asList(
        new UserCompany(userDao.getUserList().get(0), companyDao.getCompanyList().get(0)));

    return userCompanyList;
  }

}

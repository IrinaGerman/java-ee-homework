package com.controllers;

import com.models.Company;
import com.models.User;
import com.models.UserCompany;
import com.services.CompanyService;
import com.services.UserCompanyService;
import com.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user-controller" )
public class UserController {

@Autowired
  UserService userService;

  @RequestMapping(value = "/user-list", method = RequestMethod.GET)
  public @ResponseBody List<User> getAllUsers(){
    return userService.getUserList();
  }

  @Autowired
  CompanyService companyService;

  @RequestMapping("/company-list")
  public @ResponseBody List<Company> getAllCompanies(){
    return companyService.getCompanyList();
  }

  @Autowired
  UserCompanyService userCompanyService;

  @RequestMapping("/usercompany-list")
  public @ResponseBody List<UserCompany> getAllUserCompanies(){
    return userCompanyService.getUserCompanyList();
  }
}

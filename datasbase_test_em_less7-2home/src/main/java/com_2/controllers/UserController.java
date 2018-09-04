package com_2.controllers;

import com_2.models.Company;
import com_2.models.User;
import com_2.models.UserCompany;
import com_2.services.CompanyService;
import com_2.services.UserCompanyService;
import com_2.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user-controller_2")
public class UserController {

  @Autowired
  UserService userService;

  @RequestMapping(value = "/user-list_2", method = RequestMethod.GET)
  public @ResponseBody
  List<User> getAllUsers() {
    return userService.getUserList();
  }

  @Autowired
  CompanyService companyService;

  @RequestMapping("/company-list_2")
  public @ResponseBody
  List<Company> getAllCompanies() {
    return companyService.getCompanyList();
  }

  @Autowired
  UserCompanyService userCompanyService;

  @RequestMapping("/usercompany-list_2")
  public @ResponseBody
  List<UserCompany> getAllUserCompanies() {
    return userCompanyService.getUserCompanyList();
  }
}

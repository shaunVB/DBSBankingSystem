package com.dbsBank.trial.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.dbsBank.trial.demo.model.BankAdminLogin;
import com.dbsBank.trial.demo.service.BankAdminLoginServiceImpl;
import com.dbsBank.trial.demo.service.BankAdminService;

@RestController
public class BankAdminLoginController {
	@Autowired
	private BankAdminService service;
	@RequestMapping(value="/bankAdmin/login",method=RequestMethod.POST)
	public BankAdminLogin createBankAdmin(BankAdminLogin newbnkAdmin)
	{
		System.out.println(newbnkAdmin.toString());
		BankAdminLoginServiceImpl balsi=new BankAdminLoginServiceImpl();
		balsi.htmlName=newbnkAdmin.getUsername();
		balsi.htmlPass=newbnkAdmin.getPassword();
		System.out.println(balsi.htmlName+":"+balsi.htmlPass);
		return service.addBankAdmin(newbnkAdmin);
		
	}
	
}

package com.pinyougou.manager.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.context.SecurityContextHolder;

@RestController
@RequestMapping("/login")
public class LoginController {
	@RequestMapping("name")
	public Map<String, String> name(){
		String name=SecurityContextHolder.getContext()
.getAuthentication().getName();
		Map<String, String> map=new HashMap<String, String>();
		map.put("loginName", name);
		return map ;
	}	
}
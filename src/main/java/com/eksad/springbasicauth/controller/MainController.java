package com.eksad.springbasicauth.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class MainController 
{
	@RequestMapping("admin")
	public HashMap<String, Object> admin()
	{
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("message", "masuk sebagai admin");
		return map;
	}
}

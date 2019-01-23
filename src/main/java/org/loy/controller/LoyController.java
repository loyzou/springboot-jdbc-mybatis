package org.loy.controller;

import org.loy.common.context.LoyResult;
import org.loy.service.LoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoyController {
	@Autowired
	private LoyService loyService;
	
	@RequestMapping("/query")
	public LoyResult query(){
		LoyResult result = new LoyResult();
		result = loyService.query();
		return result;
	}
}

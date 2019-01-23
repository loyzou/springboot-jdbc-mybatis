package org.loy.service;

import java.util.List;
import java.util.Map;

import org.loy.common.context.LoyResult;
import org.loy.mapper.LoyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoyService {
	@Autowired
	private LoyMapper loyMapper;
	
	public LoyResult query(){
		List<Map<String,Object>> list = loyMapper.query();
		LoyResult loyResult = new LoyResult();
		loyResult.setRows(list);
		return loyResult;
	}

}

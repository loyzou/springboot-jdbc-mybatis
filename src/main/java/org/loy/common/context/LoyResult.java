package org.loy.common.context;

import java.util.List;
import java.util.Map;

public class LoyResult {

	private List<Map<String,Object>> rows;

	public void setRows(List<Map<String, Object>> rows){
		this.rows = rows;
	}

	public List<Map<String,Object>> getRows(){
		return rows;
	}

}

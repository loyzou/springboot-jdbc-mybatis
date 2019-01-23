package org.loy.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface LoyMapper {
	public List<Map<String,Object>> query();
}	

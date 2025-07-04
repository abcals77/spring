package com.yedam.app.dept.mapper;

import java.util.List;

import com.yedam.app.dept.service.DeptVO;

public interface DeptMapper {

	public List<DeptVO> selectAll();
	
	public DeptVO selectInfo(DeptVO edptVO);
	
	public int insertInfo(DeptVO deptVO);
}

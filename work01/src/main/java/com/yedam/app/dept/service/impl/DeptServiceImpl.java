package com.yedam.app.dept.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.app.dept.mapper.DeptMapper;
import com.yedam.app.dept.service.DeptService;
import com.yedam.app.dept.service.DeptVO;

@Service
public class DeptServiceImpl implements DeptService {
	
	private DeptMapper deptMapper;
	
	@Autowired
	public DeptServiceImpl(DeptMapper deptMapper) {
		this.deptMapper = deptMapper;
	}
	
	
	@Override
	public List<DeptVO> findAllList() {

		return deptMapper.selectAll();
	}

	@Override
	public DeptVO findInfoById(DeptVO deptVO) {

		return deptMapper.selectInfo(deptVO);
	}

	@Override
	public int createInfo(DeptVO deptVO) {
		int result = deptMapper.insertInfo(deptVO);
		return result == 1 ? deptVO.getDepartmentId() : -1;
	}

}

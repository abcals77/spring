package com.yedam.app.dept.service;

import java.util.List;



public interface DeptService {
	// 전체 부서정보 조회
	public List<DeptVO> findAllList();
	// 부서정보 단건 조회
	public DeptVO findInfoById(DeptVO deptVO);
	// 부서정보 단건 등록
	public int createInfo(DeptVO deptVO);
}

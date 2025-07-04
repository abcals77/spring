package com.yedam.app.emp.mapper;
//		com.yedam.app.**.mapper
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.app.emp.service.EmpVO;

public interface EmpMapper {
	// Mapper 골격
	// 전체조회
	public List<EmpVO> selectAll();
	
	// 단건조회
	public EmpVO selectInfo(EmpVO empVO);
	
	// 등록
	public int insertInfo(EmpVO empVO);
	
	// 수정 Param 안에 변수는 xml 안에서 사용
	public int updateInfo(@Param("id")int eid, @Param("info")EmpVO empVO);
	
	// 삭제
	public int deleteInfo(int employeeid);
	
	
}

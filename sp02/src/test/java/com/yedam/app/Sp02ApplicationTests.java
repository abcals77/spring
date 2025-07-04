package com.yedam.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yedam.app.emp.mapper.EmpMapper;
import com.yedam.app.emp.service.EmpVO;

@SpringBootTest
class Sp02ApplicationTests {
	
	@Autowired // 필드주입 : 테스트용
	private EmpMapper empMapper;
	
	//@Test // 해당 메서드를 테스트하겠다고 선언!
	public void selectAll() {
		List<EmpVO> list = empMapper.selectAll();
		for(EmpVO emp : list) {
			System.out.println(emp.getLastName());
		}
		assertTrue(!list.isEmpty()); // 값이 없어도 true 반환
	}
	
	//@Test
	public void selectOne() {
		// Builder하는 일 1. 인스턴스 생성 2. field init 초기화 => 필요한 값을 인식 후 생성자 생성
		EmpVO emp = EmpVO.builder() // start
							.employeeId(100) // build 세팅값
							.build(); // end
		
		EmpVO findVO = empMapper.selectInfo(emp);
		System.out.println(findVO);
		
		assertEquals("King", findVO.getLastName());
		
	}
	
	//@Test
	public void insertValue() {
		EmpVO emp = EmpVO.builder()
							.employeeId(1000)
							.lastName("Kang")
							.email("kg@google.com")
							.jobId("SA_REP") // emp-map.xml sql문과 순서가 같아야함
							.build();
		
		int result = empMapper.insertInfo(emp);
		assertEquals(1, result);	
	}
	//@Test
	public void insertSelectKey() {
		EmpVO emp = EmpVO.builder()
							.lastName("Hong")
							.email("hong@naver.com")
							.jobId("IT_PROG")
							.salary(1200)
							.build();
		
		int result = empMapper.insertInfo(emp);
		System.out.println("사원번호 : " + emp.getEmployeeId());
		assertEquals(1, result);
	}
	@Test
	public void updateInfo() {
		// 1) 단건조회
		EmpVO emp = EmpVO.builder()
							.employeeId(1001)
							.build();
		EmpVO findVO = empMapper.selectInfo(emp);
		// 2) 변경값 업데이트
		findVO.setSalary(2550);
		// 3) 테이블에 업데이트
		int result = empMapper.updateInfo(1001, findVO);
		
		assertEquals(1, result);
		
	}
	
	
	
}

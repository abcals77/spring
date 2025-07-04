package com.yedam.app.emp.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder // 지금 만드는 클래스 초기값 세팅
@AllArgsConstructor
@NoArgsConstructor // @Builder 시 생략되므로 명시적으로 추가
public class EmpVO {
	// private Integer employee_id; -> mybaits에 값을 가져올 때 기본값
	private Integer employeeId; // -> mybatis.configuration.map-underscore-to-camel-case=true
	private String lastName;
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd") // 단일 포맷만 처리함
	private Date hireDate;
	private String jobId;
	private double salary;
	
	
}
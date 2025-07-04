package com.yedam.app.dept.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yedam.app.dept.service.DeptService;
import com.yedam.app.dept.service.DeptVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class DeptController {
	private final DeptService deptService;
	

	@GetMapping("deptList")
	public String deptList(Model model) {
		List<DeptVO> list = deptService.findAllList();
		model.addAttribute("depts", list);
		
		return "dept/list";
	}
	
	@GetMapping("deptInfo")
	public String deptInfo(DeptVO deptVO, Model model) {
		DeptVO findVO = deptService.findInfoById(deptVO);
		model.addAttribute("dept", findVO);
		return "dept/info";
	}
	
	@GetMapping("deptInsert")
	public String deptInsertForm() {
		return "dept/insert";
	}
}

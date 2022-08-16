package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
	
	 @RequestMapping("/employee")
	 public String displayEmployee(@RequestParam("empNo") String empNo,@RequestParam("eName") String eName,@RequestParam("designation") String designation, @RequestParam("salary") String salary, Model m){
		 
		  m.addAttribute("eId", empNo);
	      m.addAttribute("empName", eName);
	      m.addAttribute("des", designation);
	      m.addAttribute("sal", salary);

		  return "employeeview";
	  }

	
}

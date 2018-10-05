package com.singahnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.singahnd.entity.Student;
import com.singahnd.service.StudentService;

/**
 ************************************************* 
 * @ClassName: StudentController
 * @Description: TODO(学生控制类)
 * @author mjy
 * @date 2018年5月24日 下午2:42:22
 ************************************************
 */
@RestController
@RequestMapping(value = "student", method = RequestMethod.POST)
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "inserStudent")
	public String inserStudent(@RequestBody Student student) {
		boolean inserStudentOne = studentService.inserStudentOne(student);
		if (inserStudentOne) {
			return "成功";
		} else {
			return "失败";
		}
	}

	@RequestMapping(value = "queryStudent")
	public Student queryStudent(@RequestBody Student student) {

		return studentService.queryStudentById(student.getStudentId());

	}
}

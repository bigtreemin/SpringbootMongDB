package com.singahnd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.DBObject;
import com.singahnd.db.StudentDB;
import com.singahnd.entity.Student;
/**
 ************************************************* 
 * @ClassName: StudentService 
 * @Description: TODO(学生服务类) 
 * @author mjy
 * @date 2018年5月24日 下午2:39:24 
 ************************************************
 */
@Service
public class StudentService {

	@Autowired
	private StudentDB studentDB;
	
	public boolean inserStudentOne(Student student){
		boolean b = true;
		try {
			studentDB.inserStudentOne("student", student);
		} catch (Exception e) {
			e.printStackTrace();
			b = false;
		}
		return b;
	}
	/**
	 ********************************************************* 
	 * @method: queryStudentById 
	 * @Description: TODO(更新id查询学对象) 
	 * @Param  studentId
	 * @return Student 
	 * @author mjy
	 *********************************************************
	 */
	public Student queryStudentById(String studentId){
		Student student = new Student();
		try {
			DBObject result = studentDB.queryStudentById("student", studentId);
			student.setStudentId(result.get("studentId").toString());
			student.setStudentName(result.get("studentName").toString());
			student.setAge(Integer.valueOf(result.get("age").toString()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}
}

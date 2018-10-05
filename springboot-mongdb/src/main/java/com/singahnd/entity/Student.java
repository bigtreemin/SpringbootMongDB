package com.singahnd.entity;
/**
 ************************************************* 
 * @ClassName: Student 
 * @Description: TODO(学生实体类) 
 * @author mjy
 * @date 2018年5月24日 下午2:34:26 
 ************************************************
 */
public class Student {
	
	private String studentId;
	
	private String studentName;
	
	private Integer age;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}

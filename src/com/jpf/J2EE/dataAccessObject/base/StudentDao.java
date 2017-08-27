package com.jpf.J2EE.dataAccessObject.base;

import java.util.List;

/**
 * 创建数据访问对象接口
 * 
 * @author Administrator
 *
 */
public interface  StudentDao {
	public List<Student> getAllStudents();

	public Student getStudent(int rollNo);

	public void updateStudent(Student student);

	public void deleteStudent(Student student);
}

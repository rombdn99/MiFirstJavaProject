package com.netmind.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.netmind.model.Student;

public class StudentDao {

	private static List<Student> studentList = null;
	private static FileManagerDao fileManager = null;

	static {
		studentList = new ArrayList<Student>(); // Así se hace correctamente
		fileManager = new FileManagerDao();
	}

	public boolean add(Student student) throws IOException {
		studentList.add(student);
		return true;
	}
	
	public boolean addToFile(Student student) throws IOException {
		try {
			fileManager.addToTxt(student);
		} catch (IOException e) {
			throw e;
		}
		return true;
	}
	
}

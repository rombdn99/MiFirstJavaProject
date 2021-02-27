package com.netmind.business;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import com.netmind.dao.FileManagerDao;
import com.netmind.dao.StudentDao;
import com.netmind.model.Student;

public class StudentBl {
	StudentDao studentDao = new StudentDao();
	FileManagerDao fileManagerDao = new FileManagerDao();

	public boolean add(Student student) {

		student.setAge(calculateAge(student.getDateOfBirth()));
		
		try {
			studentDao.add(student);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public int calculateAge(LocalDate birth) {
		int age;
		age = Period.between(birth,
				LocalDate.now()).getYears();
		return age;
	}

	
}

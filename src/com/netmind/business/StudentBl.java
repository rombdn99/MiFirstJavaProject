package com.netmind.business;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

import com.netmind.dao.StudentDao;
import com.netmind.model.Student;

public class StudentBl {

	public boolean add(Student student) {
		Period age;

		StudentDao studentDao = new StudentDao();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String birthDateString = sdf.format(student.getDateOfBirth());
		age = Period.between(LocalDate.parse(birthDateString), LocalDate.now());

		student.setAge(age.getYears());
		return studentDao.add(student);

	}

}

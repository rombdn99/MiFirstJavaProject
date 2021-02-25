package com.netmind.business;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import com.netmind.dao.StudentDao;
import com.netmind.model.Student;

public class StudentBl {

	public boolean add(Student student) {
		StudentDao studentDao = new StudentDao();
		student.setAge(calculateAge(student.getDateOfBirth()));
		return studentDao.add(student);
	}

	public int calculateAge(Date birth) {
		int age;
		age = Period.between(
				birth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
				LocalDate.now()).getYears();
		return age;
	}

	public int maximunStudentAge() {
		int max = 0;
		String[] students = StudentDao.readFile().split(";");
		for (int i = 0; i < students.length; i++) {
			if (max < Integer.parseInt(students[i].split(",")[3])) {
				max = Integer.parseInt(students[i].split(",")[3]);
			}
		}
		return max;
	}

	public int calculateId() {
		int id = 0;
		return id;
	}
}

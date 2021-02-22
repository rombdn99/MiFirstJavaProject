package com.netmind.dao;

import java.util.ArrayList;

import com.netmind.model.Student;

public class StudentDao {
	static ArrayList<Student> studentList = new ArrayList<Student>();

	public boolean add(Student student) {
		
			studentList.add(student);
			return true;
		

		// Crearemos un unico ArrayList y agregamos el estudent en el arraylist
		/*
		 * Se agrega el student a un arraylist si no se produce ningun error se
		 * devuelve true
		 */

	}
}

package com.netmind.presentation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.netmind.business.StudentBl;
import com.netmind.model.Student;

public class Menu {
	public int menuPrincipal(Scanner sc) {
		System.out.println("Que opcion quiere seleccionar?");
		System.out.println("1. Agregar un nuevo estudiante");
		System.out.println("2. Calcular el estudiante con mayor edad");
		System.out
				.println("3. Calcular la media de edad de todos los estudiantes");
		System.out.println("4. Salir");
		int option = Integer.parseInt(sc.nextLine());
		return option;

	}

	public void menuAddStudent(Scanner sc) {
		StudentBl studentBl = new StudentBl();
		Student student = new Student();
		String dateOfBirth;
		System.out.println("Introduce tu nombre");
		student.setName(sc.nextLine());
		System.out.println("Introduce tu Apellido");
		student.setSurname(sc.nextLine());
		System.out.println("Introduce tu Fecha de nacimiento (dd/MM/yyyy):");
		dateOfBirth = sc.nextLine();

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			student.setDateOfBirth(sdf.parse(dateOfBirth));
			studentBl.add(student);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

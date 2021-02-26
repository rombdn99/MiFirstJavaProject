package com.netmind.presentation;

import java.util.Scanner;

import com.netmind.business.StudentBl;
import com.netmind.model.EnumStudent;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentBl studentBl = new StudentBl();
		Menu menus = new Menu();
		EnumStudent option;
		boolean exit = true;
		do {
			option = EnumStudent.values()[menus.menuPrincipal(sc)];
			switch (option) {
			case ADD_STUDENT:
				menus.menuAddStudent(sc);
				break;
			case OLDEST_STUDENT:
				System.out.print("La edad maxima de los estudiantes es ");
				System.out.println(studentBl.maximunStudentAge());
				break;
			case READ_STUDENTFILE:
				System.out.println(studentBl.readFile());
				break;
			default:
				exit = false;
				break;
			}

		} while (exit);
		sc.close();

	}
}

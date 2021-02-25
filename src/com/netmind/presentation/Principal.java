package com.netmind.presentation;

import java.util.Scanner;

import com.netmind.business.StudentBl;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentBl studentBl = new StudentBl();
		Menu menus = new Menu();
		boolean exit = true;
		do {

			switch (menus.menuPrincipal(sc)) {
			case 1:
				menus.menuAddStudent(sc);
				break;
			case 2:
				System.out.print("La edad maxima de los estudiantes es ");
				System.out.println(studentBl.maximunStudentAge());
				break;
			default:
				exit = false;

			}

		} while (exit);
		sc.close();

	}
}

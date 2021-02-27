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
			case EXIT:
				System.out.print("Good Bye!!");
				exit = false;
				break;
			default:
				System.out.print("Error: No has introducido el valor correcto");
				exit = true;
				break;
			}

		} while (exit);
		sc.close();

	}
}

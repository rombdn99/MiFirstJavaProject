package com.netmind.presentation;

import java.util.Scanner;

import com.netmind.business.StudentBl;
import com.netmind.dao.StudentDao;
import com.netmind.model.Student;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		StudentBl studentBl = new StudentBl();
		StudentDao studentdao = new StudentDao();
		Menu menus = new Menu();
		int day, month, year, useroption;
		boolean exit = true;
		String birth;
		/*
		 * Que opcion quiere seleccionar 1. Agregar un nuevo estudiante 2.
		 * Calcular el estudiante con mayor edad 3. Calcular la media de edad de
		 * todos los estudiantes 4. Salir
		 * 
		 * Si apreta un 1 tendra que ir a un menu que pregunte: nombre del
		 * estudiante apellido del estudiante ...
		 * 
		 * Este estudiante lo guardaremos en uin Arraylist en la capa DAO
		 * guardar se calculara la edad del alumno a partir de la fecha
		 */

		/*
		 * 1. pantalla de presentacion pregunando si queremos insertar un nuevo
		 * alumno. si es asi nos preguntara por los datos del alumno. esto se
		 * realiza en la clase principal.java, pero te puedes ayudar con otras
		 * clases que tu consideres
		 */
		do {

			switch (menus.menuPrincipal()) {
			case 1:
				menus.menuAddStudent();
				break;
			case 2:
				studentdao.readFile();
				break;
			default:
				exit = false;

			}

		} while (exit);
		sc.close();

	}
}

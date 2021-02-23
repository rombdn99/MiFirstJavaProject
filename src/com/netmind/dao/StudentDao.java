package com.netmind.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.netmind.model.Student;

public class StudentDao {

	private static ArrayList<Student> studentList = null;
	private static String fileLocation;
	private static File file;
	static {
		studentList = new ArrayList<Student>(); // Así se hace correctamente
		fileLocation = "prueba.txt";
		file = new File("StudentList.txt");
	}

	public boolean add(Student student) {
		try {

			if (!file.exists()) {
				file.createNewFile();
				file.deleteOnExit();
			}
			FileWriter writer = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			student.setIdStudent(studentList.size() + 1);
			studentList.add(student);
			bufferedWriter.write(student.toString());
			bufferedWriter.newLine();
			bufferedWriter.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		// Crearemos un unico ArrayList y agregamos el estudent en el arraylist
		/*
		 * Se agrega el student a un arraylist si no se produce ningun error se
		 * devuelve true
		 */

	}

	public static void readList() {
		System.out.println(studentList.size());
		for (int iterator = 0; iterator < studentList.size(); iterator++) {
			System.out.println(studentList.get(iterator));
		}
	}

	public static void readFile() {
		try {
			FileReader reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void writeFile() {
		try {
			FileWriter writer = new FileWriter("MyFile.txt", true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);

			bufferedWriter.write("Hello World");
			bufferedWriter.newLine();
			bufferedWriter.write("See You Again!");

			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

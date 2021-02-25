package com.netmind.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.netmind.model.Student;

public class StudentDao {

	private static List<Student> studentList = null;
	private static File file;

	static {
		studentList = new ArrayList<Student>(); // Así se hace correctamente
		file = new File("StudentList.txt");
	}

	public boolean add(Student student) {
		studentList.add(student);
		return true;
	}

	public boolean addToTxt(Student student) {
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter writer = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(student.toFileFormat());
			bufferedWriter.newLine();
			bufferedWriter.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static void readList() {
		System.out.println(studentList.size());
		for (int iterator = 0; iterator < studentList.size(); iterator++) {
			System.out.println(studentList.get(iterator));
		}
	}

	public static String readFile() {
		try {
			FileReader reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			StringBuilder builder = new StringBuilder();
			while ((line = bufferedReader.readLine()) != null) {
				builder.append(line);
			}
			reader.close();
			return builder.toString();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}

	}

	public static void writeFile() {
		try {
			FileWriter writer = new FileWriter(file, true);
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

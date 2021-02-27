package com.netmind.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.netmind.model.Student;

public class FileManagerDao {

	private static File file;

	static {
		file = new File("StudentList.csv");
	}

	public boolean addToTxt(Student student) throws IOException {
		try (FileWriter writer = new FileWriter(file, true);
				BufferedWriter bufferedWriter = new BufferedWriter(writer);) {
			createfile();

			bufferedWriter.write(student.toFileFormat());
			bufferedWriter.newLine();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void createfile() {
		if (!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
}

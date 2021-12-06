package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readSymptomDataFromFile {

	public ArrayList<String> printSymptoms(String file, ArrayList<String> listSymptoms) {

		/*
		 * Loop for read data file and put data in list listSymptoms with the class
		 * BufferedReader
		 */
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));

			String line;
			while ((line = reader.readLine()) != null) {
				listSymptoms.add(line);
			}
			reader.close();

		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		return listSymptoms;
	}
}

package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @autor maxime lanca
 */
public class ReadSymptomDataFromFileImpl {
	/**
	 *
	 * @param file refer to the file "symptoms.txt"
	 * @return listOfSymptoms is the list of symptoms comes from the file symptoms.txt
	 */
	public List<String> toReadFile(String file) {

		List<String> listOfSymptoms = new ArrayList<String>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			String line;
			while ((line = reader.readLine()) != null) {
				listOfSymptoms.add(line);
			}
			reader.close();

		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		return listOfSymptoms;
	}
}

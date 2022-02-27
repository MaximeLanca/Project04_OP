package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @autor maxime lanca
 */
public class ReadSymptomDataFromFileImpl implements ReadSymptomDataFromFile{
	/**
	 * Instantiate a new list for treatment of symptoms
	 * @param file refer to the file "symptoms.txt"
	 * @return the list of symptoms comes from the file symptoms.txt
	 * @throws IOException if file does not exist
	 */
	public List<String> toReadFile(String file) throws IOException {

		List<String> listOfSymptoms = new ArrayList<String>();

			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			String line;
			while ((line = reader.readLine()) != null) {
				listOfSymptoms.add(line);
			}

			reader.close();

		return listOfSymptoms;
	}
}

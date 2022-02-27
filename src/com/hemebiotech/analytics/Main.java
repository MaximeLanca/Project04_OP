package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

/**
 * The main class will lead the program's behavior
 * @autor maxime lanca
 * @see "note_importante"
 */
public class Main {
	/**
	 *
	 * @throws IOException if the instantiations of class aren't valid
	 */
	public static void main(String[] args) throws IOException {

		String fileOfSymptoms = "./symptoms.txt";

		try {

			ReadSymptomDataFromFile read = new ReadSymptomDataFromFileImpl();
			List<String> listSymptoms = read.toReadFile(fileOfSymptoms);

			AnalyticsCounter treemapForToSort = new AnalyticsCounterImpl();
			treemapForToSort.toSortSymptoms(listSymptoms);

		} catch (IndexOutOfBoundsException e) {
			System.err.println("Caught IndexOutOfBoundsException: " + e.getMessage());
		}
		finally {
			System.out.println("processing completed.");
		}
	}
}
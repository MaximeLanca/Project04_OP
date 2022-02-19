package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

/**
 * @autor maxime lanca
 */
public class Main {

	public static void main(String[] args) throws IOException {

		String fileOfSymptoms = "./symptoms.txt";

		try {

			ReadSymptomDataFromFileImpl read = new ReadSymptomDataFromFileImpl();
			List<String> listSymptoms = read.toReadFile(fileOfSymptoms);

			AnalyticsCounterImpl treemapForToSort = new AnalyticsCounterImpl();
			treemapForToSort.toSortSymptoms(listSymptoms);

		} catch (IndexOutOfBoundsException e) {
			System.err.println("Caught IndexOutOfBoundsException: " + e.getMessage());
		}
		finally {
			System.out.println("processing completed.");
		}
	}
}
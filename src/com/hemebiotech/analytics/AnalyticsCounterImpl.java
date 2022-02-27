package com.hemebiotech.analytics;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @autor maxime lanca
 */
public class AnalyticsCounterImpl implements AnalyticsCounter {
	/**
	 *Instantiate a new list. It's uses a treemap for to sort data from to list of symptoms.
	 *Then, it's creates file "results.out" who will be saved in the root of the project
	 * Also, open windows with the result of the program.
	 * @param symptoms refers to list of symptoms
	 * @throws IOException if the file exist (result.out)
	 */
	public void toSortSymptoms(List<String> symptoms) throws IOException {

		TreeMap<String, Integer> treemapForSymptoms = new TreeMap<String, Integer>();

		for (String firstStringSymptoms : symptoms) {

			if (treemapForSymptoms.get(firstStringSymptoms) != null) {
				Integer value = treemapForSymptoms.get(firstStringSymptoms);
				value++;
				treemapForSymptoms.put(firstStringSymptoms, value);

			} else {
				treemapForSymptoms.put(firstStringSymptoms, 1);
			}
		}

		File file = new File("./results.out.txt");

		BufferedWriter writer = new BufferedWriter(new FileWriter(file));

		String newLigne=System.getProperty("line.separator");
		
		for (Map.Entry<String, Integer> entry : treemapForSymptoms.entrySet()) {
			writer.write(entry.getKey() + "=" + entry.getValue() + newLigne);
		}
		writer.close();

		Desktop openFile = Desktop.getDesktop();
		if(file.exists())
			openFile.open(file);
	}
}

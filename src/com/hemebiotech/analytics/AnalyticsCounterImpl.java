package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * maxime lanca
 */
public class AnalyticsCounterImpl implements AnalyticsCounter {
	/**
	 *
	 * @param symptoms refers to list of symptoms
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
	}
}

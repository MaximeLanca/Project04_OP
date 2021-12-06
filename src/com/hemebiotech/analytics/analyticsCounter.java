package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class analyticsCounter {

	public TreeMap<String, Integer> BigMap(ArrayList<String> Symptoms) {

		TreeMap<String, Integer> mapForSymptoms = new TreeMap<String, Integer>();
		/*
		 * use loop to put symptoms in stringFirst StringSymptoms 
		 */
		for (String FirstStringSymptoms : Symptoms) {
			
		/*
		 * to avoid having null data in the treemap, we use condition with "if" which makes
		 * it possible to establish this condition.
		 * if the condition is valid, this will increment variable value and put symptom in the treemap.
		 */
			if (mapForSymptoms.get(FirstStringSymptoms) != null) {
				Integer value = mapForSymptoms.get(FirstStringSymptoms);
				value++;
				mapForSymptoms.put(FirstStringSymptoms, value);
				
		/*
		 * if the condition is'nt valid, variable "value" take value of 1
		 */
			} else {
				mapForSymptoms.put(FirstStringSymptoms, 1);
			}
		}
		return mapForSymptoms;
	}

	public void counter(TreeMap<String, Integer> lineForNextClasstwo) throws IOException {

		/*
		 * Create new file "result.out"
		 */
		File file = new File("C:\\Users\\maxim\\eclipse-workspace\\results.out.txt");
		
		/*
		 * Write symptoms in the file with BufferedWriter class
		 */
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		
		/*
		 * use line separator with string "newLine"
		 */
		String newLigne=System.getProperty("line.separator");
		
		for (Map.Entry<String, Integer> entry : lineForNextClasstwo.entrySet()) {
			writer.write("Symptoms:" + entry.getKey() + "." + " Occurences:" + entry.getValue() + newLigne);
		}
		writer.close();
	}
}

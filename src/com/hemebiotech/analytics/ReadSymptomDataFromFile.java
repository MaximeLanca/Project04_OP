package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

/**
 * Interface ReadSymptomDataFromFile define methods for class implemented
 * @autor maxime lanca
 */
public interface ReadSymptomDataFromFile {
	/**
	 *
	 * @param file refers to the file "symptoms.txt"
	 */
	public List<String> toReadFile(String file) throws IOException;

}

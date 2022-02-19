package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

/**
 * @autor maxime lanca
 */
public interface AnalyticsCounter {
	/**
	 *
	 * @param symptoms refer to list of symptoms
	 */
	public void toSortSymptoms(List<String> symptoms) throws IOException;
}

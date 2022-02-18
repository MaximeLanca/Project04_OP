package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public interface AnalyticsCounter {

	public TreeMap<String, Integer> bigMap(List<String> symptoms);
	
	public void counter(TreeMap<String, Integer> lineForNextClasstwo) throws IOException ;
	
}

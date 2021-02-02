package org.fujitsu.training.codes.inner;

import java.util.ArrayList;

public class MyFilter {

	public static String[] filter (String []a, Filter f) {
		ArrayList <String> removedNull = new ArrayList<String>();
		String[] valid = new String[a.length];
		int count = 0;
		
		for(int i = 0; i <a.length; i++) {
			if(f.accept(a[i])==true) {
				valid[count] = a[i];
				++count;
			}
		}
		
		 for (String i : valid) {
			 if (i != null) {
			         removedNull.add(i);
			 }
		 }
		 return removedNull.toArray(new String[0]);	
	}
}	
	

interface Filter{
		boolean accept(String x);
	}


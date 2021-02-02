package org.fujitsu.training.codes.inner;

import java.util.ArrayList;
import java.util.Iterator;

public class CoffeeCupIterator <T> implements CoffeeCup {
	
	private CoffeeCup myCup;
	
	public boolean hasNext() {
		return false;
		
	}
	

}

interface CoffeeCup{
	
	public static final ArrayList innerObjects = new ArrayList();
	
	public void add(Object o);
	
	public Iterator getIteration();
	
	ArrayList getObjects();
	
	public String toString();
	}
	
	
	
	

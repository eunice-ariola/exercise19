package org.fujitsu.training.codes.enums;

public class TestElements {
	
	public static void main (String[] args) {
		
		for(AlkaliMetals el : AlkaliMetals.values()) { // output values of Alkali Metals
			System.out.println(el.toString());
			
		}
		System.out.println();
		
		for(TransitionMetals el : TransitionMetals.values()) { // output values of Transition Metals
			System.out.println(el.toString());
			
		}
		System.out.println();
		
		for(Metals el : Metals.values()) { // output values Metals
			System.out.println(el.toString());
			
		}
		System.out.println();
	}

}

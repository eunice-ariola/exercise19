package org.fujitsu.training.codes.inner;

public class TestMyFilter {

	public static void main(String[] args) {
		
		String [] test = {"2yrs","cry","tears","anna","zero","hard","blank","low", "level","has"};
	
		
		//Filter 1: strings with at most 3 characters
		Filter f1 = new Filter() {

			@Override
			public boolean accept(String x) {
				int count = 0;
				boolean result = true;
				for(int i = 0; i < x.length(); i++) {    
					if(x.charAt(i) != ' ') {    
						count++; 
					}if(count <= 3) {
							result = true;
						}else {
							result = false;
						}
					}return result;
				}
		};
			
		//output result of filter 1
		String result1[] = MyFilter.filter(test,f1);
		System.out.print("Filter 1: ");
		for(String i : result1) {
			System.out.printf("%s ",i);
		}System.out.println();
		
		
		//Filter 2: strings that end with 's'
		Filter f2 = new Filter() {

			@Override
			public boolean accept(String x) {
				char last = x.charAt(x.length()-1);
				
				if(last == 's') {
					return true;
				}else {
					return false;
				}
			}
		};
		
		//output result of filter 2
		String result2[] = MyFilter.filter(test,f2);
		System.out.print("Filter 2: ");
		for(String i : result2) {
			System.out.printf("%s ",i);
		}System.out.println();
		
		
		//Filter 3: strings that are palindromes
		Filter f3 = new Filter() {

			@Override
			public boolean accept(String x) {
				int size = x.length();
				boolean cond = true;
				for(int beginIndex = 0; beginIndex < size; beginIndex++)
		        {
		            if(x.charAt(beginIndex) != x.charAt(size-1-beginIndex)) {
		               cond = false;
		            }else {
		            	cond = true;
		            }
		        }
				return cond;
			  }
		};
		
		//output result of filter 3
		String result3[] = MyFilter.filter(test,f3);
		System.out.print("Filter 3: ");
		for(String i : result3) {
			System.out.printf("%s ",i);
		}System.out.println();
				
		
		//Filter 4: strings that are starts with numbers
		Filter f4 = new Filter() {

			@Override
			public boolean accept(String x) {
				char first = x.charAt(0);
				if(first >= '0' && first <= '9') {
					return true;
				}else {
					return false;
				}
			}
		};
		
		//output result of filter 4
		String result4[] = MyFilter.filter(test,f4);
		System.out.print("Filter 4: ");
		for(String i : result4) {
			System.out.printf("%s ",i);
		}System.out.println();
		
		
		//Filter 5: strings that have odd number of characters
		Filter f5 = new Filter() {

			@Override
			public boolean accept(String x) {
				char [] word = x.toCharArray();
				if(word.length % 2 != 0) {
					return true;
				}else {
					return false;
				}
			}
		};
		
		//output result of filter 5
		String result5[] = MyFilter.filter(test,f5);
		System.out.print("Filter 5: ");
		for(String i : result5) {
			System.out.printf("%s ",i);
		}System.out.println();
				

	}

}

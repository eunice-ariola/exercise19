package org.fujitsu.training.codes.enums;

public enum AlkaliMetals {
	
	Li("Lithium", "Li", 3),
	Na("Sodium", "Na", 11),
	K("Potassium", "K", 11),
	Rb("Rubidum", "Rb", 37),
	Cs("Caesium", "Cs", 55),
	Fr("Francium", "Fr", 87);
	
	private String name;
	private String symbol;
	private Integer atomicNum;
	
	private AlkaliMetals(String name, String symbol, Integer atomicNum) {
		this.name = name;
		this.symbol = symbol;
		this.atomicNum = atomicNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Integer getAtomicNum() {
		return atomicNum;
	}

	public void setAtomicNum(Integer atomicNum) {
		this.atomicNum = atomicNum;
	}
	
	@Override
	public String toString() {
		
		return String.join(" ", symbol+": ", name+" with atomic number", atomicNum+". It is an Alkali metal.");
	}

}

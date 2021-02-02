package org.fujitsu.training.codes.enums;

public enum Metals {
	
	Al("Aluminum","Al",13),
	Ga("Gallium", "Ga", 31),
	Ge("Germanium", "Ge", 32),
	In("Indium", "Ir", 49),
	Sn("Tin", "Sn", 50),
	Sb("Antimony", "Sb", 51),
	Tl("Thallium","Tl",81),
	Pb("Lead","Pb",82),
	Bi("Bismuth", "Bi", 83),
	Po("Polonium", "Po", 84),
	Nh("Nihonium", "Nh", 113),
	Fl("Flerovium", "Fl", 114),
	Mc("Moscovium", "Mc", 115),
	Lv("Livermorium", "Lv", 116);
	
	
	private String name;
	private String symbol;
	private Integer atomicNum;
	
	
	private Metals(String name, String symbol, Integer atomicNum) {
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
		
		return String.join(" ", symbol+": ", name+" with atomic number", atomicNum+". It is a metal.");
	}
	

}

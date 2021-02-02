package org.fujitsu.training.codes.enums;

public enum TransitionMetals {
	
	Sc("Scandium", "Sc", 21),
	Ti("Titanium", "Ti", 22),
	V("Vanadium", "V", 23),
	Cr("Chronium", "Cr", 24),
	Mn("Manganese", "Mn", 25),
	Fe("Iron", "Fe", 26),
	Co("Cobalt", "Co", 27),
	Ni("Nickel", "Ni", 28),
	Cu("Copper", "Cu", 29),
	Zn("Zinc", "Zn", 30),
	Y("Yttrium", "Y", 39),
	Zr("Zirconium", "Zr", 40),
	Nb("Niobium", "Nb", 41),
	Mo("Molybdenum", "Mo", 42),
	Tc("Technetium", "Tc", 43),
	Ru("Ruthenium", "Ru", 44),
	Rh("Rhodium", "Rh", 45),
	Pd("Palladium", "Pd", 46),
	Ag("Silver", "Ag", 47),
	Cd("Cadmium", "Cd", 48),
	Hf("Hafnium", "Hf", 72),
	Ta("Tantalum", "Ta", 73),
	W("Tungsten", "W", 74),
	Re("Rhenium", "Re", 75),
	Os("Osmium", "Os", 76),
	Ir("Iridium", "Ir", 77),
	Pt("Platinum", "Pt", 78),
	Au("Gold", "Au", 79),
	Hg("Mercury", "Hg", 80), 
	Rf("Rutherfordium", "Rf", 104),
	Db("Dubnium", "Db", 105),
	Sg("Seaborgium", "Sg", 106),
	Bh("Bohrium", "Bh", 107),
	Hs("Hassium", "Hs", 108),
	Mt("Meitnerium","Mt", 109),
	Ds("Darmstadtium", "Ds", 110),
	Rg("Roentgenium","Rg", 111),
	Cn("Copernicium", "Cn", 112);
	
	private String name;
	private String symbol;
	private Integer atomicNum;
	
	private TransitionMetals(String name, String symbol, Integer atomicNum) {
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
		
		return String.join(" ", symbol+": ", name+" with atomic number ", atomicNum+". It is a transitional metal.");
	}

}

package com.qa.main;

public class Duck {
	private String name;
	private boolean isAMallard;
	private boolean perfection;
	private boolean fight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAMallard() {
		return isAMallard;
	}
	public void setAMallard(boolean isAMallard) {
		this.isAMallard = isAMallard;
	}
	public boolean isPerfection() {
		return perfection;
	}
	public void setPerfection(boolean perfection) {
		this.perfection = perfection;
	}
	public boolean isFight() {
		return fight;
	}
	public void setFight(boolean fight) {
		this.fight = fight;
	}
	public Duck(String name, boolean isAMallard, boolean perfection, boolean fight) {
		this.name = name;
		this.isAMallard = isAMallard;
		this.perfection = perfection;
		this.fight = fight;
		
	
	}
	@Override
	public String toString() {
		return "Duck [name=" + name + ", isAMallard=" + isAMallard + ", perfection?=" + perfection + ", Should fight duck?=" + fight +"]";
	}
	
	
	}



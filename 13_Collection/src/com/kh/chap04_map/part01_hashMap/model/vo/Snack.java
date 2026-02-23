package com.kh.chap04_map.part01_hashMap.model.vo;

import java.util.Objects;

public class Snack {
	
	private String flavor;
	private int calory;
	
	public Snack() {
		
	}

	public Snack(String flavor, int calory) {
		this.flavor = flavor;
		this.calory = calory;
	}

	public final String getFlavor() {
		return flavor;
	}

	public final void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public final int getCalory() {
		return calory;
	}

	public final void setCalory(int calory) {
		this.calory = calory;
	}

	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(calory, flavor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Snack other = (Snack) obj;
		return calory == other.calory && Objects.equals(flavor, other.flavor);
	}
	
	
	
}

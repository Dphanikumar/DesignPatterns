package com.phani.product;

import com.phani.foundation.Foundation;
import com.phani.interior.Interior;
import com.phani.roofing.Roofing;
import com.phani.structure.Structure;

public class House {

	private Foundation foundation;
	private Structure structure;
	private Roofing roofing;
	private Interior interior;

	public Foundation getFoundation() {
		return foundation;
	}

	public void setFoundation(Foundation foundation) {
		this.foundation = foundation;
	}

	public Structure getStructure() {
		return structure;
	}

	public void setStructure(Structure structure) {
		this.structure = structure;
	}

	public Roofing getRoofing() {
		return roofing;
	}

	public void setRoofing(Roofing roofing) {
		this.roofing = roofing;
	}

	public Interior getInterior() {
		return interior;
	}

	public void setInterior(Interior interior) {
		this.interior = interior;
	}

	@Override
	public String toString() {
		return "House [foundation=" + foundation + ", structure=" + structure + ", roofing=" + roofing + ", interior="
				+ interior + "]";
	}

}

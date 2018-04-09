package com.caretronics.heranca2;

public enum TipoGenero {

	MACHO("Macho"), FEMEA("Femea");
	
	private String label;
	
	private TipoGenero(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
}

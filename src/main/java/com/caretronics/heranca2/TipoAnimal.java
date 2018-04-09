package com.caretronics.heranca2;

public enum TipoAnimal {

	AVE("Ave"),
	MAMIFERO("Mamifero"),
	REPTIL("R�ptil");
	
	private String label;
	
	private TipoAnimal(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}

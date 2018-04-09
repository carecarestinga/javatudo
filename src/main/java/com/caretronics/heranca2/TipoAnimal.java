package com.caretronics.heranca2;

public enum TipoAnimal {

	AVE("Ave"),
	MAMIFERO("Mamifero"),
	REPTIL("Réptil");
	
	private String label;
	
	private TipoAnimal(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}

package com.caretronics.model;

import java.io.Serializable;

public abstract class BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;

	public BaseEntity() {
		this.id = 0;
	}

	public BaseEntity(long id) {
		this.id = id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public boolean isPersisted() {
		return this.id > 0;
	}
}

package com.example.demo;

import java.io.Serializable;

public class BaseElement<CONTENT extends Serializable> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7320742728294547442L;
	private final CONTENT content;
	private BaseElement<CONTENT> previous;
	
	public BaseElement(CONTENT content) {
		this.content=content;
	}

	public CONTENT getContent() {
		return content;
	}

	public BaseElement<CONTENT> getPrevious() {
		return previous;
	}

	public void setPrevious(BaseElement<CONTENT> previous) {
		this.previous = previous;
	}

	@Override
	public String toString() {
		return new StringBuilder().append("Contenido: ").append(content).toString();
	}

}

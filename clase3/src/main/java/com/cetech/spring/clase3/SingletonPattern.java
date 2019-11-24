package com.cetech.spring.clase3;

public final class SingletonPattern {
	
	/**
	 * La instancia de la clase
	 */
	private static SingletonPattern instance;
	
	private static int instances;
	
	/**
	 * Constructor privado para que nadie fuera de la clase pueda realizar una nueva instancia.
	 */
	private SingletonPattern() {
		instances++;
	}
	
	/**
	 * Metodo que nos regresa la instancia del singleton
	 * @return
	 */
	public static SingletonPattern getInstance() {
		if(instance == null) {
			instance = new SingletonPattern();
		}
		return instance;	
	}
	
	public int instancesCreated() {
		return instances;
	}

}

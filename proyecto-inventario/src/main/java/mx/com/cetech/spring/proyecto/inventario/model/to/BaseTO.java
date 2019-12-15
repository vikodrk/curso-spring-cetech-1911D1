package mx.com.cetech.spring.proyecto.inventario.model.to;

import java.io.Serializable;

public abstract class BaseTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8053488957497468008L;

	public abstract boolean equals(Object obj);
	
	public abstract int hashCode();

}

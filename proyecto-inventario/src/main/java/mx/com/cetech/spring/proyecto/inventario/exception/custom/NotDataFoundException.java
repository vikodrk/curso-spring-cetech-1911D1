package mx.com.cetech.spring.proyecto.inventario.exception.custom;

import java.util.function.UnaryOperator;

public class NotDataFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1733804350350715156L;
	
	private static final UnaryOperator<String> label = data -> new StringBuilder("No data found for input: ").append(data).toString();
	
	
	public NotDataFoundException(String data) {
		super(label.apply(data));
	}

}

package mx.com.cetech.spring.verb;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Verb implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5007553946883414208L;
	private String action;
	private String lenguage;

}

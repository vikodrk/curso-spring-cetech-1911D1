package mx.com.cetech.spring.noun;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VerbResponse {
	
	private String action;
	private String lenguage;
	
	@Override
	public String toString() {
		return action;
	}

}

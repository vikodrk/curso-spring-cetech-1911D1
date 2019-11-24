package mx.com.cetech.spring.clase4;

import java.io.Serializable;

public class StudentTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7937132899556736854L;
	
	private Long id;
	private String name;
	private String lastname;
	private String birthdate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

}

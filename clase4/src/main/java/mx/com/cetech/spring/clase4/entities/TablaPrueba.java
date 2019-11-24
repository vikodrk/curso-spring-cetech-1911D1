package mx.com.cetech.spring.clase4.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRUEBA_CREATE")
public class TablaPrueba {

	@Id
	@Column(name="ID")
	private Long id;

	@Column(name="CADEND")
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}

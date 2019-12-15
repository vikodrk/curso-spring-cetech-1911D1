package mx.com.cetech.spring.proyecto.inventario.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "ROLES")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Roles implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7784321728986834689L;

	@Id
	@Column(name = "ID_ROL")
	private Long idRole;

	@Column(name = "DESCRIPCION")
	private String description;

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if (obj != null) {
			if (obj == this) {
				flag = true;
			} else if (obj.getClass() == this.getClass()) {
				flag = new EqualsBuilder().append(idRole, ((Roles) obj).idRole).isEquals();
			}
		}
		return flag;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(idRole).toHashCode();
	}

}

package mx.com.cetech.spring.proyecto.inventario.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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
public class Products implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8341984163516545002L;

	@Id
	@Column(name = "ID_PRDUCTO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduct;

	@Column(name = "DESCRIPCION")
	private String description;

	@Column(name = "ACTIVO")
	private Boolean active;

	@Column(name = "FECHA_ULTIMA_MODIFICACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastEditDate;

	@Column(name = "USUARIO_ULTIMA_MODIFICACION")
	private Long userLastEdit;

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if (obj != null) {
			if (obj == this) {
				flag = true;
			} else if (obj.getClass() == this.getClass()) {
				flag = new EqualsBuilder().append(idProduct, ((Products) obj).idProduct).isEquals();
			}
		}
		return flag;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(idProduct).toHashCode();
	}

}

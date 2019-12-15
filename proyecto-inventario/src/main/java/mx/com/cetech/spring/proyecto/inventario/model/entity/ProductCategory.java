package mx.com.cetech.spring.proyecto.inventario.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="PRODUCTOS_CATEGORIA")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProductCategory implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5624903126788564645L;

	@Id
	@Column(name="ID_CATEGORIA")
	private Long id;
	
	@Column(name="DESCRIPCION")
	private String description;
	
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		
		if(obj!=null) {
			if(obj==this) {
				flag =true;
			}
			else if(obj.getClass()==this.getClass()) {
				flag = new EqualsBuilder().append(id, ((ProductCategory)obj).id).isEquals();
			}
		}
		
		return flag;
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).toHashCode();
	}

}

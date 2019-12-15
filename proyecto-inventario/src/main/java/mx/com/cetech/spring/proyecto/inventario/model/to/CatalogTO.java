package mx.com.cetech.spring.proyecto.inventario.model.to;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CatalogTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7580681634010687605L;
	private Long id;
	private String description;

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if (obj != null) {
			if (obj == this) {
				flag = true;
			}
			if (obj.getClass() == this.getClass()) {
				flag = new EqualsBuilder().append(id, ((CatalogTO) obj).id).isEquals();
			}
		}
		return flag;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).toHashCode();
	}

}

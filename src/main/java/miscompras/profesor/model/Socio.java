package miscompras.profesor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Entidad socio, se guarda en base de datos
 * El identificador de esta tabla es el codigo
 * se marca con la anotacion @Id y tiene que ser
 * único
 *
 */
@Entity
@Table(name = "socios")
public class Socio {
	@Id
	@Column(name = "cod_socio")
	private String codigo;
	private String clave;
	private String nombre;
	private Integer cantidad_max;

	public String getCodigo() {
		return codigo;
	}
	public void setCod_socio(String cod_socio) {
		this.codigo = cod_socio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCantidad_max() {
		return cantidad_max;
	}
	public void setCantidad_max(Integer cantidad_max) {
		this.cantidad_max = cantidad_max;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}

}

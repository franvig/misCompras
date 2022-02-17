package miscompras.profesor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Entidad productos, se guarda en base de datos
 * El identificador de esta tabla es el codigo
 * se marca con la anotacion @Id y tiene que ser
 * único
 *
 */
@Entity
@Table(name = "productos")
public class Producto {

	@Id
	@Column(name = "cod_pro")
	private String codigo;
	@Column(name = "nombre_pro")
	private String nombre;
	private Integer precio;
		
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo= codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

}

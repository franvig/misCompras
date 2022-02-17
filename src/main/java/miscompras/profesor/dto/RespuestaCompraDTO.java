package miscompras.profesor.dto;
/**
 * Clase que usamos para responder a la web con la informacion
 * resultante de procesar una peticion de compra
 * nombre_socio: nombre del socio que ha intentado hacer la compra
 * nombre_prod: Producto a comprar
 * precio_producto: Precio del producto
 * exito: atributo que indica si se ha podido o no hacer la compra
 * message: mensaje que nos indica por qué no se ha podido realizar la compra
 * @author fvigueras
 *
 */
public class RespuestaCompraDTO {
	
	private String nombre_socio;
	private String nombre_prod;
	private String message;
	private Integer cantidad_maxima;
	private Integer precio_producto;
	private Boolean exito;
	
	public String getNombre_socio() {
		return nombre_socio;
	}
	public void setNombre_socio(String nombre_socio) {
		this.nombre_socio = nombre_socio;
	}
	public String getNombre_prod() {
		return nombre_prod;
	}
	public void setNombre_prod(String nombre_prod) {
		this.nombre_prod = nombre_prod;
	}
	
	public Integer getCantidad_maxima() {
		return cantidad_maxima;
	}
	public void setCantidad_maxima(Integer cantidad_maxima) {
		this.cantidad_maxima = cantidad_maxima;
	}
	public Boolean getExito() {
		return exito;
	}
	public void setExito(Boolean exito) {
		this.exito = exito;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getPrecio_producto() {
		return precio_producto;
	}
	public void setPrecio_producto(Integer precio_producto) {
		this.precio_producto = precio_producto;
	}
	
	

}

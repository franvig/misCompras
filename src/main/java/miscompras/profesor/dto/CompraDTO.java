package miscompras.profesor.dto;
/**
 * Clase que usamos para mapear los json
 * que nos llegan al controller, es decir
 * si nos hacen una peticion desde la web 
 * nos enviaran un json con estos atributos: 
 * codigo socio, clave y codigo producto que 
 * se quiere comprar. 
 *
 */
public class CompraDTO {
	private String cod_socio;
	private String clave;
	private String cod_pro;
	
	public CompraDTO(String cod_socio, String clave, String cod_pro) {
		super();
		this.cod_socio = cod_socio;
		this.clave = clave;
		this.cod_pro = cod_pro;
	}
	public String getCod_socio() {
		return cod_socio;
	}
	public void setCod_socio(String cod_socio) {
		this.cod_socio = cod_socio;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getCod_pro() {
		return cod_pro;
	}
	public void setCod_pro(String cod_pro) {
		this.cod_pro = cod_pro;
	}
	
}

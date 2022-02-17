package miscompras.profesor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import miscompras.profesor.dto.CompraDTO;
import miscompras.profesor.dto.RespuestaCompraDTO;
import miscompras.profesor.model.Producto;
import miscompras.profesor.model.Socio;
import miscompras.profesor.service.MisComprasService;

/**
 * Nos encontramos ante una clase RestController
 * Desde aquí procesaremos todas las peticiones Rest
 * 
 * Lo que devolvemos en los métodos, son los cuerpos de la respuesta, 
 * transformados a JSON
 *
 */
@RestController
@CrossOrigin(origins = "*")
public class WebController {
	
	//Inyección de dependencia a clienteService
	@Autowired
	private MisComprasService misComprasService;
	
	/**
	 * GET
	 * @return
	 */
	@GetMapping("/productos")
	public List<Producto> getProductos() {
		return misComprasService.loadProductos();
	}
	
	/**
	 * GET
	 * @return
	 */
	@GetMapping("/socios")
	public List<Socio> getSocios() {
		return misComprasService.loadSocios();
	}
	
	
	/**
	 * POST: Crear
	 * @param producto
	 */
	@PostMapping("/productos")
    public void addProducto(@RequestBody Producto producto) {
		misComprasService.addProducto(producto);
    }
	
	/**
	 * POST: Crear
	 * @param socio
	 */
	@PostMapping("/socios")
    public void addSocio(@RequestBody Socio socio) {
		misComprasService.addSocio(socio);
    }
	
	/**
	 * POST: Crear
	 * @param compra
	 */
	@PostMapping("/compra")
    public RespuestaCompraDTO compraProducto(@RequestBody CompraDTO compra) {
		return misComprasService.compraProducto(compra);
    }
}

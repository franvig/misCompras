package miscompras.profesor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import miscompras.profesor.dto.CompraDTO;
import miscompras.profesor.dto.RespuestaCompraDTO;
import miscompras.profesor.model.Producto;
import miscompras.profesor.model.Socio;
import miscompras.profesor.repository.SocioRepository;
import miscompras.profesor.repository.ProductoRepository;
/**
 * Clase que implementa el método de compra que recibimos en el controller
 *
 */
@Service
public class MisComprasService {
	
	@Autowired
	private SocioRepository socioRepository;
	
	@Autowired
	private ProductoRepository productoRepository;

	public List<Producto> loadProductos() {
		return productoRepository.findAll();
	}

	public List<Socio> loadSocios() {
		return socioRepository.findAll();
	}

	public void addProducto(Producto producto) {
		productoRepository.save(producto);
	}

	public void addSocio(Socio socio) {
		socioRepository.save(socio);
	}
	/**
	 * Método de compra
	 * @param compra
	 * @return
	 */
	public RespuestaCompraDTO compraProducto(CompraDTO compra) {
		RespuestaCompraDTO respuesta = new RespuestaCompraDTO();
		try {
			Producto producto = productoRepository.findByCodigo(compra.getCod_pro());
			Socio socio = socioRepository.findByCodigoAndClave(compra.getCod_socio(), compra.getClave());
			if (producto!=null) {
				if (socio!=null) {
					if(producto.getPrecio()>socio.getCantidad_max()) {
						respuesta.setExito(false);
						respuesta.setMessage("Precio producto superior a saldo socio");
					}else {
						Integer cantidad_maxima = socio.getCantidad_max() - producto.getPrecio();
						socio.setCantidad_max(cantidad_maxima);
						socioRepository.save(socio);
						respuesta.setCantidad_maxima(cantidad_maxima);
						respuesta.setNombre_prod(producto.getNombre());
						respuesta.setNombre_socio(socio.getNombre());
						respuesta.setPrecio_producto(producto.getPrecio());
						respuesta.setExito(true);
						respuesta.setMessage("Compra efectuada correctamente");
					}
				}else {
					respuesta.setExito(false);
					respuesta.setMessage("Usuario no existe o Password incorrecto");
				}
			}else {
				respuesta.setExito(false);
				respuesta.setMessage("Producto no existe");
			}
		}catch(Exception e) {
			respuesta.setExito(false);
			respuesta.setMessage("ERROR procesando petición");
			}
		return respuesta;
	}

}

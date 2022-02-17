package miscompras.profesor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import miscompras.profesor.model.Producto;
/**
 * Aqui viene String: extends JpaRepository<Producto, String>
 * porque el identificador con la anotacion @Id en Producto es de tipo
 * String
 */
@Repository
public interface ProductoRepository extends JpaRepository<Producto, String>{
	Producto findByCodigo(String cod);
}

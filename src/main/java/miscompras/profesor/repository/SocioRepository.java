package miscompras.profesor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import miscompras.profesor.model.Socio;
/**
 * Aqui viene String: extends JpaRepository<Socio, String>
 * porque el identificador con la anotacion @Id en Socio es de tipo
 * String
 */

@Repository
public interface SocioRepository extends JpaRepository<Socio, String>{
	Socio findByCodigo(String cod);

	Socio findByCodigoAndClave(String cod_socio, String clave);
}

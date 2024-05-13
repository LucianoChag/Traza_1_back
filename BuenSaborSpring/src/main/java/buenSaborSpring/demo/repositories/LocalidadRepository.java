package buenSaborSpring.demo.repositories;

import buenSaborSpring.demo.domain.entities.Localidad;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad,Long> {
    List<Localidad> findByProvinciaId(Long id);
}

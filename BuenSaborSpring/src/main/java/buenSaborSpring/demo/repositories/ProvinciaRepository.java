package buenSaborSpring.demo.repositories;

import buenSaborSpring.demo.domain.entities.Provincia;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinciaRepository extends BaseRepository<Provincia,Long> {
    Provincia findByNombre(String provinciaNombre);
    List<Provincia> findByPaisId(Long id);
}

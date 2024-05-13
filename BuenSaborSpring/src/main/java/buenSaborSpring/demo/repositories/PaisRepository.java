package buenSaborSpring.demo.repositories;

import buenSaborSpring.demo.domain.entities.Pais;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends BaseRepository<Pais,Long> {
}

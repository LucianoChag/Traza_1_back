package buenSaborSpring.demo.repositories;

import buenSaborSpring.demo.domain.entities.Domicilio;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio,Long> {
}

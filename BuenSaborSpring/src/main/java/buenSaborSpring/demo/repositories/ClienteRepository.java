package buenSaborSpring.demo.repositories;

import buenSaborSpring.demo.domain.entities.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends BaseRepository<Cliente,Long> {
}

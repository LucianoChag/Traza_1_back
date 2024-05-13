package buenSaborSpring.demo.repositories;

import buenSaborSpring.demo.domain.entities.Factura;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends BaseRepository<Factura,Long> {
}

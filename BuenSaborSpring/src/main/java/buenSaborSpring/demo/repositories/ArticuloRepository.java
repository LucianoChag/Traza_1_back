package buenSaborSpring.demo.repositories;

import buenSaborSpring.demo.domain.entities.Articulo;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloRepository  extends BaseRepository<Articulo, Long> {
}

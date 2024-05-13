package buenSaborSpring.demo.repositories;

import buenSaborSpring.demo.domain.entities.ArticuloInsumo;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloInsumoRepository extends BaseRepository<ArticuloInsumo,Long> {
}

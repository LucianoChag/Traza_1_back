package buenSaborSpring.demo.repositories;

import buenSaborSpring.demo.domain.entities.ArticuloManufacturado;
import org.springframework.stereotype.Repository;


@Repository
public interface ArticuloManufacturadoRepository extends BaseRepository<ArticuloManufacturado,Long> {
}

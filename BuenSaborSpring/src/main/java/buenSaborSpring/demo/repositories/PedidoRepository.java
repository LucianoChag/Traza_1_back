package buenSaborSpring.demo.repositories;

import buenSaborSpring.demo.domain.entities.Pedido;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends BaseRepository<Pedido,Long> {
}

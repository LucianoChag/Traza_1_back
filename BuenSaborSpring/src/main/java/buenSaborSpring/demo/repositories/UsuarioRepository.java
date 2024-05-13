package buenSaborSpring.demo.repositories;

import buenSaborSpring.demo.domain.entities.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario,Long> {
}

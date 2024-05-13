package buenSaborSpring.demo.repositories;


import buenSaborSpring.demo.domain.entities.Empleado;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends BaseRepository<Empleado,Long> {
}

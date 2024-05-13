package buenSaborSpring.demo.repositories;

import buenSaborSpring.demo.domain.entities.Persona;

import buenSaborSpring.demo.repositories.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {
}

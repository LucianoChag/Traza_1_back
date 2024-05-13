package buenSaborSpring.demo.business.service;

import buenSaborSpring.demo.business.service.Base.BaseService;
import buenSaborSpring.demo.domain.entities.Localidad;

import java.util.List;

public interface LocalidadService extends BaseService<Localidad, Long> {
    List<Localidad> findByProvinciaId(Long id);
}

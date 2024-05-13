package buenSaborSpring.demo.business.service;

import buenSaborSpring.demo.business.service.Base.BaseService;
import buenSaborSpring.demo.domain.entities.Provincia;

import java.util.List;

public interface ProvinciaService extends BaseService<Provincia, Long> {
    List<Provincia> findByPaisId(Long id);
}

package buenSaborSpring.demo.business.facade;



import buenSaborSpring.demo.business.facade.Base.BaseFacade;
import buenSaborSpring.demo.domain.dtos.ProvinciaDto;

import java.util.List;

public interface ProvinciaFacade extends BaseFacade<ProvinciaDto, Long> {
    List<ProvinciaDto> findByPaisId(Long id);
}

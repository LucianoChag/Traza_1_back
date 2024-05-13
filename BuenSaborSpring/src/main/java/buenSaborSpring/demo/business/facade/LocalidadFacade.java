package buenSaborSpring.demo.business.facade;


import buenSaborSpring.demo.business.facade.Base.BaseFacade;
import buenSaborSpring.demo.domain.dtos.LocalidadDto;

import java.util.List;

public interface LocalidadFacade extends BaseFacade<LocalidadDto, Long> {

    List<LocalidadDto> findByProvinciaId(Long id);
}

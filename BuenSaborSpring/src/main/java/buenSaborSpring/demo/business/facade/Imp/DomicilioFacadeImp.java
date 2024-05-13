package buenSaborSpring.demo.business.facade.Imp;


import buenSaborSpring.demo.business.facade.Base.BaseFacadeImp;
import buenSaborSpring.demo.business.facade.DomicilioFacade;
import buenSaborSpring.demo.business.mapper.BaseMapper;
import buenSaborSpring.demo.business.service.Base.BaseService;
import buenSaborSpring.demo.domain.dtos.DomicilioDto;
import buenSaborSpring.demo.domain.entities.Domicilio;


import org.springframework.stereotype.Service;

@Service
public class DomicilioFacadeImp extends BaseFacadeImp<Domicilio, DomicilioDto, Long> implements DomicilioFacade {
    public DomicilioFacadeImp(BaseService<Domicilio, Long> baseService, BaseMapper<Domicilio, DomicilioDto> baseMapper) {
        super(baseService, baseMapper);
    }

}

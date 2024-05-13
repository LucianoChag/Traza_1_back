package buenSaborSpring.demo.business.facade.Imp;


import buenSaborSpring.demo.business.facade.Base.BaseFacadeImp;
import buenSaborSpring.demo.business.facade.PaisFacade;
import buenSaborSpring.demo.business.mapper.BaseMapper;
import buenSaborSpring.demo.business.service.Base.BaseService;
import buenSaborSpring.demo.domain.dtos.PaisDto;
import buenSaborSpring.demo.domain.entities.Pais;


import org.springframework.stereotype.Service;


@Service
public class PaisFacadeImp extends BaseFacadeImp<Pais, PaisDto,Long> implements PaisFacade {
    public PaisFacadeImp(BaseService<Pais, Long> baseService, BaseMapper<Pais, PaisDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

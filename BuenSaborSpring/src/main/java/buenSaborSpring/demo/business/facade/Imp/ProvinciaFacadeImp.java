package buenSaborSpring.demo.business.facade.Imp;


import buenSaborSpring.demo.business.facade.Base.BaseFacadeImp;
import buenSaborSpring.demo.business.facade.ProvinciaFacade;
import buenSaborSpring.demo.business.mapper.BaseMapper;
import buenSaborSpring.demo.business.service.Base.BaseService;
import buenSaborSpring.demo.business.service.ProvinciaService;
import buenSaborSpring.demo.domain.dtos.ProvinciaDto;
import buenSaborSpring.demo.domain.entities.Provincia;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaFacadeImp extends BaseFacadeImp<Provincia, ProvinciaDto, Long> implements ProvinciaFacade {

    public ProvinciaFacadeImp(BaseService<Provincia, Long> baseService, BaseMapper<Provincia, ProvinciaDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    ProvinciaService provinciaService;
    @Override
    public List<ProvinciaDto> findByPaisId(Long id) {
        return baseMapper.toDTOsList(provinciaService.findByPaisId(id));
    }
}

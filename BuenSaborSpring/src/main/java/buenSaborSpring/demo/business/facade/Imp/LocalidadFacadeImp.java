package buenSaborSpring.demo.business.facade.Imp;

import buenSaborSpring.demo.business.facade.Base.BaseFacadeImp;
import buenSaborSpring.demo.business.facade.LocalidadFacade;
import buenSaborSpring.demo.business.mapper.BaseMapper;
import buenSaborSpring.demo.business.service.Base.BaseService;
import buenSaborSpring.demo.business.service.LocalidadService;
import buenSaborSpring.demo.domain.dtos.LocalidadDto;
import buenSaborSpring.demo.domain.entities.Localidad;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocalidadFacadeImp extends BaseFacadeImp<Localidad, LocalidadDto, Long> implements LocalidadFacade {
    public LocalidadFacadeImp(BaseService<Localidad, Long> baseService, BaseMapper<Localidad, LocalidadDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    LocalidadService localidadService;

    @Override
    public List<LocalidadDto> findByProvinciaId(Long id) {
            // trae una lista de entidades
            var entities = localidadService.findByProvinciaId(id);
            //  devuelve una lista de DTO
            return entities
                    .stream()
                    .map(baseMapper::toDTO)
                    .collect(Collectors.toList());
    }
}

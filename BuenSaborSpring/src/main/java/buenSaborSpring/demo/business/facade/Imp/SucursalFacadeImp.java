package buenSaborSpring.demo.business.facade.Imp;


import buenSaborSpring.demo.business.facade.Base.BaseFacadeImp;
import buenSaborSpring.demo.business.facade.Sucursalfacade;
import buenSaborSpring.demo.business.mapper.BaseMapper;
import buenSaborSpring.demo.business.service.Base.BaseService;
import buenSaborSpring.demo.business.service.Base.BaseServiceImp;
import buenSaborSpring.demo.business.service.SucursalService;
import buenSaborSpring.demo.domain.dtos.SucursalDto;
import buenSaborSpring.demo.domain.entities.Sucursal;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucursalFacadeImp extends BaseFacadeImp<Sucursal, SucursalDto,Long> implements Sucursalfacade {
    private static final Logger logger = LoggerFactory.getLogger(BaseServiceImp.class);
    @Autowired
    SucursalService sucursalService;
    public SucursalFacadeImp(BaseService<Sucursal, Long> baseService, BaseMapper<Sucursal, SucursalDto> baseMapper) {
        super(baseService, baseMapper);
    }


    @Override
    public SucursalDto createSucursal(SucursalDto dto) {
        var sucursal=baseMapper.toEntity(dto);
        var sucursalPersistida=sucursalService.guardarSucursal(sucursal);
        return baseMapper.toDTO(sucursalPersistida);
    }

    @Override
    public SucursalDto updateSucursal(Long id, SucursalDto dto) {

        var sucursal=baseMapper.toEntity(dto);

        var sucursalActualizada=sucursalService.actualizarSucursal(id,sucursal);
        return baseMapper.toDTO(sucursalActualizada);
    }
}

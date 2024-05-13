package buenSaborSpring.demo.business.facade;


import buenSaborSpring.demo.business.facade.Base.BaseFacade;
import buenSaborSpring.demo.domain.dtos.SucursalDto;

public interface Sucursalfacade extends BaseFacade<SucursalDto, Long> {
    SucursalDto createSucursal(SucursalDto dto);
    SucursalDto updateSucursal(Long id,SucursalDto dto);
}

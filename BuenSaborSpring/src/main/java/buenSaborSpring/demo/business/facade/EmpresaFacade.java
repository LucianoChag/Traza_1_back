package buenSaborSpring.demo.business.facade;


import buenSaborSpring.demo.business.facade.Base.BaseFacade;
import buenSaborSpring.demo.domain.dtos.EmpresaDto;
import buenSaborSpring.demo.domain.dtos.EmpresaLargeDto;

public interface EmpresaFacade extends BaseFacade<EmpresaDto, Long> {
    EmpresaLargeDto addSucursal(Long idEmpresa, Long idSucursal);
}

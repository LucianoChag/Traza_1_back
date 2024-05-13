package buenSaborSpring.demo.business.service;


import buenSaborSpring.demo.business.service.Base.BaseService;
import buenSaborSpring.demo.domain.entities.Empresa;

public interface EmpresaService extends BaseService<Empresa, Long> {
    public Empresa addSucursal(Long idEmpresa, Long idSucursal);
}

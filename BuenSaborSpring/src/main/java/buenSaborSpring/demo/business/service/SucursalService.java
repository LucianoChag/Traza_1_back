package buenSaborSpring.demo.business.service;


import buenSaborSpring.demo.business.service.Base.BaseService;
import buenSaborSpring.demo.domain.entities.Sucursal;

public interface SucursalService  extends BaseService<Sucursal, Long> {
    Sucursal guardarSucursal(Sucursal sucursal);
    Sucursal actualizarSucursal(Long id,Sucursal sucursal);
}


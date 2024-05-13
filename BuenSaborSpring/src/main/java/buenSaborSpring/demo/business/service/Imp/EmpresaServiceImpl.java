package buenSaborSpring.demo.business.service.Imp;


import buenSaborSpring.demo.business.service.Base.BaseServiceImp;
import buenSaborSpring.demo.business.service.EmpresaService;
import buenSaborSpring.demo.business.service.SucursalService;
import buenSaborSpring.demo.domain.entities.Empresa;
import buenSaborSpring.demo.repositories.EmpresaRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImpl extends BaseServiceImp<Empresa,Long> implements EmpresaService {

    @Autowired
    SucursalService sucursalService;

    @Autowired
    EmpresaRepository empresaRepository;

    @Override
    public Empresa addSucursal(Long idEmpresa, Long idSucursal) {
        Empresa empresa = empresaRepository.findWithSucursalesById(idEmpresa);
        empresa.getSucursales().add(sucursalService.getById(idSucursal));
        return empresa;

        
    }
}

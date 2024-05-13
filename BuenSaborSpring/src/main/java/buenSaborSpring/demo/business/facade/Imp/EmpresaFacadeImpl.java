package buenSaborSpring.demo.business.facade.Imp;


import buenSaborSpring.demo.business.facade.Base.BaseFacadeImp;
import buenSaborSpring.demo.business.facade.EmpresaFacade;
import buenSaborSpring.demo.business.mapper.BaseMapper;
import buenSaborSpring.demo.business.mapper.EmpresaMapper;
import buenSaborSpring.demo.business.service.Base.BaseService;
import buenSaborSpring.demo.business.service.EmpresaService;
import buenSaborSpring.demo.domain.dtos.EmpresaDto;
import buenSaborSpring.demo.domain.dtos.EmpresaLargeDto;
import buenSaborSpring.demo.domain.entities.Empresa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaFacadeImpl extends BaseFacadeImp<Empresa, EmpresaDto,Long> implements EmpresaFacade {

    public EmpresaFacadeImpl(BaseService<Empresa, Long> baseService, BaseMapper<Empresa, EmpresaDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    EmpresaMapper empresaMapper;


    @Autowired
    EmpresaService empresaService;
    @Override
    public EmpresaLargeDto addSucursal(Long idEmpresa, Long idSucursal) {
        return empresaMapper.toLargeDto(empresaService.addSucursal(idEmpresa, idSucursal));
    }
}

package buenSaborSpring.demo.business.mapper;


import buenSaborSpring.demo.domain.dtos.SucursalDto;
import buenSaborSpring.demo.domain.entities.Sucursal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {DomicilioMapper.class, EmpresaMapper.class })
public interface SucursalMapper extends BaseMapper<Sucursal, SucursalDto>{

}

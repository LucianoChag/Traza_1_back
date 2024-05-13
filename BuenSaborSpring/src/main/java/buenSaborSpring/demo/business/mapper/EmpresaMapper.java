package buenSaborSpring.demo.business.mapper;




import buenSaborSpring.demo.domain.dtos.EmpresaDto;
import buenSaborSpring.demo.domain.dtos.EmpresaLargeDto;
import buenSaborSpring.demo.domain.entities.Empresa;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmpresaMapper extends BaseMapper<Empresa, EmpresaDto> {


    EmpresaLargeDto toLargeDto(Empresa empresa);


}

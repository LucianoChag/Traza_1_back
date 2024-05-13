package buenSaborSpring.demo.business.mapper;


import buenSaborSpring.demo.domain.dtos.DomicilioDto;
import buenSaborSpring.demo.domain.entities.Domicilio;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = buenSaborSpring.demo.business.mapper.LocalidadMapper.class)
public interface DomicilioMapper extends BaseMapper<Domicilio, DomicilioDto> {


}

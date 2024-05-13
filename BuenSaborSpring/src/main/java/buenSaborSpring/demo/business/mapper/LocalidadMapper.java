package buenSaborSpring.demo.business.mapper;


import buenSaborSpring.demo.domain.dtos.LocalidadDto;
import buenSaborSpring.demo.domain.entities.Localidad;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LocalidadMapper extends BaseMapper<Localidad, LocalidadDto> {
}

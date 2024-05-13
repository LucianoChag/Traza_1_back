package buenSaborSpring.demo.business.mapper;


import buenSaborSpring.demo.domain.dtos.PaisDto;
import buenSaborSpring.demo.domain.entities.Pais;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PaisMapper extends BaseMapper<Pais, PaisDto>{

}

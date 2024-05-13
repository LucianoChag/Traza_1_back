package buenSaborSpring.demo.business.mapper;

import buenSaborSpring.demo.domain.dtos.ProvinciaDto;
import buenSaborSpring.demo.domain.entities.Provincia;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProvinciaMapper extends BaseMapper<Provincia, ProvinciaDto>{

}

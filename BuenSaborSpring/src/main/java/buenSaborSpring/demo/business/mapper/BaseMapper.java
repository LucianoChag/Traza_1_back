package buenSaborSpring.demo.business.mapper;


import buenSaborSpring.demo.domain.dtos.BaseDto;
import buenSaborSpring.demo.domain.entities.Base;

import java.util.List;

public interface BaseMapper<E extends Base,D extends BaseDto>{
    public D toDTO(E source);
    public E toEntity(D source);
    public List<D> toDTOsList(List<E> source);
}

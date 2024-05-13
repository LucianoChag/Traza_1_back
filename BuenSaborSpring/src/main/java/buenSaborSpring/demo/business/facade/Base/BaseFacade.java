package buenSaborSpring.demo.business.facade.Base;



import buenSaborSpring.demo.domain.dtos.BaseDto;

import java.io.Serializable;
import java.util.List;

public interface BaseFacade <D extends BaseDto, ID extends Serializable>{
    public D createNew(D request);
    public D getById(Long id);
    public List<D> getAll();
    public void deleteById(Long id);
    public D update(D request, Long id);
}

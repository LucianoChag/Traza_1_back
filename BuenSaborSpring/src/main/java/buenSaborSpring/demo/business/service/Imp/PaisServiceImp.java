package buenSaborSpring.demo.business.service.Imp;


import buenSaborSpring.demo.business.service.Base.BaseServiceImp;
import buenSaborSpring.demo.business.service.PaisService;
import buenSaborSpring.demo.domain.entities.Pais;


import org.springframework.stereotype.Service;

@Service
public class PaisServiceImp extends BaseServiceImp<Pais, Long> implements PaisService {
}

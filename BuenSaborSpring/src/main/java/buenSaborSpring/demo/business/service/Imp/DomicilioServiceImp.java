package buenSaborSpring.demo.business.service.Imp;


import buenSaborSpring.demo.business.service.Base.BaseServiceImp;
import buenSaborSpring.demo.business.service.DomicilioService;
import buenSaborSpring.demo.domain.entities.Domicilio;


import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImp extends BaseServiceImp<Domicilio,Long> implements DomicilioService {
}

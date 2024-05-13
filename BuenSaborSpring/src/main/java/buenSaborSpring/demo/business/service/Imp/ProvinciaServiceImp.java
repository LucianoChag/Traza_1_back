package buenSaborSpring.demo.business.service.Imp;



import buenSaborSpring.demo.business.service.Base.BaseServiceImp;
import buenSaborSpring.demo.business.service.ProvinciaService;
import buenSaborSpring.demo.domain.entities.Provincia;
import buenSaborSpring.demo.repositories.ProvinciaRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaServiceImp extends BaseServiceImp<Provincia,Long> implements ProvinciaService {
    @Autowired
    ProvinciaRepository provinciaRepository;
    @Override
    public List<Provincia> findByPaisId(Long id) {
        return provinciaRepository.findByPaisId(id);
    }
}

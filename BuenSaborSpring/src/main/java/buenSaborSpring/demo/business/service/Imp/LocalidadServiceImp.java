package buenSaborSpring.demo.business.service.Imp;


import buenSaborSpring.demo.business.service.Base.BaseServiceImp;
import buenSaborSpring.demo.business.service.LocalidadService;
import buenSaborSpring.demo.domain.entities.Localidad;
import buenSaborSpring.demo.repositories.LocalidadRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImp extends BaseServiceImp<Localidad,Long> implements LocalidadService {

    @Autowired
    LocalidadRepository localidadRepository;

    @Override
    public List<Localidad> findByProvinciaId(Long id) {
        return localidadRepository.findByProvinciaId(id);
    }
}

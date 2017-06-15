package it.uniroma3.GalleriaArte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.GalleriaArte.model.Opera;
import it.uniroma3.GalleriaArte.repository.OperaRepository;

@Service
public class OperaServiceImplementazione  implements OperaService {
	private OperaRepository operaRepository;

	
	

	    @Autowired
	    public void setOperaRepository(OperaRepository operaRepository) {
	        this.operaRepository = operaRepository;
	    }

	    @Override
	    public Iterable<Opera> listAllOpere() {
	        return operaRepository.findAll();
	    }

	    @Override
	    public Opera getOperaById(Long id) {
	        return operaRepository.findOne(id);
	    }

	    @Override
	    public Opera saveOpera(Opera opera) {
	        return operaRepository.save(opera);
	    }

	    @Override
	    public void deleteOpera(Long id) {
	        operaRepository.delete(id);
	    }
	}


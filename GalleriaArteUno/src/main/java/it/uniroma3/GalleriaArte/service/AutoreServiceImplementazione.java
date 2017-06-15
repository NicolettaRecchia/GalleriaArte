package it.uniroma3.GalleriaArte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.GalleriaArte.model.Autore;
import it.uniroma3.GalleriaArte.repository.AutoreRepository;
@Service
public class AutoreServiceImplementazione implements AutoreService{
private AutoreRepository autoreRepository;

	    @Autowired
	    public void setAutoreRepository(AutoreRepository autoreRepository) {
	        this.autoreRepository = autoreRepository;
	    }

	    @Override
	    public Iterable<Autore> listAllAutori() {
	        return autoreRepository.findAll();
	    }

	    @Override
	    public Autore getAutoreById(Long id) {
	        return autoreRepository.findOne(id);
	    }

	    @Override
	    public Autore saveAutore(Autore autore) {
	        return autoreRepository.save(autore);
	    }

	    @Override
	    public void deleteAutore(Long id) {
	        autoreRepository.delete(id);
	    }
	}


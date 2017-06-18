package it.uniroma3.GalleriaArte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.GalleriaArte.model.Autore;
import it.uniroma3.GalleriaArte.repository.AutoreRepository;


@Service
public class AutoreService {
	@Autowired
	private AutoreRepository autoreRepository;

	public Iterable<Autore> findAll() {
		return this.autoreRepository.findAll();
	}
	@Transactional
	public void add(final Autore autore) {
		this.autoreRepository.save(autore);
	}
	public Autore findbyId(Long id) {
		return this.autoreRepository.findOne(id);
	}
	@Transactional
	public void remove(final Long id) {
		this.autoreRepository.delete(id);
	}

	public Autore getAutoreById(Long id) {

		return autoreRepository.findOne(id);
	}
}
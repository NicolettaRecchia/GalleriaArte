package it.uniroma3.GalleriaArte.service;

import it.uniroma3.GalleriaArte.model.Autore;

public interface AutoreService {
	    Iterable<Autore> listAllAutori();

	   Autore getAutoreById(Long id);

	   Autore saveAutore(Autore autore);

	    void deleteAutore(Long id);
	}
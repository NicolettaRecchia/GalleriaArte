package it.uniroma3.GalleriaArte.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;


import it.uniroma3.GalleriaArte.model.Autore;
import it.uniroma3.GalleriaArte.model.Opera;


public interface OperaRepository extends CrudRepository<Opera, Long>  {

	List<Opera> findByTitolo(String titolo);
	List<Opera> findByTecnica(String tecnica);
	List<Opera> findByAnnoRealizzazione(String annoRealizzazione);
	List<Opera> findByAutore(Autore autore);

}
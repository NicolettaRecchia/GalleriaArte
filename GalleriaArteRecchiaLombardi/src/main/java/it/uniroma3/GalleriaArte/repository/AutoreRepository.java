package it.uniroma3.GalleriaArte.repository;


import java.util.List;
import org.springframework.data.repository.CrudRepository;
import it.uniroma3.GalleriaArte.model.Autore;



public interface AutoreRepository extends CrudRepository<Autore, Long>  {

	List<Autore> findByNome(String nome);
	List<Autore> findByDataNascita(String dataNascita);
	List<Autore> findByCognome(String cognome);
	List<Autore> findByNazionalita(String nazionalita);
	


}
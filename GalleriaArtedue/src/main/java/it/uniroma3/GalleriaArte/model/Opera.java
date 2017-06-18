package it.uniroma3.GalleriaArte.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Version;

@Entity
public class Opera {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	private Integer version;




	private String titolo;

	private String annoRealizzazione;

	private String tecnica;

	private int dimensione;
	@ManyToOne
	private Autore autore;

	public Opera(){
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public String getAnnoRealizzazione() {
		return annoRealizzazione;
	}


	public void setAnnoRealizzazione(String annoRealizzazione) {
		this.annoRealizzazione = annoRealizzazione;
	}


	public String getTecnica() {
		return tecnica;
	}


	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}


	public int getDimensione() {
		return dimensione;
	}


	public void setDimensione(int dimensione) {
		this.dimensione = dimensione;
	}

	public Integer getVersion() {
		return version;
	}


	public void setVersion(Integer version) {
		this.version = version;
	}


	public Autore getAutore(){
		return autore;
	}

	public void setAutore(Autore autore){
		this.autore=autore;
	}

}

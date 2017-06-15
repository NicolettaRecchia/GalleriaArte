package it.uniroma3.GalleriaArte.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
public class Autore {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	

    @Version
    private Integer version;
     private String AutoreId;
    
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	@Temporal(TemporalType.DATE)
	private Date dataNascita;
	@Temporal(TemporalType.DATE)
	private Date dataMorte;
	@Column(nullable = false)
	private String nazionalità;
	@OneToMany   (mappedBy ="autore")
	List<Opera> opere;
	
	
	
	
	public Autore(){
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public Date getDataMorte() {
		return dataMorte;
	}
	public void setDataMorte(Date dataMorte) {
		this.dataMorte = dataMorte;
	}
	public String getNazionalità() {
		return nazionalità;
	}
	public void setNazionalità(String nazionalità) {
		this.nazionalità = nazionalità;
	}
	public List<Opera> getOpere() {
		return opere;
	}
	public void setOpere(List<Opera> opere) {
		this.opere = opere;
	}
	
	 public Integer getVersion() {
	        return version;
	    }
	 
	    public void setVersion(Integer version) {
	        this.version = version;
	    }

		public String getAutoreId() {
			return AutoreId;
		}

		public void setAutoreId(String autoreId) {
			AutoreId = autoreId;
		}
}

package org.modelo.muchosamuchos;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/*EJEMPLO DE MUCHOS A MUCHOS 
 * 
 * ENCARGO---------------------------|< ENCEVE >|------------------------EVENTO
 * ID_ENC													ID_ENC											ID_ EVE
 * NOMBRE												ID_EVE											NOMBRE
 * 
 */
@Entity
public class Encargado{
	
	private int id_enc;
	private String nombre;
	private List<Evento>evento = new ArrayList<Evento>();
	
	@Id
	@Column(nullable = false)
	@GeneratedValue
	
	//GETTERS AND SETTERS
	public int getId_enc() {
		return id_enc;
	}
	public void setId_enc(int id_enc) {
		this.id_enc = id_enc;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//RELACION MUCHOS A MUCHOS
	@ManyToMany
	@JoinTable(name = "EncEve", 
						joinColumns = {@JoinColumn(name = "id_enc")},
						inverseJoinColumns = {@JoinColumn(name = "id_eve") })
	
	
	public List<Evento> getEvento() {
		return evento;
	}
	public void setEvento(List<Evento> evento) {
		this.evento = evento;
	}

}

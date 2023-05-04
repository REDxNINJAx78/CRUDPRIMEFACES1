package org.modelo.muchosamuchos;

import java.util.ArrayList;
import java.util.List;

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
public class Evento {
	private int id_eve;
	private String nombre;
	private List<Encargado> encargados = new ArrayList<Encargado>();
	
	@Id
	@Column(nullable = false)
	@GeneratedValue

	
	//GETTERS AND SETTERS
	public int getId_eve() {
		return id_eve;
	}
	public void setId_eve(int id_eve) {
		this.id_eve = id_eve;
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
							joinColumns = {@JoinColumn(name = "id_eve")},
							inverseJoinColumns = {@JoinColumn(name = "id_enc") })
		
	public List<Encargado> getEncargados() {
		return encargados;
	}
	public void setEncargados(List<Encargado> encargados) {
		this.encargados = encargados;
	}
	

}

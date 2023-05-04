package org.modelo.unoauno;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * EJEMPLO : CARDINALIDAD UNO A UNO
 * 
 * REPORTE____________________________DETALLE
 * ID																	 ID
 * NOMBRE														 DESCRIPCION
 * TIPO 																 COMENTARIO									
 * 																			 ID_REPORTE_PK
 * 
 */
@Entity
public class Reporte {
	private int id;
	private String nombre;
	private String tipo;
	
	@Id
	@Column(nullable = false)
	@GeneratedValue
	
	
	//GETTERS AND SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}

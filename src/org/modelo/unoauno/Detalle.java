package org.modelo.unoauno;

import javax.persistence.CascadeType;

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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

@Entity
public class Detalle {
	private int id;
	private String descripcion;
	private String comentario;
	private Reporte id_reporte_fk;
	
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	//JOIN: UNION, ASOCIA LAS COLUMNAS PRIMARY KEY Y FOREIGN KEY
	//LAZY: CARGA TODAS LAS TABLAS DE UNA EN UNA
	//EAGER: CARGA TODAS LAS TABLAS ASOCIADAS 
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_reporte_fk")
	
	public Reporte getId_reporte_fk() {
		return id_reporte_fk;
	}
	public void setId_reporte_fk(Reporte id_reporte_fk) {
		this.id_reporte_fk = id_reporte_fk;
	}
	
	
	

}

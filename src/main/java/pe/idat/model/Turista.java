package pe.idat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="turistas")
public class Turista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTurista;
	private String nombreTurista;
	private String nroCelular;
	private String direccion;

}

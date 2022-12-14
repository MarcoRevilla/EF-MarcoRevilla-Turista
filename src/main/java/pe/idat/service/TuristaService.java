package pe.idat.service;

import java.util.List;

import pe.idat.model.Turista;

public interface TuristaService {
	
	List<Turista> listar();
	void guardar(Turista turista);
}

package pe.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.model.Turista;
import pe.idat.repository.TuristaRepository;

@Service
public class TuristaServiceImpl implements TuristaService {
	
	@Autowired
	private TuristaRepository repository;
	
	@Override
	public List<Turista> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void guardar(Turista turista) {
		// TODO Auto-generated method stub
		repository.save(turista);
	}

}

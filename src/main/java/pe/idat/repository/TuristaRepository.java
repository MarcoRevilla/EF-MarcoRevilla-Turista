package pe.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.model.Turista;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer>{

}

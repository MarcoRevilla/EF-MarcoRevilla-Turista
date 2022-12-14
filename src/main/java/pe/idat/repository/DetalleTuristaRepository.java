package pe.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.model.TuristaDetalle;

@Repository
public interface DetalleTuristaRepository extends JpaRepository<TuristaDetalle, Integer>{

}

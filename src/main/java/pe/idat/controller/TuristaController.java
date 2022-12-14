package pe.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.idat.model.Turista;
import pe.idat.service.TuristaService;

@Controller
@RequestMapping("/api/turista/ef")
public class TuristaController {
	
	@Autowired
	private TuristaService service;
	
	@GetMapping("/listar")
    public @ResponseBody List<Turista> listar(){
        return service.listar();
    }
	
	@PostMapping("/guardar")
    public @ResponseBody void guardar(@RequestBody Turista tur) {
        service.guardar(tur);
    }

}

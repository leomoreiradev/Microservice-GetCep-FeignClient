package getcep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import getcep.entities.Cep;
import getcep.services.CepService;


@RestController
public class CepController {

	@Autowired
	private CepService cepService;

	@GetMapping("/consulta-cep")
	public ResponseEntity<Cep> findCep(@RequestParam String cep) {
		
		Cep cepResponse = cepService.findCep(cep);
		
	    return ResponseEntity.ok().body(cepResponse);
    }
}

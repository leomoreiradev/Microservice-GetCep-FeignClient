package getcep.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import getcep.entities.Cep;
import getcep.feign.CepFeign;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CepService {
	
	@Autowired
	private CepFeign cepFeign;
	

	public Cep findCep(String cep) {
		log.info("Fazendo a requisição ao viacep - Dados da req:{}", cep);
		Cep cepResponse = cepFeign.findCep(cep);
	  
		log.info("Retorno da requisição ao viacep - Dados da res:{}:",cepResponse);
		return cepResponse;
		
	}
}

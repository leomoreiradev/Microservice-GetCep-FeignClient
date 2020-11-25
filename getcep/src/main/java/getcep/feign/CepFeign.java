package getcep.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import getcep.entities.Cep;


@FeignClient(value = "findCep", url = "https://viacep.com.br/ws")

public interface CepFeign {
	@GetMapping(value = "/{cep}/json/")
    Cep findCep(@PathVariable("cep") String cep);	
}

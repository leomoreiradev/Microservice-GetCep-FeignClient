package getcep.entities;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Cep {


	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String Uf;
	
	
	
	
}

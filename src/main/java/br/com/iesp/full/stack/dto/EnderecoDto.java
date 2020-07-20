package br.com.iesp.full.stack.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EnderecoDto {
	
	private String cep;
	private String uf;
	private String rua;
	private String bairro;
	private String cidade;
	private int numero;
			
	
}

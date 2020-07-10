package br.com.iesp.full.stack.entidades;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Produto extends Anuncio {
	
	@Column(name="quantidade")
	private Integer quantidade;	

}

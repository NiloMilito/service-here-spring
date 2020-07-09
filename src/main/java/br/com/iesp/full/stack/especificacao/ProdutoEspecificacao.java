package br.com.iesp.full.stack.especificacao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import br.com.iesp.full.stack.entidades.Produto;

public class ProdutoEspecificacao implements Specification<Produto>{

	private static final long serialVersionUID = -2364171431459818290L;
	
	private Produto filtro;

	public ProdutoEspecificacao(Produto filtro) {
		super();
		this.filtro = filtro;
	}

	@Override
	public Predicate toPredicate(Root<Produto> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		Predicate predicate = criteriaBuilder.disjunction();

		if (filtro.getDescricao() != null) {
			predicate.getExpressions().add(criteriaBuilder.like(criteriaBuilder.upper(root.get("descricao")), "%"+ filtro.getDescricao().toUpperCase() +"%"));
		}

		if (filtro.getData() != null) {
			predicate.getExpressions().add(criteriaBuilder.and(criteriaBuilder.equal(root.get("data"), filtro.getData())));
		}
		
		if (filtro.getValor() != null) {
			predicate.getExpressions().add(criteriaBuilder.and(criteriaBuilder.equal(root.get("valor"), filtro.getValor())));
		}
		
		if (filtro.getVendedor() != null) {
			predicate.getExpressions().add(criteriaBuilder.and(criteriaBuilder.equal(root.get("vendedor"), filtro.getVendedor())));
		}
		
		return predicate;
	}

}

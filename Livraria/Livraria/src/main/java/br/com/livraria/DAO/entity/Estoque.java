package br.com.livraria.DAO.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Estoque extends GenericModel{
	
	
	@Column(nullable = false, precision = 7, scale = 2)
	private double preco_venda;
	
	@Column(length = 5, nullable = false)
	private int  qtde_exemplares;
	
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Livros lviros;


	public double getPreco_venda() {
		return preco_venda;
	}


	public void setPreco_venda(double preco_venda) {
		this.preco_venda = preco_venda;
	}


	public int getQtde_exemplares() {
		return qtde_exemplares;
	}


	public void setQtde_exemplares(int qtde_exemplares) {
		this.qtde_exemplares = qtde_exemplares;
	}


	public Livros getLviros() {
		return lviros;
	}


	public void setLviros(Livros lviros) {
		this.lviros = lviros;
	}
	

	
}

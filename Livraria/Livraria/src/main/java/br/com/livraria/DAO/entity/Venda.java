package br.com.livraria.DAO.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Venda extends GenericModel {

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date data_venda;

	@Column(nullable = false)
	private Short quantidade;

	@Column(nullable = false, precision = 6, scale = 2)
	private BigDecimal precoTotal;

	@ManyToOne
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Funcionario funcionario;
	
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Livros livros;


	public Date getData_venda() {
		return data_venda;
	}


	public void setData_venda(Date data_venda) {
		this.data_venda = data_venda;
	}


	public Short getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Short quantidade) {
		this.quantidade = quantidade;
	}


	public BigDecimal getPrecoTotal() {
		return precoTotal;
	}


	public void setPrecoTotal(BigDecimal precoTotal) {
		this.precoTotal = precoTotal;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}


	public Livros getLivros() {
		return livros;
	}


	public void setLivros(Livros livros) {
		this.livros = livros;
	}
	
	
	
	
	

	
}	
	
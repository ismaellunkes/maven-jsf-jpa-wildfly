package br.senai.sc.models;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Pedido implements Serializable{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
    @Size(min = 1, max = 55)
	private String cliente;
	
	private Instant instante;
	
	public Pedido() { }
	
	public Pedido(Long id, @NotNull @Size(min = 1, max = 55) String cliente, Instant instante) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.instante = instante;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Instant getInstante() {
		return instante;
	}

	public void setInstante(Instant instante) {
		this.instante = instante;
	}
		
}

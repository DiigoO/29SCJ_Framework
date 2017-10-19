package br.com.fiap.vo;

import java.io.Serializable;

public class EmpresaVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4258693270070822287L;
	
	private String codigo;
	private String nome;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}

package br.com.fiap.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ColaboradorVO implements Serializable{
	
	private String codigo;
	private String nome;
	private EmpresaVO empresaVO;
	
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
	public EmpresaVO getEmpresaVO() {
		
		if(empresaVO == null)
			empresaVO = new EmpresaVO();
		
		return empresaVO;
	}
	public void setEmpresaVO(EmpresaVO empresaVO) {
		this.empresaVO = empresaVO;
	}
	
}

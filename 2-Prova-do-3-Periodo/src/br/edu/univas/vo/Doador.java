package br.edu.univas.vo;

public class Doador extends TipoSanguineo{
	
	private long cpf;
	private TipoSanguineo tipoSanguineo;
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	

}

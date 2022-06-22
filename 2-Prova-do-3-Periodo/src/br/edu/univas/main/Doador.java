package br.edu.univas.main;

public class Doador extends TipoSanguineo{
	
	private long cpf;
	private TipoSanguineo tipoSanguineo;
	private long getCpf() {
		return cpf;
	}
	private void setCpf(long cpf) {
		this.cpf = cpf;
	}
	private TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}
	private void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	
	
	
	
}

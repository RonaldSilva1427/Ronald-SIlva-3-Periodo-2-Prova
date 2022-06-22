package br.edu.univas.main;

public class DoadorController {

	private Doador cadastrarDoador;
	private Doador getCadastrarDoador() {
		return cadastrarDoador;
	}
	private void setCadastrarDoador(Doador cadastrarDoador) {
		this.cadastrarDoador = cadastrarDoador;
	}
	private TipoSanguineo getCadastraDoacao() {
		return cadastraDoacao;
	}
	private void setCadastraDoacao(TipoSanguineo cadastraDoacao) {
		this.cadastraDoacao = cadastraDoacao;
	}
	private TipoSanguineo cadastraDoacao;
	
	
}

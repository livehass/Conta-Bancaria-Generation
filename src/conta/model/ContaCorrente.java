package conta.model;

public class ContaCorrente {

	private String contaCorrente;
	private Boolean testeOkContaCOrrente;
	
	
	public ContaCorrente(String contaCorrente, Boolean testeOkContaCOrrente) {
		super();
		this.contaCorrente = contaCorrente;
		this.testeOkContaCOrrente = testeOkContaCOrrente;
	}


	public String getContaCorrente() {
		return contaCorrente;
	}


	public void setContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}


	public Boolean getTesteOkContaCOrrente() {
		return testeOkContaCOrrente;
	}


	public void setTesteOkContaCOrrente(Boolean testeOkContaCOrrente) {
		this.testeOkContaCOrrente = testeOkContaCOrrente;
	}
	
	public void testaContaCorrente() {
		System.out.println("Conta Corrente"+ this.contaCorrente+"Teste Conta Corrente:"+ this.testeOkContaCOrrente);
	}
}

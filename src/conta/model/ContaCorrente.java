package conta.model;

public class ContaCorrente {

	private String contaCorrente;
	private Boolean testeOkContaCorrente;
	
	
	public ContaCorrente(String contaCorrente, Boolean testeOkContaCOrrente) {
		super();
		this.contaCorrente = contaCorrente;
		this.testeOkContaCorrente = testeOkContaCOrrente;
	}


	public String getContaCorrente() {
		return contaCorrente;
	}


	public void setContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}


	public Boolean getTesteOkContaCOrrente() {
		return testeOkContaCorrente;
	}


	public void setTesteOkContaCOrrente(Boolean testeOkContaCOrrente) {
		this.testeOkContaCorrente = testeOkContaCOrrente;
	}
	
	public void testaContaCorrente() {
		System.out.println(this.contaCorrente + this.testeOkContaCorrente);
	}
}

package conta.model;

public class ContaPoupanca {

	private String testeContaPoupanca;
	private Boolean TesteOkContaPoupanca;

	public ContaPoupanca(String testeContaPoupanca, Boolean testeOkContaPoupanca) {
		super();
		this.testeContaPoupanca = testeContaPoupanca;
		TesteOkContaPoupanca = testeOkContaPoupanca;
	}

	public String getTesteContaPoupanca() {
		return testeContaPoupanca;
	}

	public void setTesteContaPoupanca(String testeContaPoupanca) {
		this.testeContaPoupanca = testeContaPoupanca;
	}

	public Boolean getTesteOkContaPoupanca() {
		return TesteOkContaPoupanca;
	}

	public void setTesteOkContaPoupanca(Boolean testeOkContaPoupanca) {
		TesteOkContaPoupanca = testeOkContaPoupanca;
	}
	public void TestContaPoupanca() {
		System.out.println(this.testeContaPoupanca+this.TesteOkContaPoupanca);
	}
}

package exercicio1.tads;

public class Caixa {
	
	private Caixa proxima;
	private int conteudo;
	
	public Caixa(Caixa proxima, int conteudo) {
		super();
		this.proxima = proxima;
		this.conteudo = conteudo;
	}
	public Caixa getProxima() {
		return proxima;
	}
	public void setProxima(Caixa proxima) {
		this.proxima = proxima;
	}
	public int getConteudo() {
		return conteudo;
	}
	public void setConteudo(int conteudo) {
		this.conteudo = conteudo;
	}
	
	

}

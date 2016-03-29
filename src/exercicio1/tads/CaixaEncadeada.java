package exercicio1.tads;

public class CaixaEncadeada {
	
	private CaixaEncadeada proxima;
	private CaixaEncadeada anterior;
	private int conteudo;
	
	public CaixaEncadeada(CaixaEncadeada proxima, CaixaEncadeada anterior, int conteudo) {
		super();
		this.proxima = proxima;
		this.conteudo = conteudo;
		this.anterior = anterior;
	}
	public CaixaEncadeada getProxima() {
		return proxima;
	}
	public void setProxima(CaixaEncadeada proxima) {
		this.proxima = proxima;
	}
	public int getConteudo() {
		return conteudo;
	}
	public void setConteudo(int conteudo) {
		this.conteudo = conteudo;
	}
	public CaixaEncadeada getAnterior() {
		return anterior;
	}
	public void setAnterior(CaixaEncadeada anterior) {
		this.anterior = anterior;
	}
	

}

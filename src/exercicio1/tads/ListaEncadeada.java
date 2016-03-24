package exercicio1.tads;

public class ListaEncadeada {
	
	private Caixa primeira;
	private Caixa ultima;
	
	public ListaEncadeada(){
		System.out.println("Criando lista vazia...");
		primeira = null;
		ultima = null;
	};
	
	public void inserirNoTopo(int valor){
		System.out.println("Inserindo Elemento no Topo...");
		Caixa caixa = new Caixa(null, valor); //Criando nova célula
		if(this.primeira==null){
			this.primeira = caixa;
			this.ultima = this.primeira;
		}else{
			caixa.setProxima(this.primeira);
			this.primeira = caixa;
		}
		
	};
	public void imprimirLista(){
		System.out.println("Imprimindo Lista...");
		Caixa atual = primeira;
		if(atual==null){ //Lista Vazia
			System.out.println("::Lista Vazia::");
		}else{
			System.out.print("::[ ");
			do{
				System.out.print(atual.getConteudo()+" ");
				atual = atual.getProxima();
			}while(atual!=null);
			System.out.print("]::\n");
		}
	};
	public Caixa imprimirListaComRecursao(Caixa atual){
		
		if(atual==null){
			return null;
		}else{
			System.out.println(atual.getConteudo());
		    return imprimirListaComRecursao(atual.getProxima());
		}
	};
	public void imprimirListaOrdemReversa(){};
	public void checkListaVazia(){};
	public void buscarElemento(){};
	public void removerElemento(){};
	public void removerElementoComRecursao(){};
	public void liberarLista(){}

	public Caixa getPrimeira() {
		return primeira;
	}

	public void setPrimeira(Caixa primeira) {
		this.primeira = primeira;
	}

	public Caixa getUltima() {
		return ultima;
	}

	public void setUltima(Caixa ultima) {
		this.ultima = ultima;
	};
	
	
	
}

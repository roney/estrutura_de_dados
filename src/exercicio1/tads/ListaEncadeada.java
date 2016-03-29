package exercicio1.tads;

public class ListaEncadeada {
	
	private Caixa primeira;
	private Caixa ultima;
	
	public ListaEncadeada(){
		System.out.println("Criando lista vazia");
		primeira = null;
		ultima = null;
	};
	
	public void inserirNoTopo(int valor){
		System.out.println("função inserir elemento "+valor+" no topo");
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
		System.out.print("função imprime: ");
		Caixa atual = primeira;
		if(atual==null){ //Lista Vazia
			System.out.print("");
		}else{
			do{
				System.out.print(atual.getConteudo()+" ");
				atual = atual.getProxima();
			}while(atual!=null);
		}
		System.out.println();
	};
	public void imprimirListaComRecursao(Caixa atual){
		System.out.print("função imprime recursiva original: ");
		imprimirComRecursao(atual);
		System.out.println("");
	}
	public void imprimirComRecursao(Caixa atual){	
		if(atual!=null){
			System.out.print(atual.getConteudo() + " ");
		    imprimirComRecursao(atual.getProxima());
		}
	};
	public void imprimirListaOrdemReversa(Caixa atual){
		System.out.print("função imprime recursiva invertida: ");
		imprimirOrdemReversa(atual);
		System.out.println("");
	};
	public void imprimirOrdemReversa(Caixa atual){
		if(atual!=null){
			imprimirOrdemReversa(atual.getProxima());
			System.out.print(atual.getConteudo()+ " ");
		}
	};
	public int checkListaVazia(Caixa atual){
		if(atual==null){
			System.out.println("função verifica lista vazia: " + 1 + " (vazia)");
			return 1;
		}else{
			System.out.println("função verifica lista vazia: " + 0 + " (não vazia)");
			return 0;
		}
	};
	public Caixa buscarElemento(int elemento){
		System.out.print("função buscar elemento: ");
		for(Caixa atual=primeira;atual!=null;atual=atual.getProxima()){
			if(atual.getConteudo()==elemento){
				return atual;
			}
		}
		return null;
	};
	public Caixa removerElemento(int elemento){
		System.out.print("função remover elemento "+elemento+": ");
		Caixa anterior =  null; /* ponteiro para elemento anterior */
		Caixa atual = primeira;     /* ponteiro para percorrer a lista */
		/* procura elemento na lista, guardando anterior */
		while(atual!=null && atual.getConteudo()!=elemento){
			anterior = atual;
			atual = atual.getProxima();
		}
		/* verifica se achou elemento */
		if(atual==null){
			System.out.print("elemento não encontrado!\n");
			return primeira; /* não achou: retorna lista original */
		}
		/* achou: retira */
		if(anterior==null){
			primeira = atual.getProxima();/* retira elemento do inicio */
		}else{
			anterior.setProxima(atual.getProxima()); 
		}
		atual = null;
		System.out.print("elemento removido com sucesso!\n");
		return primeira;
	};
	public void removerElementoComRecursao(int elemento){
		System.out.print("função remover elemento com recursão"+elemento+": ");
		
		
	};
	public void liberarLista(){
		System.out.println("função libera lista");
		while(primeira!=null){
			primeira = primeira.getProxima();
		}
		primeira =null;
	}

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

package exercicio1.tads;

public class ListaEncadeada {
	
	private Caixa primeira;
	
	public ListaEncadeada(){
		System.out.println("Criando lista vazia");
		primeira = null;
	};
	
	public void inserirNoTopo(int valor){
		System.out.println("fun��o inserir elemento "+valor+" no topo");
		Caixa caixa = new Caixa(null, valor); //Criando nova c�lula
		if(this.primeira==null){
			this.primeira = caixa;
		}else{
			caixa.setProxima(this.primeira);
			this.primeira = caixa;
		}
		
	};
	public void imprimirLista(){
		System.out.print("fun��o imprime: ");
		Caixa atual = primeira;
		while(atual!=null){
			System.out.print(atual.getConteudo()+" ");
			atual = atual.getProxima();
		};
		System.out.println();
	};
	public void imprimirListaComRecursao(Caixa atual){
		System.out.print("fun��o imprime recursiva original: ");
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
		System.out.print("fun��o imprime recursiva invertida: ");
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
			System.out.println("fun��o verifica lista vazia: " + 1 + " (vazia)");
			return 1;
		}else{
			System.out.println("fun��o verifica lista vazia: " + 0 + " (n�o vazia)");
			return 0;
		}
	};
	public Caixa buscarElemento(int elemento){
		System.out.print("fun��o buscar elemento: ");
		for(Caixa atual=primeira;atual!=null;atual=atual.getProxima()){
			if(atual.getConteudo()==elemento){
				return atual;
			}
		}
		return null;
	};
	public Caixa removerElemento(int elemento){
		System.out.print("fun��o remover elemento "+elemento+": ");
		Caixa anterior =  null; /* ponteiro para elemento anterior */
		Caixa atual = primeira;     /* ponteiro para percorrer a lista */
		/* procura elemento na lista, guardando anterior */
		while(atual!=null && atual.getConteudo()!=elemento){
			anterior = atual;
			atual = atual.getProxima();
		}
		/* verifica se achou elemento */
		if(atual==null){
			System.out.print("elemento n�o encontrado!\n");
			return primeira; /* n�o achou: retorna lista original */
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
	public Caixa removerElementoComRecursao(Caixa atual, Caixa anterior, int elemento){
		if(atual==null){ //n�o encontrou
			return primeira;
		}
		if(atual.getConteudo()==elemento){
			if(anterior==null){
				primeira = atual.getProxima(); //Primeiro Elemento
			}else{
				anterior.setProxima(atual.getProxima()); 
				atual = null;
				return primeira;
			}
		}else{
			removerElementoComRecursao(atual.getProxima(),atual, elemento);
		}
		return primeira;
		
	};
	public void liberarLista(){
		System.out.println("fun��o libera lista");
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
	
	
}

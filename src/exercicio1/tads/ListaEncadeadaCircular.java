package exercicio1.tads;

public class ListaEncadeadaCircular {
	
	private Caixa primeira;
	
	public ListaEncadeadaCircular(){
		System.out.println("Criando lista vazia");
		primeira = null;
	};
	
	public void inserir(int valor){
		System.out.println("função inserir elemento "+valor);

		Caixa novo = new Caixa(null, valor); //Criando nova caixa
		if(primeira==null){
			primeira = novo;
			primeira.setProxima(primeira);
			return;
		}
		Caixa atual = primeira; /* ponteiro para percorrer a lista */
		Caixa anterior = primeira;
		while(atual.getProxima()!=primeira){
			anterior = atual;
			atual = atual.getProxima();
		}
		atual.setProxima(novo);
		novo.setProxima(primeira);
		
	};
	public void imprimirLista(){
		System.out.print("função imprime: ");
		Caixa atual = primeira;
		do{
			System.out.print(atual.getConteudo()+" ");
			atual = atual.getProxima();
		}while(atual!=primeira);
		System.out.println();
	};
	public void imprimirListaComRecursao(Caixa atual){
		System.out.print("função imprime com recursão: ");
		imprimirComRecursao(atual);
		System.out.println("");
	}
	public void imprimirComRecursao(Caixa atual){	
		if(atual!=null){
			System.out.print(atual.getConteudo() + " ");
			if(atual.getProxima()!=primeira){
				imprimirComRecursao(atual.getProxima());
			}		    
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
		if(primeira==null){
			System.out.print("elemento não encontrado!\n");
			return null;
		}
		if(primeira.getConteudo()==elemento){
			System.out.print("elemento encontrado!\n");
			return primeira;
		}
		Caixa atual=primeira;
		while(atual.getProxima()!=primeira){
			atual = atual.getProxima();
			if(atual.getConteudo()==elemento){
				System.out.print("elemento encontrado!\n");
				return primeira;
			}
		}
		System.out.print("elemento não encontrado!\n");
		return null;
	};
	public Caixa removerElemento(Caixa atual,int elemento){
		System.out.print("função remover elemento "+elemento+": ");
		Caixa anterior = primeira; 
		if(atual==null){
			System.out.print("elemento não encontrado");
			return primeira; 
		}
		do{
			anterior = atual;
			atual = atual.getProxima();
		}while(atual!=primeira);
		
		if(atual.getConteudo()==elemento){
			anterior.setProxima(atual.getProxima());
			primeira = atual.getProxima();
			atual = null;
			System.out.print("elemento removido com sucesso!\n");
			return primeira;
		}else{
			while(atual.getProxima()!=primeira){
				if(atual.getConteudo()==elemento){
					anterior.setProxima(atual.getProxima());
					System.out.print("elemento removido com sucesso!\n");
					return primeira;
				}
				anterior = atual;
				atual = atual.getProxima();
			}
			if(atual.getConteudo()==elemento){
				anterior.setProxima(atual.getProxima());
				primeira = atual.getProxima();
				atual = null;
				System.out.print("elemento removido com sucesso!\n");
				return primeira;
			}
		}
		
		System.out.print("elemento não encontrado!\n");
		return primeira; 
		
	};
	public Caixa removerElementoComRecursao(Caixa atual, Caixa anterior, int elemento){
		if(atual==null){ //não encontrou
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
	
	
}

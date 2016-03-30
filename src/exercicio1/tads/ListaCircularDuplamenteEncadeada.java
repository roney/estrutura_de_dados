package exercicio1.tads;

public class ListaCircularDuplamenteEncadeada {

private CaixaEncadeada primeira;
	
	public ListaCircularDuplamenteEncadeada(){
		System.out.println("Criando lista vazia");
		primeira = null;
	};
	
	public void inserir(int valor){
		System.out.println("função inserir elemento "+valor);

		CaixaEncadeada novo = new CaixaEncadeada(null, null, valor); //Criando nova caixa
		if(primeira==null){
			primeira = novo;
			primeira.setProxima(primeira);
			primeira.setAnterior(primeira);
			return;
		}
		CaixaEncadeada atual = primeira; /* ponteiro para percorrer a lista */
		while(atual.getProxima()!=primeira){
			atual = atual.getProxima();
		}
		
		novo.setProxima(primeira);
		novo.setAnterior(atual);
		atual.setProxima(novo);	
		primeira.setAnterior(novo);
	};
	public void imprimirLista(){
		System.out.print("função imprime: ");
		CaixaEncadeada atual = primeira;
		if(primeira!=null){
			do{
				System.out.print(atual.getConteudo()+" ");
				atual = atual.getProxima();
			}while(atual!=primeira);
		}
		System.out.println();
		
	};
	public void imprimirListaCompleta(){
		System.out.print("função imprime completa: ");
		CaixaEncadeada atual = primeira;
		if(primeira!=null){
			do{
				System.out.print("["+atual.getAnterior().getConteudo()+","+atual.getConteudo()+","+atual.getProxima().getConteudo()+"]");
				atual = atual.getProxima();
			}while(atual!=primeira);
		}
		System.out.println();
		
	};
	
	public void imprimirListaComRecursao(CaixaEncadeada atual){
		System.out.print("função imprime com recursão: ");
		imprimirComRecursao(atual);
		System.out.println("");
	}
	public void imprimirComRecursao(CaixaEncadeada atual){	
		if(atual!=null){
			System.out.print(atual.getConteudo() + " ");
			if(atual.getProxima()!=primeira){
				imprimirComRecursao(atual.getProxima());
			}		    
		}
	};
	public void imprimirListaOrdemReversa(CaixaEncadeada atual){
		System.out.print("função imprime recursiva invertida: ");
		imprimirOrdemReversa(atual);
		System.out.println("");
	};
	public void imprimirOrdemReversa(CaixaEncadeada atual){
		if(atual!=null){
			imprimirOrdemReversa(atual.getProxima());
			System.out.print(atual.getConteudo()+ " ");
		}
	};
	public int checkListaVazia(CaixaEncadeada atual){
		if(atual==null){
			System.out.println("função verifica lista vazia: " + 1 + " (vazia)");
			return 1;
		}else{
			System.out.println("função verifica lista vazia: " + 0 + " (n�o vazia)");
			return 0;
		}
	};
	public CaixaEncadeada buscarElemento(int elemento){
		System.out.print("função buscar elemento: ");
		if(primeira==null){
			System.out.print("elemento n�o encontrado!\n");
			return null;
		}
		if(primeira.getConteudo()==elemento){
			System.out.print("elemento encontrado!\n");
			return primeira;
		}
		CaixaEncadeada atual=primeira;
		while(atual.getProxima()!=primeira){
			atual = atual.getProxima();
			if(atual.getConteudo()==elemento){
				System.out.print("elemento encontrado!\n");
				return primeira;
			}
		}
		System.out.print("elemento n�o encontrado!\n");
		return null;
	};
	
	public CaixaEncadeada removerElemento(CaixaEncadeada atual,int elemento){
		System.out.print("função remover elemento "+elemento+": ");
		if(atual==null){
			System.out.print("elemento não encontrado");
			return primeira; 
		}
		
		if(atual.getConteudo()==elemento){
			primeira = atual.getProxima();
			atual.getAnterior().setProxima(primeira);
			primeira.setAnterior(atual.getAnterior());
			atual = null;
			System.out.print(" elemento removido com sucesso!\n");
			return primeira;
		}else{
			atual = atual.getProxima();
			while(atual!=primeira){
				if(atual.getConteudo()==elemento){
					atual.getAnterior().setProxima(atual.getProxima());
					atual.getProxima().setAnterior(atual.getAnterior());
					atual = null;
					System.out.print("elemento removido com sucesso!\n");
					return primeira;
				}
				atual = atual.getProxima();
			}
		}
		
		System.out.print("elemento não encontrado!\n");
		return primeira; 
		
	};
	public CaixaEncadeada removerElementoComRecursao(CaixaEncadeada atual, int elemento){
		if(atual==null){
			System.out.print("elemento não encontrado");
			return primeira; 
		}
		
		if(atual.getConteudo()==elemento){
			atual.getAnterior().setProxima(atual.getProxima());
			atual.getProxima().setAnterior(atual.getAnterior());
			atual = null;			
			System.out.print(" elemento removido com sucesso!\n");
			return primeira;
		}else{
			if(atual.getProxima()!=primeira){
				return removerElementoComRecursao(atual.getProxima(),elemento);
			}else{
				System.out.print("elemento não encontrado");
				return primeira;
			}
		}
		
	};
	public void liberarLista(CaixaEncadeada atual){
		CaixaEncadeada aux = atual;
		while(atual.getProxima()!=primeira){
			aux = atual;
			atual = null;
			atual = aux.getProxima();
		}
		atual = null;
		primeira =null;
	}

	public CaixaEncadeada getPrimeira() {
		return primeira;
	}

	public void setPrimeira(CaixaEncadeada primeira) {
		this.primeira = primeira;
	}
	

}

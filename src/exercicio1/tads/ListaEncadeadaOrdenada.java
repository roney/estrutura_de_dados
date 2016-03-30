package exercicio1.tads;

public class ListaEncadeadaOrdenada {

	private Caixa primeira;
	
	
	public ListaEncadeadaOrdenada(){
		System.out.println("criar lista vazia");
		primeira = null;
	};
	
	public void inserirElemento(int valor){
		System.out.println("função inserir elemento "+valor);
		Caixa anterior = null;  /* ponteiro para elemento anterior */
		Caixa atual = primeira; /* ponteiro para percorrer a lista */
		/* procura posição para inserção */
		while(atual!=null && atual.getConteudo()<valor){
			anterior = atual;
			atual = atual.getProxima();
		}
		/* cria novo elemento */
		Caixa novo = new Caixa(null, valor); //Criando nova célula
		/* encadeia elemento */
		if(anterior==null){
			novo.setProxima(primeira);
			primeira = novo;
		}else{
			novo.setProxima(anterior.getProxima());
			anterior.setProxima(novo);
		}
	};
	public void imprimirLista(){
		System.out.print("função imprime: ");
		Caixa atual = primeira;
		while(atual!=null){
			System.out.print(atual.getConteudo()+" ");
			atual = atual.getProxima();
		};
		System.out.println();
	};
	public void imprimirListaComRecursao(Caixa atual){
		System.out.print("função imprime recursiva: ");
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
			System.out.println("função verifica lista vazia: " + 0 + " (n�o vazia)");
			return 0;
		}
	};
	public Caixa buscarElemento(int elemento){
		System.out.print("função buscar elemento: ");
		Caixa atual=primeira;
		while(atual!=null&&atual.getConteudo()<=elemento){
			if(atual.getConteudo()==elemento){
				return atual;
			}
			atual = atual.getProxima();
		}
		return null;
	};
	public Caixa removerElemento(int elemento){
		System.out.print("função remover elemento "+elemento+": ");
		Caixa anterior =  null; /* ponteiro para elemento anterior */
		Caixa atual = primeira;     /* ponteiro para percorrer a lista */
		/* procura elemento na lista, guardando anterior */
		while(atual!=null && (atual.getConteudo()!=elemento || atual.getConteudo()<elemento)){
			anterior = atual;
			atual = atual.getProxima();
		}
		/* verifica se achou elemento */
		if(atual==null || atual.getConteudo()!=elemento){
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
		if(atual==null || atual.getConteudo()>elemento){ //n�o encontrou
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
	
	public boolean compararListas(Caixa lista, Caixa lista2){
		System.out.print("função comparar listas: ");
		for(Caixa atual = lista;atual!=null;atual=atual.getProxima()){
			if(lista2==null || atual.getConteudo()!=lista2.getConteudo()){
				return false;
			}
			lista2 = lista2.getProxima();
		}		
		if(lista2==null){
			return true;
		}
		
		return false;
	}

	public Caixa getPrimeira() {
		return primeira;
	}

	public void setPrimeira(Caixa primeira) {
		this.primeira = primeira;
	}

}

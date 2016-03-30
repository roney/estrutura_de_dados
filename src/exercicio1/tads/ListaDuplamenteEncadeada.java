package exercicio1.tads;

public class ListaDuplamenteEncadeada {
	
	private CaixaEncadeada primeira;
	
	public ListaDuplamenteEncadeada(){
		System.out.println("Criando lista vazia");
		primeira = null;
	};
	
	public void inserir(int valor){
		System.out.println("função inserir elemento "+valor);
		CaixaEncadeada novo = new CaixaEncadeada(null, null, valor); //Criando nova caixa
		if(this.primeira==null){
			this.primeira = novo;
		}else{
			CaixaEncadeada atual = primeira;
			while(atual.getProxima()!=null){
				atual = atual.getProxima();
			}
			atual.setProxima(novo);
			novo.setAnterior(atual);
		}
		
	};
	public void imprimirLista(){
		System.out.print("função imprime: ");
		CaixaEncadeada atual = primeira;
		while(atual!=null){
			System.out.print(atual.getConteudo()+" ");
			atual = atual.getProxima();
		};
		System.out.println();
	};
	public void imprimirListaComRecursao(CaixaEncadeada atual){
		System.out.print("função imprime recursiva: ");
		imprimirComRecursao(atual);
		System.out.println("");
	}
	public void imprimirComRecursao(CaixaEncadeada atual){	
		if(atual!=null){
			System.out.print(atual.getConteudo() + " ");
		    imprimirComRecursao(atual.getProxima());
		}
	};

	public void imprimirListaOrdemReversa(CaixaEncadeada atual){
		System.out.print("função imprime recursiva invertida: ");
		CaixaEncadeada ultimo = null;
		if(atual==null){ //Lista Vazia
			System.out.print("");
		}else{
			do{
				ultimo = atual;
				atual = atual.getProxima();
			}while(atual!=null);
		}
		while(ultimo!=null){
			System.out.print(ultimo.getConteudo()+" ");
			ultimo = ultimo.getAnterior();
		}
		System.out.println();
		
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
		System.out.print("função buscar elemento("+elemento+"): ");
		CaixaEncadeada atual = primeira;
		while(atual!=null){
			if(atual.getConteudo()==elemento){
				System.out.print("elemento encontrado!\n");
				return atual;
			}
			atual = atual.getProxima();
		}
		System.out.print("elemento n�o encontrado!\n");
		return null;
	};
	public CaixaEncadeada removerElemento(int elemento){
		System.out.print("função remover elemento("+elemento+"): ");
		CaixaEncadeada atual = primeira;     /* ponteiro para percorrer a lista */
		/* procura elemento na lista, guardando anterior */
		while(atual!=null && atual.getConteudo()!=elemento){
			atual = atual.getProxima();
		}
		/* verifica se achou elemento */
		if(atual==null){
			System.out.print("elemento n�o encontrado!\n");
			return primeira; /* n�o achou: retorna lista original */
		}
		/* achou: retira */
		if(atual.getAnterior()==null){
			primeira = atual.getProxima();/* retira elemento do inicio */
			primeira.setAnterior(null);
		}else{
			atual.getAnterior().setProxima(atual.getProxima());
			if(atual.getProxima()!=null){
				atual.getProxima().setAnterior(atual.getAnterior());
			}
		}
		atual = null;
		System.out.print("elemento removido com sucesso!\n");
		return primeira;
	};
	public CaixaEncadeada removerElementoComRecursao(CaixaEncadeada atual, int elemento){
		if(atual==null){ //n�o encontrou
			return primeira;
		}
		if(atual.getConteudo()==elemento){
			if(atual.getAnterior()==null){
				primeira = atual.getProxima(); //Primeiro Elemento
				primeira.setAnterior(null);
				atual =null;
				return primeira;
			}else{
				atual.getAnterior().setProxima(atual.getProxima());
				if(atual.getProxima()!=null){
					atual.getProxima().setAnterior(atual.getAnterior());
				}
				atual = null;
				return primeira;
			}
		}else{
			removerElementoComRecursao(atual.getProxima(), elemento);
		}
		return primeira;
		
	};
	public void liberarLista(){
		System.out.println("função libera lista");
		CaixaEncadeada atual = null;
		while(primeira!=null){
			atual = primeira;
			primeira = primeira.getProxima();
			atual = null;
		}
		primeira = null;
	}
	
	public boolean compararListas(CaixaEncadeada lista2){
		System.out.print("função comparar listas: ");
		for(CaixaEncadeada atual = primeira;atual!=null;atual=atual.getProxima()){
			if(lista2==null || atual.getConteudo()!=lista2.getConteudo()){
				System.out.print("diferentes\n");
				return false;
			}
			lista2 = lista2.getProxima();
		}		
		if(lista2==null){
			System.out.print("iguais\n");
			return true;
		}
		System.out.print("diferentes\n");
		return false;
	}

	public CaixaEncadeada getPrimeira() {
		return primeira;
	}

	public void setPrimeira(CaixaEncadeada primeira) {
		this.primeira = primeira;
	}
	
	
}

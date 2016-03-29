package exercicio1.tads;

public class TesteListaEncadeada {

	public static void main(String[] args) {
		
		
//		1. Criar uma lista vazia
		ListaEncadeada lista = new ListaEncadeada();	
		
//		2. Inserir elemento no in�cio;
		lista.inserirNoTopo(10);	
		lista.inserirNoTopo(40);
		lista.inserirNoTopo(50);
		
//		3. Imprimir os valores armazenados na lista;
		lista.imprimirLista();
		
//		4. Imprimir os valores armazenados na lista usando recurs�o;
		lista.imprimirListaComRecursao(lista.getPrimeira());
		
//		5. Imprimir os valores armazenados na lista em ordem reversa (da cauda para a cabe�a da lista);
		lista.imprimirListaOrdemReversa(lista.getPrimeira());
		
//		6. Verificar se a lista est� vazia (retorna 1 se vazia ou 0 se n�o vazia);
		lista.checkListaVazia(lista.getPrimeira());
		
//		7. Recuperar/Buscar um determinado elemento da lista;
		if(lista.buscarElemento(1)==null){
			System.out.println("elemento n�o encontrado!");
		}else{
			System.out.println("elemento encontrado!");
		}
		
//		8. Remover um determinado elemento da lista;
		lista.removerElemento(10);
		lista.imprimirLista();
		
//		9. Remover um determinado elemento da lista usando recurs�o;
		//lista.removerElementoComRecursao();
		
//		10. Liberar a lista;
		lista.liberarLista();
		lista.imprimirLista();
	  }
}

package exercicio1.tads;

public class TesteListaEncadeada {

	public static void main(String[] args) {
		
		
//		1. Criar uma lista vazia
		ListaEncadeada lista = new ListaEncadeada();	
		
//		2. Inserir elemento no início;
		lista.inserirNoTopo(10);	
		lista.inserirNoTopo(40);
		lista.inserirNoTopo(50);
		
//		3. Imprimir os valores armazenados na lista;
		lista.imprimirLista();
		
//		4. Imprimir os valores armazenados na lista usando recursão;
		lista.imprimirListaComRecursao(lista.getPrimeira());
		
//		5. Imprimir os valores armazenados na lista em ordem reversa (da cauda para a cabeça da lista);
		lista.imprimirListaOrdemReversa(lista.getPrimeira());
		
//		6. Verificar se a lista está vazia (retorna 1 se vazia ou 0 se não vazia);
		lista.checkListaVazia(lista.getPrimeira());
		
//		7. Recuperar/Buscar um determinado elemento da lista;
		if(lista.buscarElemento(1)==null){
			System.out.println("elemento não encontrado!");
		}else{
			System.out.println("elemento encontrado!");
		}
		
//		8. Remover um determinado elemento da lista;
		lista.removerElemento(10);
		lista.imprimirLista();
		
//		9. Remover um determinado elemento da lista usando recursão;
		//lista.removerElementoComRecursao();
		
//		10. Liberar a lista;
		lista.liberarLista();
		lista.imprimirLista();
	  }
}

package exercicio1.tads;

public class TesteListaEncadeada {

	public static void main(String[] args) {
		
		
//		1. Criar uma lista vazia
		ListaEncadeada lista = new ListaEncadeada();	
		
//		2. Inserir elemento no in�cio;
		lista.inserirNoTopo(10);	
		lista.inserirNoTopo(40);

		
//		3. Imprimir os valores armazenados na lista;
		//lista.imprimirLista();
//		4. Imprimir os valores armazenados na lista usando recurs�o;
		lista.imprimirListaComRecursao(lista.getPrimeira());
//		5. Imprimir os valores armazenados na lista em ordem reversa (da cauda para a cabe�a
//		da lista);
//		6. Verificar se a lista est� vazia (retorna 1 se vazia ou 0 se n�o vazia);
//		7. Recuperar/Buscar um determinado elemento da lista;
//		8. Remover um determinado elemento da lista;
//		9. Remover um determinado elemento da lista usando recurs�o;
//		10. Liberar a lista;
		
	  }
}

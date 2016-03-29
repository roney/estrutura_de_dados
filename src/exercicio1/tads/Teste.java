package exercicio1.tads;

public class Teste {

	public static void main(String[] args) {
		testeListaEncadeadaOrdenada();

	 }
	
	private static void testeListaEncadeadaOrdenada(){
		//1.   Criar uma lista vazia;
		ListaEncadeadaOrdenada lista = new ListaEncadeadaOrdenada();
		
		//2.   Inserir elemento;
		lista.inserirElemento(10);
		lista.inserirElemento(11);
		
		//3.   Imprimir os valores armazenados na lista;
		lista.imprimirLista();
		
		//4.   Imprimir os valores armazenados na lista usando recursão;
		lista.imprimirListaComRecursao(lista.getPrimeira());
	
		//5.   Imprimir os valores armazenados na lista em ordem reversa;
		lista.imprimirListaOrdemReversa(lista.getPrimeira());
		
		//6.   Verificar se a lista está vazia (retorna 1 se vazia ou 0 se não vazia);
		lista.checkListaVazia(lista.getPrimeira());
		
		//7.   Recuperar/Buscar um determinado elemento da lista;
		if(lista.buscarElemento(15)==null){
			System.out.println("elemento não encontrado!");
		}else{
			System.out.println("elemento encontrado!");
		}
		//8.   Remover um determinado elemento da lista;
		lista.removerElemento(12);
		lista.imprimirLista();
		//9.   Remover um determinado elemento da lista usando recursão;
		lista.removerElementoComRecursao(lista.getPrimeira(), null, 12);
		//10.   Liberar a lista;
		//lista.liberarLista();
		//11.   Verificar se duas listas são iguais;
		ListaEncadeadaOrdenada lista2 = new ListaEncadeadaOrdenada();
		lista2.inserirElemento(10);
		//lista2.inserirElemento(11);
		//lista2.inserirElemento(12);
		if(lista.compararListas(lista.getPrimeira(), lista2.getPrimeira())){
			System.out.print("listas iguais");
		}else{
			System.out.print("lista diferentes");
		}
		System.out.println("");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@SuppressWarnings("unused")
    private static void testeListaEncadeada(){
		
//		1. Criar uma lista vazia
		ListaEncadeada lista = new ListaEncadeada();	
		
//		2. Inserir elemento no in�cio;
		lista.inserirNoTopo(10);	
		lista.inserirNoTopo(40);
		lista.inserirNoTopo(50);
		lista.inserirNoTopo(60);
		lista.inserirNoTopo(70);
		lista.inserirNoTopo(80);
//		3. Imprimir os valores armazenados na lista;
		lista.imprimirLista();
		
//		4. Imprimir os valores armazenados na lista usando recurs�o;
		lista.imprimirListaComRecursao(lista.getPrimeira());
		
//		5. Imprimir os valores armazenados na lista em ordem reversa (da cauda para a cabe�a da lista);
		lista.imprimirListaOrdemReversa(lista.getPrimeira());
		
//		6. Verificar se a lista está vazia (retorna 1 se vazia ou 0 se n�o vazia);
		lista.checkListaVazia(lista.getPrimeira());
		
//		7. Recuperar/Buscar um determinado elemento da lista;
		if(lista.buscarElemento(1)==null){
			System.out.println("elemento não encontrado!");
		}else{
			System.out.println("elemento encontrado!");
		}
		
//		8. Remover um determinado elemento da lista;
		//lista.removerElemento(10);
		lista.imprimirLista();
		
//		9. Remover um determinado elemento da lista usando recursão;
		System.out.print("função remover elemento com recursão: ");
		lista.removerElementoComRecursao(lista.getPrimeira(),null, 50);
		System.out.println();
//		10. Liberar a lista;
		//lista.liberarLista();
		lista.imprimirLista();
	}
}

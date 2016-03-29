package exercicio1.tads;

public class Teste {

	public static void main(String[] args) {
		testeListaEncadeadaCircular();
	 }
	
	private static void testeListaEncadeadaCircular(){
//		1. Criar uma lista vazia;
		ListaEncadeadaCircular lista = new ListaEncadeadaCircular();
		
//		2. Inserir elemento;
		lista.inserir(10);
		//lista.inserir(11);
		//lista.inserir(12);
		
//		3. Imprimir os valores armazenados na lista;
		lista.imprimirLista();
		
//		4. Imprimir os valores armazenados na lista usando recursão;
		lista.imprimirListaComRecursao(lista.getPrimeira());
		
//		5. Verificar se a lista está vazia (retorna 1 se vazia ou 0 se não vazia);
		lista.checkListaVazia(lista.getPrimeira());
		
//		6. Recuperar/Buscar um determinado elemento da lista;
		//lista.buscarElemento(10);
		//lista.buscarElemento(50);
//		7. Remover um determinado elemento da lista;
		lista.removerElemento(lista.getPrimeira(),10);
		lista.imprimirLista();

//		8. Remover um determinado elemento da lista usando recursão;
		//lista.removerElementoComRecursao(atual, anterior, elemento);
//		9. Liberar a lista;
	}
	
	private static void testeListaDuplamenteEncadeada(){
//		1. Criar uma lista vazia;
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		
//		2. Inserir elemento;
		lista.inserir(10);
		lista.inserir(11);
		lista.inserir(12);
		lista.inserir(13);
		
//		3. Imprimir os valores armazenados na lista;
		lista.imprimirLista();
		
//		4. Imprimir os valores armazenados na lista usando recursão;
		lista.imprimirListaComRecursao(lista.getPrimeira());
		
//		5. Imprimir os valores armazenados na lista em ordem reversa;
		lista.imprimirListaOrdemReversa(lista.getPrimeira());
		
//		6. Verificar se a lista está vazia (retorna 1 se vazia ou 0 se não vazia);
		lista.checkListaVazia(lista.getPrimeira());
		
//		7. Recuperar/Buscar um determinado elemento da lista;
		CaixaEncadeada elemento = lista.buscarElemento(12);
		
//		8. Remover um determinado elemento da lista;
		lista.removerElemento(13);
		lista.imprimirLista();
		
//		9. Remover um determinado elemento da lista usando recursão;
		lista.removerElementoComRecursao(lista.getPrimeira(), 11);
		lista.imprimirLista();
		
//		10. Liberar a lista;
		//lista.liberarLista();
		//lista.imprimirLista();
		ListaDuplamenteEncadeada lista2 = new ListaDuplamenteEncadeada();
		lista2.inserir(10);
		lista2.inserir(12);
		
//		11. Verificar se duas listas são iguais;
		lista.compararListas(lista2.getPrimeira());
	}
	
	
    @SuppressWarnings("unused")
	private static void testeListaEncadeadaOrdenada(){
		//1.   Criar uma lista vazia;
		ListaEncadeadaOrdenada lista = new ListaEncadeadaOrdenada();
		
		//2.   Inserir elemento;
		lista.inserirElemento(10);
		lista.inserirElemento(11);
		lista.inserirElemento(12);
		lista.inserirElemento(13);
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
		lista.removerElemento(10);
		lista.imprimirLista();
		//9.   Remover um determinado elemento da lista usando recursão;
		System.out.print("função remover elemento com recusão");
		lista.removerElementoComRecursao(lista.getPrimeira(), null, 13);
		System.out.println("");
		lista.imprimirLista();
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
		
//		2. Inserir elemento no inï¿½cio;
		lista.inserirNoTopo(10);	
		lista.inserirNoTopo(40);
		lista.inserirNoTopo(50);
		lista.inserirNoTopo(60);
		lista.inserirNoTopo(70);
		lista.inserirNoTopo(80);
//		3. Imprimir os valores armazenados na lista;
		lista.imprimirLista();
		
//		4. Imprimir os valores armazenados na lista usando recursï¿½o;
		lista.imprimirListaComRecursao(lista.getPrimeira());
		
//		5. Imprimir os valores armazenados na lista em ordem reversa (da cauda para a cabeï¿½a da lista);
		lista.imprimirListaOrdemReversa(lista.getPrimeira());
		
//		6. Verificar se a lista estÃ¡ vazia (retorna 1 se vazia ou 0 se nï¿½o vazia);
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

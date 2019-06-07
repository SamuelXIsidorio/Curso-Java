package capitulo15.application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import capitulo15.model.Produto;


public class ProdutoApp {
	public static void main(String[] args) {
		List<Produto> listaCompras = new LinkedList<>();
		
		Produto p1 = new Produto("Maionese", 5.75);
		Produto p2 = new Produto("Pão de Forma", 5.89);
		Produto p3 = new Produto("Achocolatado", 6.70);
		Produto p4 = new Produto("Cerveja", 38.90);
		Produto p5 = new Produto("Salame", 15.50);
		Produto p6 = new Produto("Queijo", 8.70);
		
		listaCompras.add(p1);
		listaCompras.add(p2);
		listaCompras.add(p3);
		listaCompras.add(p4);
		listaCompras.add(p5);
		listaCompras.add(p6);
		
		System.out.println("Quantidade de itens na lista do Assaí: " + listaCompras.size());
		
		System.out.println("Lista de compras:");
		listaCompras.forEach(p -> System.out.println(p));
		
		listaCompras.remove(2);
		listaCompras.remove(p6);
		System.out.println();
		listaCompras.forEach(p -> System.out.println(p.getNome()));
		
		listaCompras.clear(); // LIMPA A LISTA
		System.out.println("Quantidade de itens na lista do Assaí: " + listaCompras.size());
		listaCompras.add(new Produto("Limão", 1.39));
		System.out.println("A lista está vazia? " + listaCompras.isEmpty());
	}
}

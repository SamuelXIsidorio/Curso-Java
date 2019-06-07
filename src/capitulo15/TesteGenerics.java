package capitulo15;

import capitulo05.modelo.Pessoa;

public class TesteGenerics<T> {
	String nome;
	Pessoa p;
	T x;
	T lista[];
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Pessoa getPessoa() {
		return p;
	}
	
	public void setPessoa(Pessoa p) {
		this.p = p;
	}
	
	public T[] getLista() {
		return lista;
	}
	
	public void setLista(T[] lista) {
		this.lista = lista;
	}
	
	public T getX() {
		return x;
	}
	
	public void setX(T x) {
		this.x = x;
	}
	
}

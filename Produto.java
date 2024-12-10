package br.com.alura.desafio;

public class Produto implements Comparable<Produto>{
	private String nome;
	private Double preco;
	
	public String toString() {
		return("Produto: " + this.nome + " - preço: " + this.preco);
	}
	
	//neste caso não vou precisar de um construtor
	/*public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}*/
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	//temos que indicar qual atributo será usado para fazer as comparações para realizar a ordenação
	//esse primeiro é para ordenar pelo nome do produto
	/* @Override
	public int compareTo(Produto outroProduto) {
		// TODO Auto-generated method stub
		return this.getNome().compareTo(outroProduto.getNome());
	}*/
	
	// esse outro fará ordenação pelo preço
	@Override
	public int compareTo(Produto outroProduto) {
		if (this.preco < outroProduto.preco) {
			return -1;
		}
		if (this.preco > outroProduto.preco) {
			return 1;
		}
		return 0;
	}
	
	

}

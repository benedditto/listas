package br.com.alura.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int i=0;
		int l = 0;
		Double limiteCartao = 500.00;
		String nomeProduto;
		Double precoProduto;
		Double totalCompra = 0.0;
		Scanner entrada = new Scanner(System.in);
		
		
		ArrayList<Produto> produtos = new ArrayList<>();
				
		
		while(l==0 && totalCompra < limiteCartao) {
			Produto p = new Produto();
			
			System.out.println("Nome do Produto: ");
			nomeProduto = entrada.next();
			
			System.out.println("Preço: ");
			precoProduto = entrada.nextDouble();
			
			p.setNome(nomeProduto);
			p.setPreco(precoProduto);
			
			totalCompra += precoProduto;
			
			produtos.add(p);

			i++;
			
			if(totalCompra > limiteCartao) {
				break;
			}
			
			
			
			//.add(nomeProduto,precoProduto);
			System.out.println("Digite 0 para continuar ou 1 para sair: ");
			l = entrada.nextInt();
			//System.out.printf("O usuário \"%s\" com sobrenome \"%s\" com data de aniversário \"%s\" ", name, surname, date);			
		}
		
		System.out.println("Compras realizadas: ");
		
		System.out.println(produtos);
		
		
		System.out.println("Lista de compras ordenada: ");
		
		Collections.sort(produtos);
		System.out.println(produtos);
		
		

	}

}

package caixaTroco;

import java.util.Scanner;

public class CaixaTroco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o valor do produto: ");
		double valorDoProduto = scanner.nextDouble();
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Informe o valor para pagamento do produto (enter p sair): ");
		double valorPagamentoDoProduto = scanner2.nextDouble();
		
		double notasPagamento;
		while(valorPagamentoDoProduto != 0) {
			if(valorPagamentoDoProduto >= valorDoProduto) {
				double troco = valorPagamentoDoProduto - valorDoProduto;
				System.out.println("O seu troco é: " + troco);
				valorPagamentoDoProduto = 0;
			} else {
				System.out.println("Valor inválido");
			}

			System.out.println("Informe o valor para pagamento do produto (0 p sair): ");
			valorPagamentoDoProduto = scanner2.nextDouble();
		}	
	}
}

package aplication;

import java.util.Locale;
import java.util.Scanner;

import entitie.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		System.out.println("------- INFORMAÇÕES DO FUNCIONARIO -------");
		System.out.print("Digite o nome: ");
		func.nome = sc.nextLine();
		System.out.print("Digite o salario Bruto: ");
		func.salarioBruto = sc.nextDouble();
		System.out.print("Digite o valor do imposto: ");
		func.taxa = sc.nextDouble();
		
		System.out.println();
		System.out.println("INFORMAÇOES : "+ func);
		System.out.println();
		System.out.print("Qual percentual deseja aumentar nesse salario? ");
		double porcentagem = sc.nextDouble();
		func.aumentoSalario(porcentagem);
		
		System.out.println();
		System.out.println("NOVAS INFORMAÇÕES: " + func);
		sc.close();
		
		
	}

}

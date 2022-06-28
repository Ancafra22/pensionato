/*programa que l� a aquantidade de quartos a serem alugados(m�ximo 10)
 l� nome, email e qual quato ser� locado
 exibe os n�meros dos quaros em ordem decrescente, os nomes, os email dos locat�rios */

package application;

import java.text.ParseException;
import java.util.Scanner;

import entities.Rent;


public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);//objeto respo�vel pela leitura dos dados
		Rent[] vect = new Rent[10];//criando vetor de 10 posi��es da classe (Rent)
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();//int n que ir� receber a quantidade de quartos a serem alugados
		for (int i = 1; i <= n; i++) {//(for) respons�vel por fazer a leitura dos dados de acordo com a quantidade desejada
			System.out.println();//pula linha para separar da frase acima
			System.out.println("Rent #" + i + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();//faz a leitura do mome do locat�rio e guarda a String na vari�vel nome
			System.out.print("Email: ");
			String email = sc.nextLine();//faz a leitura do email do locat�rio e guarda a String na vari�vel email
			System.out.print("Room: ");
			int room = sc.nextInt();//faz a leitura do quarto do locat�rio e guarda o n�ro do quarto na vari�vel romm
			vect[room] = new Rent(name, email);/*chamando o vetor(vect) dentro dele os quartos(room) e 
			instanciando a classe Rent com os argumentos nome e email dos locat�rios*/ 
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {//(for)para imprimir os n�meros dos quartos, os nomes e os emailss dos locat�rios 
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
		}
		sc.close();
	}
}
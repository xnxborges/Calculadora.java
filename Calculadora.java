

//Por: Natan dos Santos Borges
// 11/05/2021

package fundamentos;

//Importação da biblioteca java para abertura do Scanner no console.
import java.util.Scanner;

//Área de criação do código.
public class Calculadora {
	//Início do metodo.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Uma breve introdução explicativa para digitação do usuário.
		System.out.print("Olá! Bem vindo(a) ao modelo de calculadora de alcance de anuncio online.\n"
				+ "Aqui você pode fazer um investimento para que aumentar o alcance e visualizações d seu"
				+ "anuncio nas redes socias.\n\n"
				+ "Entre com o valor: R$ ");

		int valor = entrada.nextInt();
		
		// 'like' -> recebe os dados da variável 'valor' que será digitada no console, armazenada e processada pela 
		// equação do problema, como segue:
		double like = (((valor*30)*12)/100);

		// 'share' -> recebe o resultado da equação da variável 'like' partindo para um nova equação.
		double share = ((like*3)/20);

		// 'view' -> recebe a segunda parte da equação e armazena o resultado aproximado das visualizações do anúncio.
		// Repare que preferi converter a variável para um tipo primitivo 'int' usando um metodo 'cast' fazendo a impressão no 
		// console de um número inteiro enquanto as demais variáveis recebem números do tipo double.
		int view = (int) ((share*40)+1);

		// Resultado final da equação "printando" no console um número aproximado do real de visualizações
		// com um pequeno texto informativo.
		System.out.println("Com o investimento de R$"+ valor + ", o anúncio terá aproximadamente " + view +
				" visualizações!");
		
		//Final do metodo.	
		entrada.close();
	}
}
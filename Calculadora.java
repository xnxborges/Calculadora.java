

//Por: Natan dos Santos Borges
// 11/05/2021

package fundamentos;

//Importa��o da biblioteca java para abertura do Scanner no console.
import java.util.Scanner;

//�rea de cria��o do c�digo.
public class Calculadora {
	//In�cio do metodo.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Uma breve introdu��o explicativa para digita��o do usu�rio.
		System.out.print("Ol�! Bem vindo(a) ao modelo de calculadora de alcance de anuncio online.\n"
				+ "Aqui voc� pode fazer um investimento para que aumentar o alcance e visualiza��es d seu"
				+ "anuncio nas redes socias.\n\n"
				+ "Entre com o valor: R$ ");

		int valor = entrada.nextInt();
		
		// 'like' -> recebe os dados da vari�vel 'valor' que ser� digitada no console, armazenada e processada pela 
		// equa��o do problema, como segue:
		double like = (((valor*30)*12)/100);

		// 'share' -> recebe o resultado da equa��o da vari�vel 'like' partindo para um nova equa��o.
		double share = ((like*3)/20);

		// 'view' -> recebe a segunda parte da equa��o e armazena o resultado aproximado das visualiza��es do an�ncio.
		// Repare que preferi converter a vari�vel para um tipo primitivo 'int' usando um metodo 'cast' fazendo a impress�o no 
		// console de um n�mero inteiro enquanto as demais vari�veis recebem n�meros do tipo double.
		int view = (int) ((share*40)+1);

		// Resultado final da equa��o "printando" no console um n�mero aproximado do real de visualiza��es
		// com um pequeno texto informativo.
		System.out.println("Com o investimento de R$"+ valor + ", o an�ncio ter� aproximadamente " + view +
				" visualiza��es!");
		
		//Final do metodo.	
		entrada.close();
	}
}
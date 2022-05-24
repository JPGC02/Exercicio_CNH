//importar a classe scanner
import java.util.Scanner;

public class Exercicio_CNH {

	public static void main(String[] args) {
		// declarando scanner para entrada de dados
		Scanner CNH = new Scanner(System.in);
		// inserindo as Variaveis
		int psicotecnico, legislativo, pratica;
		// exibindo na tela o texto em parenteses
		System.out.println("Digite: \n1 para sim\n2 para não!");
		System.out.println("Voce foi aprovado no exame Psicotécnico?\n1.sim\n2.nao");
		// atribuindo um valor a variante 
		psicotecnico = CNH.nextInt();
		System.out.println("Voce foi aprovado no exame de Legislação?\n1.sim\n2.nao");
		legislativo = CNH.nextInt();
		System.out.println("Voce foi aprovado no exame de Direção?\n1.sim\n2.nao");
		pratica = CNH.nextInt();
		// criando a condição
		if (psicotecnico == 1 && legislativo == 1 && pratica == 1) {
			System.out.println("Parabéns agora voce pode solicitar sua CNH!");
		} else {
			System.out.println("Voce infelizmente não vai poder solicitar sua CNH, Boa sorte na proxima tentativa!");
		}
	}

}

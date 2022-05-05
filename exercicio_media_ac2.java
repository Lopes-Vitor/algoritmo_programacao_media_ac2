package exercicios;
import java.util.Scanner;
public class exercicio_media_ac2 {

	public static void main(String[] args) {
		//Declarando o Scanner
		Scanner leitor = new Scanner (System.in);
		
		//Declarando as variaveis
		int codigo;
		float  nota1, nota2, nota3, media;
		
		//Imprimindo uma mensagem para pedir o RA do aluno, ou que digite 0 se acabaram os alunos
		System.out.println("Digite o seu RA, caso nao haja mais alunos digite 0");
		//Leitura do valor entrado
		codigo = leitor.nextInt();
		
		//utilizando a estrutura condicional IF para ver se existem alunos ou nao, e perguntando as notas caso haja alunos
		if(codigo == 0) {
			System.out.println("Fim");
		}
		else {
		System.out.println("Digite a sua primeira nota: ");
		nota1 = leitor.nextFloat();
		System.out.println("Digite a sua segunda nota: ");
		nota2 = leitor.nextFloat();
		System.out.println("Digite a sua terceira nota: ");
		nota3 = leitor.nextFloat();
		
		//calculando a media do aluno
		media = (nota1 + nota2 + nota3) / 3;
		
		//utilizando a estrutura condicional IF para ver se o aluno ou vai ser aprovado, ou ir para recuperacao, ou reprovado
		if(media >= 8) {
			System.out.println("Aprovado");
		}
		else if(media < 8 && media >6) {
			System.out.println("Recuperacao");
		}
		else {
			System.out.println("Reprovado");
		}
		
		}
	}

}
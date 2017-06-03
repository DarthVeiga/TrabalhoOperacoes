import java.util.Scanner;

public class ResultadoOperacoes {

	public static void main (String[] args){
		Operacoes op = new Operacoes();
		Scanner ope = new Scanner(System.in);


		System.out.println("Operação de soma");
		System.out.println();
		System.out.println("Digite o primeiro número: ");
		float num1 = ope.nextFloat();
		System.out.println("Digite o segundo número: ");
		float num2 = ope.nextFloat();
		System.out.println(num1+ " + "+num2+ " = " +Operacoes.somar(num1,num2));

		System.out.println();
		System.out.println();
		System.out.println("Operação de subtração");
		System.out.println();
		System.out.println("Digite o primeiro número: ");
		float num3 = ope.nextFloat();
		System.out.println("Digite o segundo número: ");
		float num4 = ope.nextFloat();
		System.out.println(num3+ " + -("+num4+ ") = " +Operacoes.subtrair(num3,num4));

		System.out.println();
		System.out.println();
		System.out.println("Operação de multiplicação");
		System.out.println();
		System.out.println("Digite o primeiro número: ");
		float num5 = ope.nextFloat();
		System.out.println("Digite o segundo número: ");
		float num6 = ope.nextFloat();
		System.out.println(num5+ " * "+num6+ " = "+Operacoes.multiplicação(num5,num6));

		System.out.println();
		System.out.println();
		System.out.println("Operação de divisão");
		System.out.println();
		System.out.println("Digite o primeiro número: ");
		float num7 = ope.nextFloat();
		System.out.println("Digite o segundo número: ");
		float num8 = ope.nextFloat();
		System.out.println(num7+ " / " +num8+ " = "+Operacoes.divisao(num7,num8));

		System.out.println();
		System.out.println();
		System.out.println("Operação de potência");
		System.out.println();
		System.out.println("Digite o numero da base: ");
		float base = ope.nextFloat();
		System.out.println("Digite o numero do expoente: ");
		float exp = ope.nextFloat();
		System.out.println(base+ " elevada a "+exp+ " = "+Operacoes.potencia(base,exp));


	}

}

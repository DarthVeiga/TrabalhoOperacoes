import java.util.Scanner;

public class ResultadoOperacoes {

	public static void main (String[] args){
		Operacoes op = new Operacoes();
		Scanner ope = new Scanner(System.in);


		System.out.println("Opera��o de soma");
		System.out.println();
		System.out.println("Digite o primeiro n�mero: ");
		float num1 = ope.nextFloat();
		System.out.println("Digite o segundo n�mero: ");
		float num2 = ope.nextFloat();
		System.out.println(num1+ " + "+num2+ " = " +Operacoes.somar(num1,num2));

		System.out.println();
		System.out.println();
		System.out.println("Opera��o de subtra��o");
		System.out.println();
		System.out.println("Digite o primeiro n�mero: ");
		float num3 = ope.nextFloat();
		System.out.println("Digite o segundo n�mero: ");
		float num4 = ope.nextFloat();
		System.out.println(num3+ " + -("+num4+ ") = " +Operacoes.subtrair(num3,num4));

		System.out.println();
		System.out.println();
		System.out.println("Opera��o de multiplica��o");
		System.out.println();
		System.out.println("Digite o primeiro n�mero: ");
		float num5 = ope.nextFloat();
		System.out.println("Digite o segundo n�mero: ");
		float num6 = ope.nextFloat();
		System.out.println(num5+ " * "+num6+ " = "+Operacoes.multiplica��o(num5,num6));

		System.out.println();
		System.out.println();
		System.out.println("Opera��o de divis�o");
		System.out.println();
		System.out.println("Digite o primeiro n�mero: ");
		float num7 = ope.nextFloat();
		System.out.println("Digite o segundo n�mero: ");
		float num8 = ope.nextFloat();
		System.out.println(num7+ " / " +num8+ " = "+Operacoes.divisao(num7,num8));

		System.out.println();
		System.out.println();
		System.out.println("Opera��o de pot�ncia");
		System.out.println();
		System.out.println("Digite o numero da base: ");
		float base = ope.nextFloat();
		System.out.println("Digite o numero do expoente: ");
		float exp = ope.nextFloat();
		System.out.println(base+ " elevada a "+exp+ " = "+Operacoes.potencia(base,exp));


	}

}

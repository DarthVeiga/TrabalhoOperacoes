public class Operacoes {

	public static float somar (float num1, float num2){
		return num1+ num2;

	}	

	public static float subtrair (float num3, float num4){
		return num3 + (-num4);

	}	

	public static float multiplicação (float num5f, float num6f){
		float produto = 0;
		boolean bneg = false;
		if (num5f < 0){
			num5f = -num5f;
			bneg = true;

		}

		boolean bneg1 = false;
		if (num6f < 0){
			num6f = -num6f;
			bneg1 = true;

		}
		produto = 0;

		for(float i=0; (i +1)< num6f; i= i+1){
			produto = somar(produto, num5f);

		}

		float decimal = num6f;
		for( ; decimal >= 1; ){
			decimal = subtrair(decimal, 1);

		}

		if(decimal >= 0.001f){
			produto = somar(produto, divisao(num5f,divisao(1,decimal)));

		}

		if (bneg||bneg1){
			produto = -produto;

		}

		return produto;

	}

	public static float divisao (float num7f, float num8f){
		float resultado = num7f;
		float cont = 0;
		boolean aneg = false;
		if (num7f < 0){
			num7f = -num7f;
			aneg = true;

		}

		boolean aneg1 = false;
		if (num8f < 0){
			num8f = -num8f;
			aneg1 = true;

		}

		resultado = num7f;

		for ( ;resultado >= num8f ; ){
			resultado = subtrair(resultado,num8f);
			cont = (float) (cont + 1);

		}

		if(resultado > 0.001f){
			resultado = multiplicação (resultado,10);
			for ( ;resultado >= num8f ; ){
				float i = 1;
				resultado = subtrair(resultado,num8f);
				cont = (float) (cont + 0.1);

			}
			if(resultado > 0.001f){
				resultado = multiplicação (resultado,10);
				for ( ;resultado >= num8f ; ){
					float i = 1;
					resultado = subtrair(resultado,num8f);
					cont = (float) (cont + 0.01);

				}
				if(resultado > 0.001f){
					resultado = multiplicação (resultado,10);
					for ( ;resultado >= num8f ; ){
						float i = 1;
						resultado = subtrair(resultado,num8f);
						cont = (float) (cont + 0.001);

					}
				}
			}
		}

		if (aneg||aneg1){
			cont = -cont;

		}

		return cont;

	}

	public static float potencia(float base, float exp){
		float resultado = base;
		if (exp == 0){
			return 1;
			
		}
		if (base == 0){
			return 0;
		} 

		for(float i=1; i < exp; i = i+1){
			resultado = multiplicação(resultado, base);

		}

		return resultado;

	}

}

public class quadrilatero {

	public static double area(double lado) {

		return lado * lado;
	}

	public static double area(double lado1, double lado2) {
		
		return lado1 * lado2;

	}

	public static void area(double baseMaior, double baseMenor, double altura) {

		System.out.println("Area do trapezio: " + ((baseMaior + baseMenor) * altura) / 2);
	}

// A SOBRECARGA NAO ACEITA REPETIR MESMO TIPO  double diagonal1, double diagonal2 É IGUAL (double lado1, double lado2) DO QUADRADO
// PARA RESOLVAR TROCA FLOAT	
//	public static void area(double diagonal1, double diagonal2) {

//		System.out.println("Area do lozangulo: " + ((diagonal1*diagonal2)/2);
//	}

	public static void area(float diagonal1, float diagonal2) {

		System.out.println("Area do lozangulo: " + ((diagonal1 * diagonal2)/2));
	}

}

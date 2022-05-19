
public class operacoes {

	public static void main(String[] args) {

		System.out.println("exercicio modulo");
		modulo.soma(10, 30);
		modulo.substracao(1000, 234);
		modulo.divisao(100, 5);
		modulo.multiplcacao(25, 5);

		System.out.println();
		System.out.println("exercicio equilatero / sobrecarga");

		quadrilatero.area(3);
		quadrilatero.area(8d, 8d);
		quadrilatero.area(7, 8, 9);
		quadrilatero.area(8f,8f);
		System.out.println();
		
	}

}

public class TesteTriangulo {
	public static void main(String[] args) {

        Escolha escolha     = new Escolha(args[0]);
        Triangulo triangulo = new Triangulo(args[1]);

		escolha.formatoTriangulo(triangulo);

	}
}
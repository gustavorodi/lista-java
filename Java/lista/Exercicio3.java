public class Exercicio3 {
	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("deu erro");
			System.exit(0);
		}
		String arvores = String.valueOf(args[0]);
		Integer numeroDigitado = Integer.valueOf(args[1]);

		switch (arvores) {
		case "a":
			for (Integer i = 1; i <= numeroDigitado; i++) {
				for (Integer x = 1; x <= i; x++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case "b":
			for (Integer i = 1; numeroDigitado >= i; numeroDigitado--) {
				for (Integer x = 1; x <= numeroDigitado; x++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case "c":
			for (Integer i = 0; i < numeroDigitado; i++) {
				for (Integer e = 1; e <= i+1; e++) {
					System.out.print(" ");
				}
					for (Integer x = numeroDigitado; x >= i+1; x--) {
						
						System.out.print("*");
					}
				
				System.out.println();
			}
			break;
		case "d":
			for (Integer i = 0; i < numeroDigitado; i++) {
				for (Integer e = 1; e <= i+1; e++) {
					System.out.print(" ");
				}
					for (Integer x = numeroDigitado; x >= i+1; x--) {
						
						System.out.print("*");
					}
				
				System.out.println();
			}
			break;
		default:
			System.out.println("não deu");
		}
	}
}
public interface Pedido
{
	public static void main (String[] args)
	{

        
		if(args.length==0)
		{
			System.out.println("deu erro");
			System.exit(0);
		}

		Integer enviado1 = Integer.valueOf(args[0]);
        Integer enviado2 = Integer.valueOf(args[1]);
		
	    System.out.println("Soma:" 			+(enviado1 + enviado2));
		System.out.println("Subtraçao:" 	+(enviado1 - enviado2));
		System.out.println("Multiplicaçao:" +(enviado1 * enviado2));
		System.out.println("Divisao:" 		+(enviado1 % enviado2));
		System.out.println("O maior numero e:" + Math.max(enviado1,enviado2));

	}
}
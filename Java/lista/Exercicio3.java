public class Exercicio3
{
	public static void main (String[] args)
	{

		if(args.length==0)
		{
			System.out.println("deu erro");
			System.exit(0);
		}

		Integer numeroDigitado = Integer.valueOf(args[0]);
		for(Integer i=1; i<=numeroDigitado; i++)
	    {
			for(Integer x=1;x<=i;x++)
			{
				System.out.print("*");
			}
			System.out.println();
	    }
	}
}
public class Exercicio1
{
	public static void main (String[] args)
	{

		if(args.length==0)
		{
			System.out.println("deu erro");
			System.exit(0);
		}

		Integer anos = Integer.valueOf(args[0]);
		Long populacaoM = 7600000000L;
		Double resultadoT;
        Long resultadoF;
		
        resultadoT = populacaoM * (Double) Math.pow(1.012, anos);
        resultadoF = Math.round(resultadoT);
        System.out.println(resultadoF);
	}
}
public interface Exercicio2
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
        
 	    System.out.println("Soma:"              +           (enviado1 + enviado2));
        System.out.println("Subtracao:"         +           (enviado1 - enviado2));
        System.out.println("Multiplicao:"       +           (enviado1 * enviado2));
        System.out.println("Divisao:"           +(double)   (enviado1 / enviado2));
        System.out.println("O maior numero :"   + Math.max  (enviado1 , enviado2));

    }
}


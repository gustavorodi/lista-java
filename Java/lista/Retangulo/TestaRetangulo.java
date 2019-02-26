public class TestaRetangulo{

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(Double.valueOf(args[0]),Double.valueOf(args[1]));

        Double comprimento =Double.valueOf( args[0] );
        Double largura 	  = Double.valueOf( args[1] );
        
       

        retangulo.setComprimento(comprimento);
        retangulo.setLargura(largura);
        retangulo.AreaRetangulo(); 
        retangulo.perimetroRetangulo();
    }
} 
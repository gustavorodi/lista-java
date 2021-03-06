import java.util.ArrayList;

public class TestaArea {
    public static void main( String[] args ) {

        ArrayList<AreaCalculavel> objetos = new ArrayList<AreaCalculavel>();
        
        Circulo   circulo   = new Circulo(22.5);
        Quadrado  quadrado  = new Quadrado(40.0);
        Retangulo retangulo = new Retangulo(15.0, 2.0);

        objetos.add( circulo );
        objetos.add( quadrado );
        objetos.add( retangulo );

        System.out.println( circulo.calcularArea() );
        System.out.println( retangulo.calcularArea() );
        System.out.println( quadrado.calcularArea() );      

    }
}
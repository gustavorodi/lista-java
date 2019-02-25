public class Calculo{

    private Double numeroX;
    private Double numeroY;

    public Calculo(String numeroX,String numeroY){
        this.numeroX        =    Double.valueOf(numeroX);
        this.numeroY        =    Double.valueOf(numeroY);
    }

    public void resultados(){

        System.out.println("Soma: "              +           (numeroX + numeroY));
        System.out.println("Subtracao: "         +           (numeroX - numeroY));
        System.out.println("Multiplicao: "       +           (numeroX * numeroY));
        System.out.println("Divisao: "           +(double)   (numeroX / numeroY));
        System.out.println("O maior numero :"   + Math.max  (numeroX , numeroY));
    }
    
}
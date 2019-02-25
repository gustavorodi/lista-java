public class Triangulo{
    
    private Integer entrada;
    
    public Triangulo(String entrada){
        this.entrada = Integer.valueOf(entrada);
    }

    public void trianguloA(){
        for (Integer i = 1; i <= entrada; i++) {
            for (Integer x = 1; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void trianguloB(){
        for (Integer i = 1; entrada >= i; entrada--) {
            for (Integer x = 1; x <= entrada; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void trianguloC(){
        for (Integer i = 0; i < entrada; i++) {
            for (Integer e = entrada; e <= i+1; e--) {
                System.out.print(" ");
            }
                for (Integer x = 1; x >= i+1; x++) {
                    
                    System.out.print("*");
                }
            
            System.out.println();
        }
    }

    public void trianguloD(){
        for (Integer i = 0; i < entrada; i++) {
            for (Integer e = 1; e <= i+1; e++) {
                System.out.print(" ");
            }
                for (Integer x = entrada; x >= i+1; x--) {
                    
                    System.out.print("*");
                }
            
            System.out.println();
        }
    }
}
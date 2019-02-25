public class Escolha{
    private String tipos;

    public Escolha(String tipos){
        this.tipos = tipos;
    }

    public void formatoTriangulo(Triangulo triangulo){
        switch (tipos) {
            case "a":
                triangulo.trianguloA();
                break;
            case "b":
                triangulo.trianguloB();
                break;
            case "c":
                triangulo.trianguloC();
                break;
            case "d":
                triangulo.trianguloD();
                break;
            default:
                System.exit(0);
            }
    }
}
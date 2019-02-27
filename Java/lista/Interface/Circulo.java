public class Circulo implements AreCalculavel{
    private Double diametro;

    public Circulo(Double diametro){
        this.diametro = diametro;
    }

    @Override
    public Double calcularArea(){
        Double resposta_Circulo;
        resposta_Circulo = Math.PI * (diametro/2);
        return resposta_Circulo;
    }
}
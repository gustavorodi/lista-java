public class Retangulo implements AreaCalculavel{
    private Double base;
    private Double altura;

    public retangulo(Double base, Double altura){
        this.base   = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea(){
        Double resposta_Retangulo;
        resposta_Retangulo = base * comprimento;
        return resposta_Retangulo;
        
    }

}
import javax.print.attribute.standard.Compression;

public class Retangulo{
    private Double comprimento = 1.0;
    private Double largura = 1.0;
    private Double area;
    private Double perimetro;

    public Retangulo(String comprimento,String largura){
        this.comprimento    =    Double.valueOf(comprimento);
        this.largura        =    Double.valueOf(largura);
    }

    public void AreaRetangulo(){
        area = comprimento * largura;
        System.out.println("Sua area é:"+ area);
    }

    public void perimetroRetangulo(){
        perimetro = 2*(comprimento + largura);
        System.out.println("Seu perimetro é: " + perimetro);
    }

    public Double getComprimento()
	{
		return this.comprimento;
	}

	public void setComprimento(Double comprimento)
	{
        if(comprimento > 0.0){
            this.comprimento = comprimento;
        }else{
		System.out.println("Um dos lados do retângulo é igual ou  menor que zero.");
        System.exit(0);
        }
	}

	public Double getLargura()
	{
		return this.largura;
	}

	public void setLargura(Double largura)
	{
        if(largura > 0.0){
            this.largura = largura;
        }else{
            System.out.println("Um dos lados do retângulo é igual ou  menor que zero.");
            System.exit(0);
        }   
	}

}
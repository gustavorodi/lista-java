public class Fatura{

    public String  codigo;
    public String  descricao;
    private Integer quant;
    private Double  preco;

    public Fatura(String codigo, String descricao, String quant, String preco){
        this.codigo     =        codigo;
        this.descricao  =        descricao;
        this.quant      =        Integer.valueOf(quant);
        this.preco      =        Double.valueOf(preco);
    }

    public void totalFaturado(){
        System.out.println("Descricao: "       +    descricao);
        System.out.println("A fatura total é: "+    (quant * preco));
        
    }
}
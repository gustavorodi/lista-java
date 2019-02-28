public class Ponto{

    private Double x;
    private Double y;

    public Ponto(Double x,Double y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString(){
        return "ponto -x:"+ this.x +" y: "+this.y; 
    }

    public Double getX()
	{
		return this.x;
	}

	public void setX(Double x)
	{
		this.x = x;
	}

	public Double getY()
	{
		return this.y;
	}

	public void setY(Double y)
	{
		this.y = y;
	}

}
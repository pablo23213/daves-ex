public class Triangulos
{
    private double lado, altura, base;
    
    public Triangulos(){
        
    }
    
    public Triangulos(double altura, double lado, double base){
        this.altura = altura;
        this.lado = lado;
        this.base = base;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setLado(double area){
        this.lado = lado;
    }
    
    public double getLado(){
        return lado;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public double getBase(){
        return base;
    }
    
    public double calculoPerimetro(){
        return lado + lado + lado;
    }
    
    public double area(){
        return base * altura / 2;
    }
}
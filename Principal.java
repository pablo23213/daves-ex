import java.util.Scanner;

public class Principal
{
    public void main(String args[]){
        Scanner le = new Scanner(System.in);
        
        Triangulos tri = new Triangulos();
        
        System.out.println("## area: ");
        
        System.out.println("Informe a altura: ");
        tri.setAltura(le.nextDouble() );
        
        System.out.println("Informe a base: ");
        tri.setBase(le.nextDouble() );
        
        System.out.println("Resultado: "+ tri.area());
    }
}
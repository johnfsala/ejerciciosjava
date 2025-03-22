public class Boleto_de_cine {
    public static void main(String[] args) {
        int edad = 30;
        if (edad<= 5){
        System.out.println("entrada gratis ");
        }
        else if ((edad> 5) && (edad<= 17))
        {
            System.out.println("valor $5.000");
        }
        
        else if ((edad>= 18) && (edad< 60))
        {
            System.out.println("valor $10.000");
        }
        
        else if (edad> 60)
        {
            System.out.println("valor $7.000 (descuento adulto mayor)");
        }

    }
}

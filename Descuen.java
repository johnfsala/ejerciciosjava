public class Descuen {
    public static void main(String[] args) {
        
        int total= 300;
        if (total>= 1000)
          {
            System.out.println("descuento 20 %");
          }

        else if ((total>= 500) && (total<= 999))
          {
            System.out.println("descuento 10 %");
          }
        else if (total< 500) {
            System.out.println("no hay descuento ");
        }
    }
}

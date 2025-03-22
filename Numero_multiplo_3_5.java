public class Numero_multiplo_3_5 {
    public static void main(String[] args){
    
        int num = 20;
        if ((num%3 == 0) & (num%5 == 0))
        System.out.println("el numero es multiplo de 3 y 5 ");

        else if (num%3 == 0)
        System.out.println("el numero es multiplo de 3 ");

        else if (num%5 == 0)
        System.out.println("el numero es multiplo de 5 ");

        else  
        System.out.println("el numero no es multipo de 3 y 5 ");
    
      }
}
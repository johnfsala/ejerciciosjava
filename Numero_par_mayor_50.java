public class Numero_par_mayor_50 {
    
    public static void main(String[] args) {
        
        int num =10;
        if ((num%2 == 0 ) && (num>50)){
            System.out.println("el numero es par y mayor de 50");
        }

        else if ((num%2 == 0) && (num<50)){
            System.out.println("el numero es par, pero no es mayor que 50");
        }

        else {
            System.out.println("numero no es par ");
        }
    }
}

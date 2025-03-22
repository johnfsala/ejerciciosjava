public class Cajero_automatico {

    public static void main(String[] args) {
        
        int saldo = 5000;
        int monto= 500;
        int total= 0;
        
        if (saldo> 5000){
        System.out.println("fondos insuficientes " );}
        else if (monto> 1000){
            System.out.println("fondos limite de retiro por transaccion " );
        }
       total= saldo - monto; {
        System.out.println("retiro exitoso, su saldo es: " +total);
       }
       

    }
}    
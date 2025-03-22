public class Usuario_premium {
    public static void main(String[] args) {
        
       String cuenta = "xvip";

       if (cuenta=="premium")
       {
        System.out.println("tienes acceso a todas las funciones");
       }

       else if (cuenta=="basico")
       {
       System.out.println("tienes acceso a funciones limitadas");
       }

       else if (cuenta=="gratis")
       {
       System.out.println("tienes acceso a contenido gratuito");
       }
       
       else 
       
       System.out.println("tipo de usuario no valido");

    
    }
}

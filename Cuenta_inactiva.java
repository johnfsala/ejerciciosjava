public class Cuenta_inactiva {
    
    public static void main(String[] args) {
        
        String contraseña = "jose1525";
        boolean cuenta = true;

        if (contraseña!= "jose1525" && cuenta== true){
            System.out.println("contraseña incorreta");
        }
        else if ((contraseña== "jose1525")||(cuenta== false)){
            System.out.println("cuenta inactiva, contacta al soporte");
        }
        else if(contraseña == "jose1525" && cuenta == true){
            System.out.println("acceso permitivo");
        }
    }
}

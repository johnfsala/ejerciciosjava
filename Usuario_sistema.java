public class Usuario_sistema {
    public static void main(String[] args) {
        
        String usuario= "john";
        int contraseña= 1525;
        

       if ((usuario == "john") && (contraseña == 1525)){
            System.out.println("Acceso Concedido");
        }

        else if ((usuario == "john") && (contraseña != 1525)){
            System.out.println("Contraseña Incorrecta");
        }
        else if (usuario != "john"){
            System.out.println("usuario no encontrado");
        }

    }
}

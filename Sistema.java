public class Sistema {

    public static void main(String[] args) {
        
        String usuario= "john";
        int contraseña= 1525;

        if (usuario == "jhon"){
            if (contraseña == 1525) {
                System.out.print("Acceso Concebido");
            } else {
                System.out.println("contraseña incorrecta");
            }
        }else {
            System.out.println("usuario no encontrado");
        }

    }
}




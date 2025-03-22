public class Dia_segun_clima {
    public static void main(String[] args) {
        
        int temp =  60 ;
        if (temp< 10) {
            System.out.println("dia frio");
        }

        else if ((temp>= 10) && (temp<= 20)) {
            System.out.println("dia fresco");
        }

        else if ((temp>= 21) && (temp< 30)) {
            System.out.println("dia caliente");
        }

        else if (temp>= 30) {
            System.out.println("dia muy caluroso");
        }

    }
}

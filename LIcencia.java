public class LIcencia {
    public static void main(String[] args) {
        
        int edad = 17;
        String tieneLicencia = "si"; 
        String TomoAlcohol = "no";



        if ((edad>=18) && (tieneLicencia == "si") && (TomoAlcohol == "si")){
            System.out.println("no puede conducir ");
        }
        else if((edad>=18) && (tieneLicencia == "si")){
            System.out.println("tiene licencia puede conducir ");
        }
        else if(edad<=17){
            System.out.println("no tiene licenciqa");
        
        }
    }
}

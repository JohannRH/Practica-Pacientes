import java.util.Random;

public class calcularCita {
    public Random rand = new Random();

    public String ultimaCita(){
        String dia = String.valueOf(rand.nextInt(30)+1);
        String mes = String.valueOf(rand.nextInt(11)+1);
        return dia.concat("/").concat(mes).concat("/").concat("2023");
    }

    public String proxCita(int edad, String ultCita){
        if(edad >= 25 && edad <= 35)
        {
            
        }else if(edad > 35 && edad <= 45){

        }else if(edad > 45){

        }else{

        }
    }
}

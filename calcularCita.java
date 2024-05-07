import java.util.Random;

public class calcularCita {
    public Random rand = new Random();

    public String ultimaCita(){
        String dia = String.valueOf(rand.nextInt(30)+1);
        String mes = String.valueOf(rand.nextInt(11)+1);
        return dia.concat("/").concat(mes).concat("/").concat("2023");
    }

    public String proxCita(int edad, String ultCita){
        String f = "";
        if(edad >= 25 && edad <= 35)
        {
            f = calcularFecha(ultCita, 15, 2);
        }else if(edad > 35 && edad <= 45){
            f = calcularFecha(ultCita, 15, 1);
        }else if(edad > 45){
            f = calcularFecha(ultCita, 15, 0);

        }else{
            f = calcularFecha(ultCita, 0, 3);
        }
        return f;
    }

    public String calcularFecha(String ultCita, int sumaD, int sumaM){
        String parts[] = ultCita.split("/");
        int dia = Integer.parseInt(parts[0]);
        int mes = Integer.parseInt(parts[1]);
        int año = Integer.parseInt(parts[2]);
        
        dia+=sumaD;
        mes += sumaM;

        if (dia > 31) {
            mes++;
            dia = dia-31;
        }
        if (mes > 12) {
            año++;
            mes = mes - 12;
        }

        return String.valueOf(dia).concat("/").concat(String.valueOf(mes)).concat("/").concat(String.valueOf(año));
    }
}

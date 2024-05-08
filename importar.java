import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class importar {
    public LinkedList<doctor> importarDoctor(String Archivo){
        LinkedList<doctor> lista = new LinkedList<>();
        try{
            BufferedReader importar = new BufferedReader(new FileReader(Archivo));
            String linea = "";
            while ((linea = importar.readLine()) != null) {
                String[] lineas = linea.split(":");
                String atributo = lineas[0].toLowerCase().trim();
                String valor = lineas[1];

                switch (atributo) {
                    case "nombre":
                        String nombre = valor.trim();
                        String disponible = importar.readLine().split(":")[1].trim();
                        lista.add(new doctor(nombre, disponible.equals("si")));
                        importar.readLine();
                        break;
                
                    default:
                        break;
                }
            }
            importar.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return lista;
    }
    
}

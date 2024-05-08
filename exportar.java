import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;

public class exportar {
    public void exportarDoct(LinkedList<doctor> lista){
        try {
            File archivo = new File("Doctores.txt");
            boolean exists = archivo.exists();
            FileWriter exportar = new FileWriter(archivo, !exists);

            for (doctor doctor : lista) {
                exportar.write("Nombre"+":"+doctor.getNombre()+"\n");
                if(doctor.isDisponible()==true)
                    exportar.write("Disponible"+":"+"si"+"\n");
                else
                    exportar.write("Disponible"+":"+"no"+"\n");

                exportar.write("\n");
            }
            exportar.close();
        } catch (Exception e) {
        }
    }
}

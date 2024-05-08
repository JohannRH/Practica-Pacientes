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

    public void exportarPac(LinkedList<paciente> lista){
        try {
            File archivo = new File("Pacientes.txt");
            boolean exists = archivo.exists();
            FileWriter exportar = new FileWriter(archivo, !exists);

            for (paciente pac : lista) {
                exportar.write("Nombre"+":"+pac.getNombre()+"\n");
                exportar.write("Edad"+":"+pac.getEdad()+"\n");
                exportar.write("Tipo de Sangre"+":"+pac.getTipoSangre()+"\n");
                exportar.write("Ultima Cita"+":"+pac.getUltimaCita()+"\n");
                exportar.write("\n");
            }
            exportar.close();
        } catch (Exception e) {
        }
    }
}

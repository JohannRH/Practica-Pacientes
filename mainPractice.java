import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class mainPractice {
    static BufferedReader cp = new BufferedReader(new InputStreamReader(System.in));
    static LinkedList<paciente> pacientes = new LinkedList<>();
    static LinkedList<doctor> doctors = new LinkedList<>();
    static calcularCita cCita = new calcularCita();
    static importar importDoct = new importar();
    static exportar exportDoct = new exportar();

    public static void main(String[] args) throws IOException{
        int op = 0;
        doctors = importDoct.importarDoctor("Doctores.txt");
        do{
            System.out.println("BIENVENIDO\n");
            System.out.println("1. Ingresar Paciente\n0. Salir");
            op = Integer.parseInt(cp.readLine());
            switch (op) {
                case 1:
                    paciente pac = new paciente();
                    System.out.println("\nIngrese Datos Paciente: ");
                    System.out.println("Nombre: ");
                    pac.setNombre(cp.readLine());
                    System.out.println("Edad: ");
                    pac.setEdad(Integer.parseInt(cp.readLine()));
                    System.out.println("Tipo Sangre");
                    pac.setTipoSangre(cp.readLine());
                    pac.setUltimaCita(cCita.ultimaCita());
                    pacientes.add(pac);

                    int op2 = 0;
                    System.out.println("\nHola Señor(@) " + pac.getNombre());
                    System.out.println("\n1.Agendar Nueva Cita");
                    op2 = Integer.parseInt(cp.readLine());

                    switch (op2) {
                        case 1:
                            boolean doctEn = false;
                            for (doctor doct : doctors) {
                                if (doct.disponible == true) {
                                    doctEn = true;
                                    System.out.println("Ultima cita: "+ pac.getUltimaCita());
                                    System.out.println("Su cita quedo agendada para el dia: " + cCita.proxCita(pac.getEdad(), pac.getUltimaCita()));
                                    System.out.println("El doctor que lo atendera es: "+doct.getNombre()+"\n");
                                    doct.disponible = false;
                                    break;
                                }
                            }
                            if (!doctEn)
                                System.out.println("No hay un doctor disponible para su cita\n");
                            break;
                        default:
                            break;
                    }

                    exportDoct.exportarDoct(doctors);
                    break;
                default:
                    break;
            }
        }while(op != 0);
    }
}

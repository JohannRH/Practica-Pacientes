import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class mainPractice {
    static BufferedReader cp = new BufferedReader(new InputStreamReader(System.in));
    static LinkedList<paciente> pacientes = new LinkedList<>();
    static LinkedList<doctor> doctors = new LinkedList<>();
    static calcularCita cCita = new calcularCita();

    public static void main(String[] args) throws IOException{
        int op = 0;

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
                    do{
                        System.out.println("Hola Señor(@) " + pac.getNombre());
                        System.out.println("\n1.Agendar Nueva Cita \n0.Salir");
                        op2 = Integer.parseInt(cp.readLine());

                        switch (op2) {
                            case 1:
                                System.out.println("Ultima cita: "+ pac.getUltimaCita());
                                System.out.println("Su cita quedo agendada para el dia: " + cCita.proxCita(pac.getEdad(), pac.getUltimaCita()));
                                break;
                            default:
                                break;
                        }
                    }while(op2 != 0);

                    break;
                default:
                    break;
            }
        }while(op != 0);
    }
}

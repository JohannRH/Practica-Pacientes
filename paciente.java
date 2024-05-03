public class paciente {
    public String nombre;
    public int edad;
    public String tipoSangre;
    public String ultimaCita;

    
    public paciente() {

    }

    public paciente(String nombre, int edad, String tipoSangre, String ultimaCita) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoSangre = tipoSangre;
        this.ultimaCita = ultimaCita;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getUltimaCita() {
        return ultimaCita;
    }

    public void setUltimaCita(String ultimaCita) {
        this.ultimaCita = ultimaCita;
    }

    
}

public class doctor {
    public String nombre;
    public boolean disponible;
    public String diaCita;

    public doctor() {
    }
    
    public doctor(String nombre, boolean disponible, String diaCita) {
        this.nombre = nombre;
        this.disponible = disponible;
        this.diaCita = diaCita;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getDiaCita() {
        return diaCita;
    }

    public void setDiaCita(String diaCita) {
        this.diaCita = diaCita;
    }
    
}

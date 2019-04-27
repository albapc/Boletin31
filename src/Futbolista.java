public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void entrevista() {
        System.out.println("El jugador da una entrevista");
    }

    @Override
    public void concentrarse() {
        System.out.println("Se concentra el futbolista");
    }

    @Override
    public void viajar() {
        System.out.println("Viaja el futbolista");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena el futbolista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El futbolista juega un partido");
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "dorsal= " + dorsal +
                ", demarcacion= '" + demarcacion + '\'' +
                ", id= " + id +
                ", nombre= '" + nombre + '\'' +
                ", apellidos= '" + apellidos + '\'' +
                ", edad= " + edad +
                '}';
    }
}

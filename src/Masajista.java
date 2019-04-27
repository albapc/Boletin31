public class Masajista extends SeleccionFutbol {

    private String titulacion;
    private int anhosExp;

    public Masajista() {
    }

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int anhosExp) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.anhosExp = anhosExp;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnhosExp() {
        return anhosExp;
    }

    public void setAnhosExp(int anhosExp) {
        this.anhosExp = anhosExp;
    }

    public void darMasaje() {
        System.out.println("El masajista da un masaje");
    }

    @Override
    public void concentrarse() {
        System.out.println("Se concentra el masajista");
    }

    @Override
    public void viajar() {
        System.out.println("Viaja el masajista");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena el masajista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El masajista juega un partido");
    }

    @Override
    public String toString() {
        return "Masajista{" +
                "titulacion= '" + titulacion + '\'' +
                ", anhosExp= " + anhosExp +
                ", id= " + id +
                ", nombre= '" + nombre + '\'' +
                ", apellidos= '" + apellidos + '\'' +
                ", edad= " + edad +
                '}';
    }
}

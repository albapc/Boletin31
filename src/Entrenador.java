public class Entrenador extends SeleccionFutbol {

    private int idFede;

    public Entrenador() {
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, int idFede) {
        super(id, nombre, apellidos, edad);
        this.idFede = idFede;
    }

    public int getIdFede() {
        return idFede;
    }

    public void setIdFede(int idFede) {
        this.idFede = idFede;
    }

    public void planificarEntrenamiento() {
        System.out.println("El entrenador planifica el entrenamiento");
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El entrenador viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El entrenador juega un partido");
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "idFede= " + idFede +
                ", id= " + id +
                ", nombre= '" + nombre + '\'' +
                ", apellidos= '" + apellidos + '\'' +
                ", edad= " + edad +
                '}';
    }
}

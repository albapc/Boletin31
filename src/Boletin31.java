import java.util.ArrayList;

public class Boletin31 {
    public static void main(String[] args) {

        ArrayList<SeleccionFutbol> equipo = new ArrayList<>();

        equipo.add(new Futbolista(786, "Cristiano", "Ronaldo", 34, 7, "Delantero"));
        equipo.add(new Entrenador(784, "Zinedine", "Zidane", 46, 60));
        equipo.add(new Masajista(787, "Manuel", "Rodriguez", 47, "Fisioterapia", 23));

        for (SeleccionFutbol miembro : equipo) {
            System.out.println(miembro);
        }

        //MÉTODOS DEFAULT
        for (SeleccionFutbol miembro : equipo) {
            System.out.print(miembro.getNombre() + " " + miembro.getApellidos());
            miembro.ruedaPrensa();
        }

        for (SeleccionFutbol miembro : equipo) {
            System.out.print(miembro.getNombre() + " " + miembro.getApellidos());
            miembro.videoPublicitario();
        }

    }
}

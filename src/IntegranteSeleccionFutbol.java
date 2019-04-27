public interface IntegranteSeleccionFutbol {

    void concentrarse();

    void viajar();

    void entrenar();

    void jugarPartido();

    default void ruedaPrensa() {
        System.out.println(" da una rueda de prensa");
    }

    default void videoPublicitario() {
        System.out.println(" hace un vídeo publicitario");
    }
}

/**
 * Clase base abstracta que representa cualquier puerta del sistema de ascensores.
 * Maneja el estado abierto/cerrado y la deteccion de obstaculos. Es abstracta porque
 * existen puertas de ascensor y puertas de piso con comportamientos diferentes.
 */

public abstract class Puerta {

    // Indica si la puerta esta abierta (true) o cerrada (false)
    private boolean abierta;
    // Indica si hay un obstaculo que impide cerrar la puerta
    private boolean hayObstaculo;

    /**
     * Constructor: inicializa la puerta cerrada sin obstaculos.
     */
    public Puerta() {
        this.abierta = false;
        this.hayObstaculo = false;
    }

    /**
     * Abre la puerta.
     */
    public void abrir() {
        this.abierta = true;
        System.out.println("Puerta abierta.");
    }

    /**
     * Intenta cerrar la puerta. Si hay un obstaculo, no cierra y lo informa.
     */
    public void cerrar() {
        if (hayObstaculo) {
            System.out.println("Hay un obstaculo, no se puede cerrar.");
            return;
        }
        this.abierta = false;
        System.out.println("Puerta cerrada.");
    }

    /**
     * Devuelve si hay un obstaculo detectado en la puerta.
     */
    public boolean detectarObstaculo() {
        return hayObstaculo;
    }

    /**
     * Permite establecer si hay un obstaculo bloqueando la puerta.
     */
    public void setHayObstaculo(boolean hayObstaculo) {
        this.hayObstaculo = hayObstaculo;
    }

    /**
     * Devuelve si la puerta esta abierta o cerrada.
     */
    public boolean isAbierta() {
        return abierta;
    }
}
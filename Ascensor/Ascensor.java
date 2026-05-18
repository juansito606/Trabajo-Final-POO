/**
 * Clase que representa el ascensor. Gestiona el piso actual, la direccion del movimiento,
 * el boton de seleccion de pisos y la puerta del ascensor.
 */

public class Ascensor {

    // Guarda el numero del piso en el que se encuentra actualmente el ascensor
    private int pisoActual;
    // Almacena la direccion del movimiento: "SUBIR", "BAJAR" o "QUIETO"
    private String direccion;
    // Boton para seleccionar pisos dentro del ascensor
    private BotonAscensor boton;
    // Puerta del ascensor
    private PuertaAscensor puerta;

    /**
     * Constructor: inicializa el ascensor en el piso 1, sin movimiento, crea su boton y puerta.
     */
    public Ascensor() {
        this.pisoActual = 1;
        this.direccion = "QUIETO";
        this.boton = new BotonAscensor();
        this.puerta = new PuertaAscensor();
    }

    /**
     * Mueve el ascensor desde el piso actual hasta el piso destino.
     * Determina automaticamente si debe subir o bajar.
     */
    public void mover(int pisoDestino) {
        if (pisoDestino > pisoActual) {
            this.direccion = "SUBIR";
        } else if (pisoDestino < pisoActual) {
            this.direccion = "BAJAR";
        } else {
            System.out.println("Ya estamos en el piso " + pisoActual);
            return;
        }
        System.out.println("Ascensor yendo del piso " + pisoActual + " al piso " + pisoDestino);
        this.pisoActual = pisoDestino;
        this.direccion = "QUIETO";
    }

    /**
     * Cambia la direccion del ascensor: si iba para arriba va para abajo y viceversa.
     */
    public void cambiarDireccion() {
        if (this.direccion.equals("SUBIR")) {
            this.direccion = "BAJAR";
        } else {
            this.direccion = "SUBIR";
        }
        System.out.println("Direccion cambiada a: " + direccion);
    }

    /**
     * Devuelve el numero del piso actual del ascensor.
     */
    public int getPisoActual() {
        return pisoActual;
    }

    /**
     * Devuelve la direccion actual del ascensor.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Devuelve el boton de seleccion de pisos del ascensor.
     */
    public BotonAscensor getBoton() {
        return boton;
    }

    /**
     * Devuelve la puerta del ascensor.
     */
    public PuertaAscensor getPuerta() {
        return puerta;
    }
}
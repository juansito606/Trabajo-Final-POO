/**
 * Clase que representa un boton dentro del ascensor. Hereda de Boton
 * y agrega funcionalidad para seleccionar pisos y mantener puertas abiertas.
 */

public class BotonAscensor extends Boton {
    // Almacena el numero del piso destino seleccionado
    private int pisoDestino;
    // Indica si el usuario quiere mantener las puertas abiertas
    private boolean mantenerAbierto;

    /**
     * Constructor: crea un boton de ascensor apagado, sin piso destino y sin mantener puertas abiertas.
     */
    public BotonAscensor (){
        super ();
        this.pisoDestino = 0;
        this.mantenerAbierto = false;
    }

    /**
     * Selecciona un piso como destino, enciende la luz del boton e informa al sistema.
     */
    public void seleccionarPiso (int piso) {
        this.pisoDestino = piso;
        presionar();
        System.out.println("Piso " + piso + " seleccionado");       
    }

    /**
     * Permite mantener las puertas del ascensor abiertas presionando un boton especial.
     */
    public void mantenerPuertasAbiertas() {
        this.mantenerAbierto = true;
        System.out.println ("Puertas abiertas"); 
    }

    /**
     * Devuelve el piso destino que el usuario selecciono.
     */
    public int getPisoDestino (){
        return pisoDestino;
    }

    /**
     * Devuelve si las puertas deben mantenerse abiertas o no.
     */
    public boolean isMantenerAbierto () {
        return mantenerAbierto;
    }

}
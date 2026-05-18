
/**
 * Clase que representa un piso del edificio. Cada piso tiene un numero identificador,
 * un boton para llamar al ascensor y una puerta por donde entran y salen los usuarios.
 */

public class Piso {
    
    // Numero identificador del piso
    private int numero;
    // Boton del pasillo para solicitar el ascensor
    private BotonPiso boton;
    // Puerta de acceso a este piso
    private PuertaPiso puerta;

    /**
     * Constructor: inicializa el piso con su numero, crea su boton y su puerta.
     */
    public Piso (int numero) {
        this.numero = numero;
        this.boton = new BotonPiso();
        this.puerta = new PuertaPiso (numero);
    }

    /**
     * Simula llamar al ascensor desde este piso. Si el boton esta fallando devuelve false.
     */
    public boolean llamarAscensor () {
        if (boton.isFallando()) {
            System.out.println("EL boton del piso " + numero + " esta fallando");
            return false;
        }
        System.out.println("Ascensor llamado desde el piso " + numero);
        return true;
    }

    /**
     * Devuelve el numero del piso.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Devuelve el boton de llamada del piso.
     */
    public BotonPiso getBoton() {
        return boton;
    }

    /**
     * Devuelve la puerta de acceso del piso.
     */
    public PuertaPiso getPuerta(){
        return puerta;
    }
}

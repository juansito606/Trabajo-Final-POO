/**
 * Clase que representa la puerta de acceso de un piso. Hereda de Puerta y agrega
 * informacion del numero de piso asociado a esta puerta.
 */

public class PuertaPiso extends Puerta {

    // Numero del piso al que pertenece esta puerta
    private int numeroPiso;

    /**
     * Constructor: inicializa la puerta del piso con su numero asociado.
     */
    public PuertaPiso (int numeroPiso) { 
        super();
        this.numeroPiso = numeroPiso;
    }

    /**
     * Sincroniza la puerta del piso con la puerta del ascensor para operaciones coordinadas.
     */
    public void sincronizar () {
        System.out.println("Puerta del piso " + numeroPiso + " sincronizado con el ascensor. ");
    }

    /**
     * Devuelve el numero del piso al que pertenece esta puerta.
     */
    public int getNumeroPiso () {
        return numeroPiso;
    }
    
}

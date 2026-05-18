/**
 * Clase que representa la puerta del ascensor. Hereda de Puerta y agrega
 * un sensor de seguridad para detectar si la puerta esta en condiciones optimas.
 */

public class PuertaAscensor extends Puerta {

    // Indica si el sensor de seguridad de la puerta esta activo o desactivado
    private boolean sensorActivo;

    /**
     * Constructor: inicializa la puerta del ascensor con el sensor de seguridad activo.
     */
    public PuertaAscensor () {
        super ();
        this.sensorActivo = true;
    }

    /**
     * Bloquea la puerta por razones de seguridad durante el movimiento del ascensor.
     */
    public void bloquear () {
        System.out.println("Puerta bloqueada por seguridad,");

    }
    
    /**
     * Devuelve si el sensor de seguridad de la puerta esta activo.
     */
    public boolean isSensorActivo() {
        return sensorActivo;
    }

    /**
     * Permite activar o desactivar el sensor de seguridad. Si se desactiva, genera una alerta.
     */
    public void setSensorActivo (boolean sensorActivo) {
        this.sensorActivo = sensorActivo;
        if (!sensorActivo) {
            System.out.println("Alerta: Sensor desactivado.");
        }
    }
}

public class PuertaAscensor extends Puerta {

    private boolean sensorActivo;

    public PuertaAscensor () {
        super ();
        this.sensorActivo = true;
    }

    public void bloquear () {
        System.out.println("Puerta bloqueada por seguridad,");

    }
    
    public boolean isSensorActivo() {
        return sensorActivo;
    }

    public void setSensorActivo (boolean sensorActivo) {
        this.sensorActivo = sensorActivo;
        if (!sensorActivo) {
            System.out.println("Alerta: Sensor desactivado.");
        }
    }
}

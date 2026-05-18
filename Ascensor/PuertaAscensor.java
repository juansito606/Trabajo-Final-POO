public class PuertaAscensor extends Puerta {

    private boolean sensorActivo;

    public PuertaAscensor () {
        super ();
        this.sensorActivo = true;
    }

    public void bloquear () {
        System.out.println("Puerta bloqueada por seguridad,");

    }
    
    pubic boolean isSensorActivo() {
        return sensorActivo;
    }
}

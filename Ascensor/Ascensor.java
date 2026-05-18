public class Ascensor {

    private int pisoActual;
    private String direccion;
    private BotonAscensor boton;
    private PuertaAscensor puerta;

    public Ascensor() {
        this.pisoActual = 1;
        this.direccion = "QUIETO";
        this.boton = new BotonAscensor();
        this.puerta = new PuertaAscensor();
    }

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

    public void cambiarDireccion() {
        if (this.direccion.equals("SUBIR")) {
            this.direccion = "BAJAR";
        } else {
            this.direccion = "SUBIR";
        }
        System.out.println("Direccion cambiada a: " + direccion);
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public String getDireccion() {
        return direccion;
    }

    public BotonAscensor getBoton() {
        return boton;
    }

    public PuertaAscensor getPuerta() {
        return puerta;
    }
}
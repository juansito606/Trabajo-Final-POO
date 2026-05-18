import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SistemaControl {

    private Ascensor ascensor;
    private ArrayList<Piso> pisos;
    private Queue<Integer> solicitudes;
    private boolean enEmergencia;

    public SistemaControl(int numeroPisos) {
        this.ascensor = new Ascensor();
        this.pisos = new ArrayList<>();
        this.solicitudes = new LinkedList<>();
        this.enEmergencia = false;

        for (int i = 1; i <= numeroPisos; i++) {
            pisos.add(new Piso(i));
        }
    }

    public void procesarSolicitud(int piso) {
        if (enEmergencia) {
            System.out.println("Sistema en emergencia, no se aceptan solicitudes.");
            return;
        }
        solicitudes.add(piso);
        System.out.println("Solicitud agregada para el piso " + piso);
        optimizarMovimiento();
    }

    public void optimizarMovimiento() {
        while (!solicitudes.isEmpty()) {
            int siguiente = solicitudes.poll();
            ascensor.getPuerta().cerrar();
            ascensor.mover(siguiente);
            ascensor.getPuerta().abrir();
            pisos.get(siguiente - 1).getPuerta().abrir();
            System.out.println("Ascensor llego al piso " + siguiente);
            pisos.get(siguiente - 1).getPuerta().cerrar();
            ascensor.getPuerta().cerrar();
        }
    }

    public void activarEmergencia() {
        this.enEmergencia = true;
        ascensor.getPuerta().abrir();
        System.out.println("EMERGENCIA ACTIVADA. Puertas abiertas. Ascensor detenido.");
    }

    public void registrarActividad(String actividad) {
        System.out.println("Registro: " + actividad);
    }

    public void reportarFallaBoton(int numeroPiso) {
        pisos.get(numeroPiso - 1).getBoton().setFallando(true);
        registrarActividad("Falla en boton del piso " + numeroPiso);
    }
}
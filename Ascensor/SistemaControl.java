import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Clase que gestiona el control del sistema completo de ascensores.
 * Coordina el movimiento del ascensor, procesa solicitudes de los pisos,
 * maneja situaciones de emergencia y registra actividades del sistema.
 */

public class SistemaControl {

    // El ascensor principal del sistema
    private Ascensor ascensor;
    // Lista de todos los pisos del edificio
    private ArrayList<Piso> pisos;
    // Cola de solicitudes pendientes de pisos que necesitan atension
    private Queue<Integer> solicitudes;
    // Bandera que indica si el sistema esta en modo emergencia
    private boolean enEmergencia;

    /**
     * Constructor: inicializa el sistema con un numero especifico de pisos.
     * Crea el ascensor, la cola de solicitudes y todos los pisos del edificio.
     */
    public SistemaControl(int numeroPisos) {
        this.ascensor = new Ascensor();
        this.pisos = new ArrayList<>();
        this.solicitudes = new LinkedList<>();
        this.enEmergencia = false;

        // Crear todos los pisos del edificio
        for (int i = 1; i <= numeroPisos; i++) {
            pisos.add(new Piso(i));
        }
    }

    /**
     * Procesa una nueva solicitud de un piso. Si el sistema esta en emergencia,
     * rechaza la solicitud. Si no, la agrega a la cola y optimiza el movimiento.
     */
    public void procesarSolicitud(int piso) {
        if (enEmergencia) {
            System.out.println("Sistema en emergencia, no se aceptan solicitudes.");
            return;
        }
        solicitudes.add(piso);
        System.out.println("Solicitud agregada para el piso " + piso);
        optimizarMovimiento();
    }

    /**
     * Atiende todas las solicitudes de la cola: abre puertas del ascensor,
     * se mueve al piso destino, abre puertas del piso y luego cierra todo.
     */
    public void optimizarMovimiento() {
        // Procesar todas las solicitudes en la cola
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

    /**
     * Activa el modo emergencia: abre las puertas del ascensor y lo detiene.
     * El sistema rechaza nuevas solicitudes mientras esta en emergencia.
     */
    public void activarEmergencia() {
        this.enEmergencia = true;
        ascensor.getPuerta().abrir();
        System.out.println("EMERGENCIA ACTIVADA. Puertas abiertas. Ascensor detenido.");
    }

    /**
     * Registra una actividad en el log del sistema para auditoria y diagnostico.
     */
    public void registrarActividad(String actividad) {
        System.out.println("Registro: " + actividad);
    }

    /**
     * Reporta una falla en el boton de un piso especifico.
     * Marca el boton como fallando y registra la actividad.
     */
    public void reportarFallaBoton(int numeroPiso) {
        pisos.get(numeroPiso - 1).getBoton().setFallando(true);
        registrarActividad("Falla en boton del piso " + numeroPiso);
    }
}
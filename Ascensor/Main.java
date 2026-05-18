/**
 * Clase principal que inicia y ejecuta pruebas del sistema de control de ascensores.
 * Realiza simulaciones de solicitudes normales, fallos en botones y activacion de emergencia.
 */

public class Main {

    /**
     * Punto de entrada del programa. Realiza pruebas funcionales del sistema.
     */
    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE CONTROL DE ASCENSORES ===");

        // Crear el sistema con 5 pisos
        SistemaControl sistema = new SistemaControl(5);

        System.out.println("\n--- Prueba 1: Solicitudes normales ---");
        // El ascensor atiende solicitudes en orden
        sistema.procesarSolicitud(3);
        sistema.procesarSolicitud(5);
        sistema.procesarSolicitud(2);

        System.out.println("\n--- Prueba 2: Falla en boton ---");
        // Se reporta una falla en el boton del piso 4 y se intenta acceder a el
        sistema.reportarFallaBoton(4);
        sistema.procesarSolicitud(4);

        System.out.println("\n--- Prueba 3: Emergencia ---");
        // Se activa modo emergencia y el sistema rechaza nuevas solicitudes
        sistema.activarEmergencia();
        sistema.procesarSolicitud(1);

        System.out.println("\n=== FIN DEL SISTEMA ===");
    }
}
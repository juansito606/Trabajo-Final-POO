public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE CONTROL DE ASCENSORES ===");

        // Crear el sistema con 5 pisos
        SistemaControl sistema = new SistemaControl(5);

        System.out.println("\n--- Prueba 1: Solicitudes normales ---");
        sistema.procesarSolicitud(3);
        sistema.procesarSolicitud(5);
        sistema.procesarSolicitud(2);

        System.out.println("\n--- Prueba 2: Falla en boton ---");
        sistema.reportarFallaBoton(4);
        sistema.procesarSolicitud(4);

        System.out.println("\n--- Prueba 3: Emergencia ---");
        sistema.activarEmergencia();
        sistema.procesarSolicitud(1);

        System.out.println("\n=== FIN DEL SISTEMA ===");
    }
}
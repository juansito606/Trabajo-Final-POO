/**
 * Clase base abstracta que representa cualquier boton del sistema de ascensores.
 * Es abstracta porque no existe un boton generico, siempre es de piso o de ascensor.
 */


public abstract class Boton {

    // Indica si el boton esta iluminado o fallando (true = encendido, false = apagado)

    private boolean iluminado;
    private boolean fallando;

     /**
     * Constructor: crea un boton nuevo apagado y funcionando bien.
     */

    public Boton () {
        this.iluminado = false;
        this.fallando = false;


    }

      /**
     * Simula presionar el boton. Si esta fallando no hace nada.
     * Si funciona bien, enciende la luz.
     */

    public void presionar () {
        if (fallando) {
            System.out.println("El boton esta fallando");
            return;
        }
        this.iluminado = true;
        System.out.println("Boton presionado y con luz");
    }

     /**
     * Apaga la luz del boton cuando el ascensor ya atendio la solicitud.
     */
    public void apagar (){
        this.iluminado = false;
    }

    // Devuelve si el boton esta iluminado o no


    public boolean isIluminado () { 
        return iluminado;
    }

     // Devuelve si el boton esta fallando o no

    public boolean isFallando () {
        return fallando;
    }

     /**
     * Permite reportar que un boton esta danado.
     * Lo llama el SistemaControl cuando detecta una falla.
     */

    public void setFallando (boolean fallando) {
        this.fallando = fallando;
        if (fallando) {
            System.out.println("Alerta: Un boton ta malo");
        }
        
    }
}
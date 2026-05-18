public class BotonAscensor extends Boton {
    private int pisoDestino;
    private boolean mantenerAbierto;

    public BotonAscensor (){
        super ();
        this.pisoDestino = 0;
        this.mantenerAbierto = false;
    }

    public void seleccionarPiso (int piso) {
        this.pisoDestino = piso;
        presionar();
        System.out.println("Piso " + piso + " seleccionado");       
    }

    public void mantenerPuertasAbiertas() {
        this.mantenerAbierto = true;
        System.out.println ("Puertas abiertas"); 
    }

    public int getPisoDestino (){
        return pisoDestino;
    }

    public boolean isMantenerAbierto () {
        return mantenerAbierto;
    }

}
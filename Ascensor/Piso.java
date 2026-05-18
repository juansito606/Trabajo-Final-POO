import javax.print.attribute.PrintRequestAttribute;

public class Piso {
    
    private int numero;
    private BotonPiso boton;
    private PuertaPiso puerta;

    public Piso (int numero) {
        this.numero = numero;
        this.boton = new BotonPiso();
        this.puerta = new PuertaPiso (numero);
    }

    public boolean llamarAscensor () {
        if (boton.isFallando()) {
            System.out.println("EL boton del piso " + numero + " esta fallando");
            return false;
        }
        System.out.println("Ascensor llamado desde el piso " + numero);
        return true;
    }

    public int getNumero() {
        return numero;
    }

    public BotonPiso getBoton() {
        return boton;
    }

    public PuertaPiso getPuerta(){
        return puerta;
    }
}

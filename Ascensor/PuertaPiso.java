public class PuertaPiso extends Puerta {

    private int numeroPiso;

    public PuertaPiso (int numeroPiso) { 
        super();
        this.numeroPiso = numeroPiso;
    }

    public void sincronizar () {
        System.out.println("Puerta del piso " + numeroPiso + " sincronizado con el ascensor. ");
    }

    public int getNumeroPiso () {
        return numeroPiso;
    }
    
}

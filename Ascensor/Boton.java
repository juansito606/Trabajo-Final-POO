public abstract class Boton {
    private boolean iluminado;
    private boolean fallando;

    public Boton () {
        this.iluminado = false;
        this.fallando = false;

    }

    public void presionar () {
        if (fallando) {
            System.out.println("El boton esta fallando");
            return;
        }
        this.iluminado = true;
        System.out.println("Boton presionado y con luz");
    }
    public void apagar (){
        this.iluminado = false;
    }

    public boolean isIluminado () { 
        return iluminado;
    }

    public boolean isFallando () {
        return fallando;
    }

    public void setFallando (boolean fallando) {
        this.fallando = fallando;
        if (fallando) {
            System.out.println("Alerta: Un boton ta malo");
        }
        
    }
}
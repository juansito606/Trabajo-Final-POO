public class BotonPiso extends Boton {
    private String direccion;

    public BotonPiso () {
        super();
        this.direccion = null;
    }

    public void solicitarSubida(){
        this.direccion = "SUBIR";
        presionar();
        System.out.println("Sube");
    }

    public void solicitarBajada() {
        this.direccion = "BAJAR";
        presionar ();
        System.out.println("BAJANDO");
        
    }

    public String getDireccion (){
        return direccion;
    }
}
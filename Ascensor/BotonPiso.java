// Boton del pasillo de cada piso. Hereda de Boton y agrega direccion (SUBIR/BAJAR)

public class BotonPiso extends Boton {
    private String direccion; // Guarda "SUBIR" o "BAJAR"

    public BotonPiso () {
        super(); // Inicializa lo del padre (iluminado, fallando)
        this.direccion = null; // null = nadie ha pedido nada todavia
    }

     // Cuando alguien presiona el boton de subir

    public void solicitarSubida(){
        this.direccion = "SUBIR";
        presionar(); // Herencia: enciende la luz del padre
        System.out.println("Sube");
    }

    // Cuando alguien presiona el boton de bajar

    public void solicitarBajada() {
        this.direccion = "BAJAR";
        presionar ();
        System.out.println("BAJANDO");
        
    }

    // Permite al sistema saber hacia donde quiere ir la persona

    public String getDireccion (){
        return direccion;
    }
}
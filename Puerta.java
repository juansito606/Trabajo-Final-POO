public abstract class Puerta {

    private boolean abierta;
    private boolean hayObstaculo;

    public Puerta () {
        this.abierta = false;
        this.hayObstaculo = false;       
    }

    public void abrir () {
        this.abierta =true;
        System.out.println("Puerta abierta. ");
    }

    public void cerrar () {
        if (hayObstaculo) {
            System.out.println("Hay un obstaculo, no se puede cerrar");
            return;
        }

        this.abierta = false;
        System.out.println("Puerta cerrrada");

        public boolean detectarObstaculo () {
            return hayObstaculo;
        }
        
        public void setHayObstaculo (boolean hayObstaculo) {
            this.hayObstaculo = hayObstaculo;
        }

        public boolean isAbierta (){
            return abierta;
        }
    }
}
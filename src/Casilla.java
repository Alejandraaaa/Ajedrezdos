public class Casilla {
    private Pieza pieza;
    private Posicion posicion;
    //private boolean esVacia;

    public Casilla() {
        
    }


    public Pieza getPieza() {
        return pieza;
    }

    public Posicion getPosicion() {
        return posicion;
    }
    public void ponerPieza(Pieza pieza){
        this.pieza = pieza;
    }

//    public void setPieza(Pieza pieza) {
//        this.pieza = pieza;
//    }
    public String toString(){
        String pieza = "";
           pieza = this.pieza + " ";
        return pieza;
    }
}


public class Casilla {
    private Pieza pieza;
    private Posicion posicion;
    //private boolean esVacia;

    public Casilla() {
        
    }
    public void moverPieza(Casilla casillaFinal){
        casillaFinal.ponerPieza(this.getPieza());
        this.pieza = null;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
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

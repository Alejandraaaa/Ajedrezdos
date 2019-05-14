public class Posicion {
    private int x;
    private int y;
    private Pieza pieza;
    
    public void setPosicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    void setPieza(Pieza piezaInicial) {
           this.pieza = piezaInicial;
    }
    
}

//Posicion 
//<<Constructor>> Posicion(esBlanco : boolean);
//-x : int 
//-y : int
//-pieza : Pieza
//+setPosicion(int x, int y): void
//+setX(int x): void
//+setY(int y): void
//+getX(): int
//+getY(): int

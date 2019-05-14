public class Casilla{
    private Pieza pieza;
    
    public Casilla(){
        this.pieza = null;//Pensar en crear una clase para las casillas vacias
    }
    public boolean esVacia() {
    boolean esVacia = true;
    if(this.pieza != null){
            esVacia = false;
        }
        else{
            esVacia = true;
        }
        return esVacia;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }
}

//
//Casilla 
//- pieza : Pieza
//<<Constructor>> Casilla(esBlanco : boolean);
//+verificarCasillas(): booolean[][]
//+casillasVacias(Posicion posicionNueva, Tablero tablero): boolean[][]
//+verificarMovimiento(Posicion posicionNueva, Tablero tablero) :boolean


    
    

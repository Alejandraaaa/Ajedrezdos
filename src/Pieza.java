public abstract class Pieza {
    //private Posicion posicion;
   // private Tablero tablero;
    private Casilla casilla;
    private boolean esBlanco;
    private boolean movLegal;
    private char nombre;
    private boolean viva;
 
//    public Pieza(){
//       // this.casilla = casilla;
//        this.esBlanco = true;
//        this.nombre = null;
//    }
    public Pieza( boolean blanco, char nombre){
       // this.casilla = casilla;
        this.esBlanco = blanco;
        this.nombre = nombre;
    }
    abstract public void mover();  
    public boolean verificarMovimiento(Posicion posicion){
    
        return movLegal;
     
    }  
    public void comer(Casilla casilla){
        
        
    }
    public String toString(){
       return " "+ nombre;
    }

    public Casilla conseguirCasilla() {
        
        return casilla;
    }

    public boolean isEsBlanco() {
        return esBlanco;
    }

    public boolean isMovLegal() {
        return movLegal;
    }

    public char getNombre() {
        return nombre;
    }

    public boolean isViva() {
        return viva;
    }
    public void setMoverPieza(){
        
        
    }
//        tablero[2][5].ponerPieza(tablero[0][5].getPieza());
//        
////        pieza = tablero[7][0].getPieza();
////        ((Torre)pieza).mover(tablero[2][8]);
////        ((Torre)pieza.   
//        System.out.println(tablero[2][5].getPieza());
////        System.out.println(pieza.isEsBlanco());
    }

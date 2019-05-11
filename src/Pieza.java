public abstract class Pieza {
    //private Posicion posicion;
   // private Tablero tablero;
    private Casilla casilla;
    private boolean esBlanco;
    private boolean movLegal;
    private char nombre;
    private boolean viva;
    public String PiezaX;
 
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
    
    
    
}

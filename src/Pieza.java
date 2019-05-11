public abstract class Pieza {
    //private Posicion posicion;
   // private Tablero tablero;
    private Casilla casilla;
    private boolean esBlanco;
    private boolean movLegal;
    private String nombre;
    private boolean viva;
    
 

    public Pieza( boolean blanco){
       // this.casilla = casilla;
        this.esBlanco = blanco;
    }
    abstract public void mover();  
    public boolean verificarMovimiento(Posicion posicion){
     
        return movLegal;
     
    }  
    public void comer(Casilla casilla){
        
        
    }
    
    
}

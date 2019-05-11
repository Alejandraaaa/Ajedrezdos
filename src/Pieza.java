public abstract class Pieza {
    //private Posicion posicion;
   // private Tablero tablero;
    private Casilla casilla;
    private boolean esBlanco;
    private boolean movLegal;
    private String nombre;
    private boolean viva;
    public String PiezaX;
 
//    public Pieza(){
//       // this.casilla = casilla;
//        this.esBlanco = true;
//        this.nombre = null;
//    }
    public Pieza( boolean blanco){
       // this.casilla = casilla;
        this.esBlanco = blanco;
        this.nombre = PiezaX;
    }
    abstract public void mover();  
    public boolean verificarMovimiento(Posicion posicion){
    
        return movLegal;
     
    }  
    public void comer(Casilla casilla){
        
        
    }
    public String toString(){
       return "Nombre" + nombre;
    }
    
    
    
}

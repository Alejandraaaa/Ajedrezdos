public abstract class Pieza {
    private int valor;
    private Posicion posicion;
    private Tablero tablero;
    private Casilla casilla;
    private boolean esBlanco;

    public Pieza(Posicion posicion, boolean blanco) {
    }

    public Pieza(Posicion posicion) {
        this.posicion = posicion;
        
    }
    abstract public void mover();  
    
    
}

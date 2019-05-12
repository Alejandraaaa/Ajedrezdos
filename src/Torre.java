public class Torre extends Pieza {
    private Casilla casilla;
    public Torre( boolean blanco, char nombre) {
        super(blanco,nombre);
    }

    public void mover(Casilla casilla) {
        int primerCoordenada = this.getCasilla().getPosicion().getX();
        int segundaCoordenada = this.getCasilla().getPosicion().getY();
        Posicion posicion = new Posicion(primerCoordenada, segundaCoordenada);
        
        casilla.moverPieza(casilla);
        
        this.casilla = casilla;
    }
    public void comer(){
        
    }

    @Override
    public void mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        
    
}
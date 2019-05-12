public class Rey extends Pieza{
    private boolean estoyEnJaque;
    private boolean jaqueMate;

    public Rey( boolean blanco, char nombre) {
        super(blanco,nombre);
    }

    public void verificar(){
        
    }
    

    
    @Override
    public void mover() {
        
    }

    @Override
    public void verificarMovimiento(Posicion posicion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

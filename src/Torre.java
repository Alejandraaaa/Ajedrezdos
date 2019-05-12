public class Torre extends Pieza {
    private Casilla casilla;
    public Torre( boolean blanco, char nombre) {
        super(blanco,nombre);  
    }
    
    public void comer(){
        
    }
    public void mover(Casilla[][] arreglo, Casilla casillaFinal) {
        int coordenadaInicial = this.conseguirMiCasilla(arreglo).conseguirX(arreglo);
        int coordenadaInicialDos = this.conseguirMiCasilla(arreglo).conseguirY(arreglo);
        int coordenadaFinal = casillaFinal.conseguirX(arreglo);
        int coordenadaFinalDos = casillaFinal.conseguirY(arreglo);
        if((coordenadaInicial == coordenadaFinal && coordenadaInicialDos != coordenadaFinalDos) || (coordenadaFinalDos == coordenadaFinalDos && coordenadaInicial != coordenadaFinal)){
            this.conseguirMiCasilla(arreglo).moverPieza(casillaFinal);
        }       
    }

    @Override
    public void verificarMovimiento(Posicion posicion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
}
//public class Rey extends Pieza{
//    private boolean estoyEnJaque;
//    private boolean jaqueMate;
//
//    public Rey( boolean blanco, String nombre) {
//        super(blanco,nombre);
//    }
//
//    public void verificar(){
//        
//    }
//    
//
//    
//    @Override
//    public void mover() {
//        
//    }
//
//    @Override
//    public void verificarMovimiento(Posicion posicion) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    
//}
public class Rey extends Pieza {

    @Override
    boolean[][] verificarCasillas() {
        boolean [][] posicionesPosibles = new boolean [8][8];
        int x = this.getPosicion().getX();
        int y = this.getPosicion().getY();
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if (i == x || i == x+1 || i == x-1){
                    if(j == y || j == y+1 || j == y-1)
                        posicionesPosibles[i][j] = true;
                }                   
            }
        }
        posicionesPosibles[x][y] = false;
        return posicionesPosibles;
    }
    
    @Override
     boolean verificarMovimiento(Posicion posicion, Tablero tablero){
//           int entrada1 = getPosicion().getX();
//           int entradaFinal1 = getPosicion().getY();
           int entrada2 = posicion.getX();
           int entradaFinal2 = posicion.getY();
         
           
       if(verificarCasillas()[entrada2][entradaFinal2]){
           return false;
       }
       if (piezasBlancas(tablero)[entrada2][entradaFinal2]){
           return false;
       }
        return true;
    }
}

    

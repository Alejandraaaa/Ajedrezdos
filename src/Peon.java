//public class Peon extends Pieza{
//    public Peon(boolean blanco, String nombre) {
//        super(blanco, nombre);
//    }
//
//    @Override
//    public void mover() {
//        
//    }
//    public void comer(){
//        
//    }
//
//    @Override
//    public void verificarMovimiento(Posicion posicion) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//        
//    
//}
public class Peon extends Pieza {

    boolean[][] verificarCasillas() {
        boolean[][] posiciones = new boolean[8][8];
        int primero = this.getPosicion().getX();
        int segundo = this.getPosicion().getY();
        boolean blanco = this.isEsBlanco();
        if (blanco) {
            if (0 < segundo && segundo  <= 7) {
                posiciones[primero][segundo - 1] = true;
            }
        } else {
            
            if (0 <= segundo  && segundo  < 7) {
                posiciones[primero][segundo + 1] = true;
            }
        }

        posiciones[primero][segundo] = false;
        return posiciones;
    }

    boolean[][] posicionesParaComer() {
        boolean[][] comer = new boolean[8][8];
        int primero = this.getPosicion().getX();
        int segundo = this.getPosicion().getY();
        boolean blanco = this.isEsBlanco();
        if (blanco) {
            if (0 < segundo && segundo <= 7) {
                if (0 <= primero && primero < 7) {
                    comer[primero + 1][segundo - 1] = true;
                }
                if (0 < primero && primero <= 7) {
                    comer[primero - 1][segundo - 1] = true;
                }
            }
        } else {
           
             if (0 <= segundo  && segundo < 7) {
                if (0 <= primero && primero < 7) {
                    comer[primero + 1][segundo + 1] = true;
                }
                if (0 < primero && segundo <= 7) {
                    comer[primero - 1][segundo + 1] = true;
                }
            }
        }

        return comer;
    }
    
     @Override
     boolean verificarMovimiento(Posicion posicionNueva, Tablero tablero){
           int primeroInicial = getPosicion().getX();
           int segundoInicial = getPosicion().getY();
           int primeroFinal = posicionNueva.getX();
           int segundoFinal = posicionNueva.getY();
         
           
       if(verificarCasillas()[primeroFinal][segundoFinal] && (tablero.getTablero()[primeroFinal][segundoFinal].esVacia() == true))
           return true;
       
      if (posicionesParaComer()[primeroFinal][segundoFinal] && Negros(tablero)[primeroFinal][segundoFinal])
           return true;
      if(this.isEsBlanco()==false && segundoInicial==1 && segundoFinal == 3 && primeroFinal == primeroInicial )
          return true;
      if(this.isEsBlanco() && segundoInicial==6 && segundoFinal == 4 && primeroFinal == primeroInicial )
          return true;
      
        return false;
    }

}
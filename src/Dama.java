//public class Dama extends Pieza {
//
//    public Dama( boolean blanco, String nombre) {
//        super(blanco,nombre);
//    }
//
//    @Override
//    public void mover() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void verificarMovimiento(Posicion posicion) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//        
//    
//}
public class Dama extends Pieza {
   
    @Override
    boolean[][] verificarCasillas() {
        boolean [][] casillasDisponibles = new boolean [8][8];
        int x = this.getPosicion().getX();
        int y = this.getPosicion().getY();
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if (i == x || j == y )
                    casillasDisponibles[i][j] = true;
                if (i-x == j-y|| i-x == y-j )
                    casillasDisponibles[i][j] = true;                
            }
        }
        casillasDisponibles[x][y] = false;
        return casillasDisponibles;
    }
    
        private boolean casillasVacias(Posicion posicion, Tablero tablero) {
           int primera1 = getPosicion().getX();
           int segunda1 = getPosicion().getY();
           int primera2 = posicion.getX();
           int segunda2 = posicion.getY();
           int minX = Math.min(primera1, primera2);
           int maxX = Math.max(primera1, primera2);
           int minY = Math.min(segunda1,segunda2);
           int maxY = Math.max(segunda1,segunda2);
           
           if(primera1 == primera2)
               for(int i = minY + 1; i< maxY; i++)
                   if(tablero.getTablero()[primera1][i].esVacia() == false)
                       return false;
                  
           if(segunda1 == segunda2)
               for(int i = minX + 1; i< maxX; i++)
                   if(tablero.getTablero()[i][segunda1].esVacia() == false)
                       return false;
           
           if(primera1 - primera2 == segunda1-segunda2)
               for(int i = minX + 1; i< maxX; i++)
                   if(tablero.getTablero()[i][minY-minX + i].esVacia() == false)
                       return false;
                  
           if(primera1 - primera2 == segunda2 - segunda1)
               for(int i = minX + 1; i< maxX; i++)
                   if(tablero.getTablero()[i][maxX + minY -i].esVacia() == false)
                       return false;
                   
           return true;
                   
    }
    
    
    
    @Override
    boolean verificarMovimiento(Posicion posicion, Tablero tablero){
           int coordenadaInicia1 = getPosicion().getX();
           int coordenadaFinal1 = getPosicion().getY();
           int coordenadaInicia2 = posicion.getX();
           int coordenadaFinal12 = posicion.getY();
         
           
       if(verificarCasillas()[coordenadaInicia2][coordenadaFinal12] == false)
           return false;
       
       else
           if (piezasBlancas(tablero)[coordenadaInicia2][coordenadaFinal12])//Revisar la parte de los blancos
                return false;
           else
              if (casillasVacias(posicion, tablero) == false)
                  return false;
        return true;
    }
}
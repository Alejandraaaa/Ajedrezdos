public class PruebaAjedrez {
    private Tablero tablero;
    public PruebaAjedrez(){
        
    }
    
    public Tablero getTablero(){
        return tablero;
    }
    private final void colocarPiezas(){
      //   Poner las piezas negras
      
    Torre torreNegra1  = new Torre(false);
    Caballo caballoNegro1 = new Caballo(false);
    Alfil alfilNegro1 = new Alfil(false);
    Dama damaNegra= new Dama(false);
    Rey reyNegro = new Rey(false);
    Alfil alfilNegro2 = new Alfil(false);
    Caballo caballoNegro2 = new Caballo(false);
    Torre torreNegra2 = new Torre(false);
    
    
    tablero.getTablero()[0][0].setPieza(torreNegra1);
    tablero.getTablero()[0][1].setPieza(caballoNegro1);
    tablero.getTablero()[0][2].setPieza(alfilNegro1);
    tablero.getTablero()[0][3].setPieza(damaNegra);
    tablero.getTablero()[0][4].setPieza(reyNegro);
    tablero.getTablero()[0][5].setPieza(alfilNegro2);
    tablero.getTablero()[0][6].setPieza(caballoNegro2);
    tablero.getTablero()[0][7].setPieza(torreNegra2);
    for(int i=0; i<8; i++)
        tablero.getTablero()[1][i].setPieza(new Peon(false));  
    
    // Poner las piezas blancas
    
    Torre torreBlanca1  = new Torre(true);
    Caballo caballoBlanco1 = new Caballo(true);
    Alfil alfilBlanco1 = new Alfil(true);
    Dama damaBlanca = new Dama(true);
    Rey reyBlanco = new Rey(true);
    Alfil alfilBlanco2 = new Alfil(true);
    Caballo caballoBlanco2 = new Caballo(true);
    Torre torreBlanca2 = new Torre(true);
    
    tablero.getTablero()[7][0].setPieza(torreBlanca1);
    tablero.getTablero()[7][1].setPieza(caballoBlanco1);
    tablero.getTablero()[7][2].setPieza(alfilBlanco1);
    tablero.getTablero()[7][3].setPieza(damaBlanca);
    tablero.getTablero()[7][4].setPieza(reyBlanco);
    tablero.getTablero()[7][5].setPieza(alfilBlanco2);
    tablero.getTablero()[7][6].setPieza(caballoBlanco2);
    tablero.getTablero()[7][7].setPieza(torreBlanca2);
    for(int i=0; i<8; i++)
        tablero.getTablero()[6][i].setPieza(new Peon(true));
        }        
        public void moverPieza(Casilla actual, Casilla alTerminar) throws MovimientoIlegal{
         
            Pieza piezaUno = actual.getPieza();
            Pieza piezaFinal = alTerminar.getPieza();
            Posicion posicionActual = piezaUno.getPosicion();
            Posicion posicionDestino = piezaFinal.getPosicion();
        
            if(!piezaUno.mover(posicionDestino, tablero)){
                throw new MovimientoIlegal("Upsi, no puedes realizar este movimiento");
            } else {
                tablero.getTablero()[posicionActual.getX()][posicionActual.getY()].setPieza(null);
             
                tablero.getTablero()[posicionDestino.getX()][posicionDestino.getY()].setPieza(piezaUno);
            }
 }
        public boolean juegoEnJaque(boolean blanco){
            Rey rey = new Rey(blanco);
            
            for (int i=0; i<8; i++) {
                for(int j = 0; j<8; j++){
                    Pieza pieza = tablero.getTablero()[i][j].getPieza();
                    if( pieza instanceof Rey){
                        if (pieza.isEsBlanco() == blanco )
                            rey = (Rey) pieza;
                    }
                }
                
            }
              Posicion posicion = rey.getPosicion();
              boolean[][] piezasContrarias = rey.negros(tablero);  
              for(int i=0; i<8; i++){
                  for(int j=0; j<8; j++){
                      if(piezasContrarias[i][j]== true){
                         boolean[][] casillas = tablero.getTablero()[i][j].getPieza().casillasDisponibles(tablero);
                         if(casillas[posicion.getX()][posicion.getY()])
                             return true;
                      }
                  }
              }           
            return false;
        }
        
        public boolean jaque (Casilla actual, Casilla destino){
            Pieza piezaInicial = actual.getPieza();
            Pieza piezaFinal = destino.getPieza();
            Posicion inicial = piezaInicial.getPosicion();
            Posicion ultima = piezaFinal.getPosicion();
            boolean jaque = false;
           
       
            if(piezaInicial.mover(ultima, tablero)){
              
                   
                if (juegoEnJaque(piezaInicial.isEsBlanco()))
                     jaque = true;
                
                piezaInicial.setPosicion(inicial);
                piezaFinal.setPosicion(ultima);
                inicial.setPieza(piezaInicial);
                ultima.setPieza(piezaFinal);
                 
            }
        return true;
    }
}




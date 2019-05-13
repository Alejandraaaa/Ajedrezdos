public class PruebaAjedrez {
    private Tablero tablero;
    public PruebaAjedrez(){
    }

    public PruebaAjedrez(String jugada){
        tablero = new Tablero();

        switch(jugada){
            case "coronar":
                 tablero.getTablero() [6][6].setPieza(new Peon());            
                break;
                
            case "torre":
                 tablero.getTablero() [0][0].setPieza(new Torre());            
                break;
            case "rey":
                tablero.getTablero() [7][7].setPieza(new Rey());
                break;      
        }
    }
    
    public Tablero getTablero(){
        return tablero;
    }
    
    private final void colocarPiezas(){
      //   Poner las piezas negras
    Torre torreNegra1  = new Torre();
    Caballo caballoNegro1 = new Caballo();
    Alfil alfilNegro1 = new Alfil();
    Dama damaNegra= new Dama();
    Rey reyNegro = new Rey();
    Alfil alfilNegro2 = new Alfil();
    Caballo caballoNegro2 = new Caballo();
    Torre torreNegra2 = new Torre();
    tablero.getTablero()[0][0].setPieza(torreNegra1);
    tablero.getTablero()[0][1].setPieza(caballoNegro1);
    tablero.getTablero()[0][2].setPieza(alfilNegro1);
    tablero.getTablero()[0][3].setPieza(damaNegra);
    tablero.getTablero()[0][4].setPieza(reyNegro);
    tablero.getTablero()[0][5].setPieza(alfilNegro2);
    tablero.getTablero()[0][6].setPieza(caballoNegro2);
    tablero.getTablero()[0][7].setPieza(torreNegra2);
    for(int i=0; i<8; i++)
        tablero.getTablero()[1][i].setPieza(new Peon());  
    
    // Poner las piezas blancas
    Torre torreBlanca1  = new Torre();
    Caballo caballoBlanco1 = new Caballo();
    Alfil alfilBlanco1 = new Alfil();
    Dama damaBlanca = new Dama();
    Rey reyBlanco = new Rey();
    Alfil alfilBlanco2 = new Alfil();
    Caballo caballoBlanco2 = new Caballo();
    Torre torreBlanca2 = new Torre();
    tablero.getTablero()[7][0].setPieza(torreBlanca1);
    tablero.getTablero()[7][1].setPieza(caballoBlanco1);
    tablero.getTablero()[7][2].setPieza(alfilBlanco1);
    tablero.getTablero()[7][3].setPieza(damaBlanca);
    tablero.getTablero()[7][4].setPieza(reyBlanco);
    tablero.getTablero()[7][5].setPieza(alfilBlanco2);
    tablero.getTablero()[7][6].setPieza(caballoBlanco2);
    tablero.getTablero()[7][7].setPieza(torreBlanca2);
    for(int i=0; i<8; i++)
        tablero.getTablero()[6][i].setPieza(new Peon());
        }
        //setPosicion();
    
    
    public void Posiciones(){
        for ( int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                System.out.println(tablero.getTablero()[i][j].getPieza());
               
            }
        }        
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
                  
           
////                if(juegoEnJaque(!equipoEnTurno)){
////                    if(jaqueMate(!equipoEnTurno)){
////                    //GANA EQUIPOENTURNO
//                }
//                else {
//
//                    //avisar Jaque (NuevoEquipo EN Turno)
//                }
        
        
//        private void coronacion(Peon peon){
//            boolean equipo = peon.isEquipo();
//            int x = peon.getPosicion().getX();
//            int y = peon.getPosicion().getY();
//            if(equipo==false && y==7){
//                tablero.getCasillas()[x][y].setPieza(new Reina());
//                tablero.getCasillas() [x][y].getPieza().setEquipo(equipo);
//            }
//            if(equipo==true && y==0){
//                tablero.getCasillas()[x][y].setPieza(new Reina());
//                tablero.getCasillas() [x][y].getPieza().setEquipo(equipo);
//            }
//            tablero.getCasillas()[x][y].getPieza().getPosicion().setPosicion(x, y);
//        }
 }
        public boolean juegoEnJaque(boolean blanco){
            Rey rey = new Rey();
            
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
              boolean[][] piezasContrarias = rey.Negros(tablero);  
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
        
        public boolean jaqueMate (boolean blanco){
            Pieza piezaBlanca = new Peon();
            piezaBlanca.setEsBlanco(blanco);
            boolean jaqueMate = true;
            
            for (int i=0; i<8; i++) {
                for(int j = 0; j<8; j++){
                    Pieza pieza = tablero.getTablero()[i][j].getPieza();
                        if (pieza.isEsBlanco() == blanco)
                             piezaBlanca = pieza;
                }
                
            }
            boolean[][] piezasDelEquipo = piezaBlanca.piezasBlancas(tablero);
            for(int i=0; i<8; i++){
                for(int j=0; j<8; j++){
                    if(piezasDelEquipo[i][j]){
                        Casilla inicial = tablero.getTablero()[i][j];
                        boolean[][] verificarCasillas = inicial.getPieza().casillasDisponibles(tablero);
                        for(int a = 0; a < 8; a++){
                            for(int b = 0; b < 8; b++){
                                if(verificarCasillas[a][b]){
                                    Casilla reemplazada = tablero.getTablero()[a][b];
                                    if(!(jaque(inicial,reemplazada))){
                                        jaqueMate = false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return jaqueMate;
        }
}

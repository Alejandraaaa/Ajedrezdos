class Tablero { 
    private Casilla tablero[][];

    public Tablero() {
        Casilla tablero [][] = new Casilla[8][8];
        this.tablero = tablero;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = new Casilla();
            } 
         
        }
         // Poner las piezas negras
    tablero[0][0].ponerPieza(new Torre(false));
    tablero[0][2].ponerPieza(new Torre(false));
    tablero[0][3].ponerPieza(new Torre(false));
    tablero[0][4].ponerPieza(new Torre(false));
    tablero[0][5].ponerPieza(new Torre(false));
    tablero[0][6].ponerPieza(new Torre(false));
    tablero[0][7].ponerPieza(new Torre(false));
//    casillas [0][1].colocarPieza (piezasNegras [CD]);
//    casillas [0][2].colocarPieza (piezasNegras [AD]);
//    casillas [0][3].colocarPieza (piezasNegras [D]);
//    casillas [0][4].colocarPieza (piezasNegras [R]);
//    casillas [0][5].colocarPieza (piezasNegras [AR]);
//    casillas [0][6].colocarPieza (piezasNegras [CR]);
//    casillas [0][7].colocarPieza (piezasNegras [TR]);
//    for (int i=0; i<NUM_COLS; ++i)
//      casillas [1][i].colocarPieza (piezasNegras[8+i]);
// 
//    // Poner las piezas blancas
//    casillas [7][0].colocarPieza (piezasBlancas [TD]);
//    casillas [7][1].colocarPieza (piezasBlancas [CD]);
//    casillas [7][2].colocarPieza (piezasBlancas [AD]);
//    casillas [7][3].colocarPieza (piezasBlancas [D]);
//    casillas [7][4].colocarPieza (piezasBlancas [R]);
//    casillas [7][5].colocarPieza (piezasBlancas [AR]);
//    casillas [7][6].colocarPieza (piezasBlancas [CR]);
//    casillas [7][7].colocarPieza (piezasBlancas [TR]);
//    for (int i=0; i<NUM_COLS; ++i)
//      casillas [6][i].colocarPieza (piezasBlancas[8+i]);
//  }
        
    }
    
    @Override
    public String toString(){
        String tablero = "";//Creamos un valor cadena vacía. 
        for(int i = 0; i < this.tablero.length; i++){//Recorremos los valores de las filas.
            for(int j = 0; j < this.tablero[i].length; j++){//Recorremos los valores de las columnas. 
                Pieza piezaDelaCasilla = this.tablero[i][j].getPieza();
                tablero += piezaDelaCasilla.toString(); 
            }
            
            tablero += "\n"; //Con cada arreglo convertido en cadena damos un salto de linea. 
        }
        return tablero;
    }
}


class Tablero { 
    private Casilla tablero[][];

    public Tablero() {
        Casilla tablero [][] = new Casilla[8][8];
        this.tablero = tablero;     
    }
    public void ponerPiezas(){
    for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = new Casilla();
            }         
        }
         // Poner las piezas negras
    tablero[0][0].ponerPieza(new Torre(false,'T'));
    tablero[0][1].ponerPieza(new Caballo(false, 'C'));
    tablero[0][2].ponerPieza(new Alfil(false, 'A'));
    tablero[0][3].ponerPieza(new Dama(false, 'D'));
    tablero[0][4].ponerPieza(new Rey(false,'R'));
    tablero[0][5].ponerPieza(new Alfil(false, 'A'));
    tablero[0][6].ponerPieza(new Caballo(false, 'C'));
    tablero[0][7].ponerPieza(new Torre(false, 'T'));
    for(int i=0; i<8; i++)
        tablero[1][i].ponerPieza(new Peon(false, 'P'));  
    
    // Poner las piezas blancas
    tablero[7][0].ponerPieza(new Torre(true,'T'));
    tablero[7][1].ponerPieza(new Caballo(true, 'C'));
    tablero[7][2].ponerPieza(new Alfil(true, 'A'));
    tablero[7][3].ponerPieza(new Rey(true, 'R'));
    tablero[7][4].ponerPieza(new Dama(true,'D'));
    tablero[7][5].ponerPieza(new Alfil(true, 'A'));
    tablero[7][6].ponerPieza(new Caballo(true, 'C'));
    tablero[7][7].ponerPieza(new Torre(true, 'T'));
    for(int i=0; i<8; i++)
        tablero[6][i].ponerPieza(new Peon(true, 'P'));
    
    }
    public void voltearTablero(){
    
    }
    
    
    @Override
    public String toString(){
        String tablero = ""; 
        for(int i = 0; i < this.tablero.length; i++){
            for(int j = 0; j < this.tablero[i].length; j++){ 
                Pieza piezaDelaCasilla = this.tablero[i][j].getPieza();
                tablero += piezaDelaCasilla + "  "; 
            }
            
            tablero += "\n";
        }
        return tablero;
    }

    public Casilla[][] getTablero() {
        return tablero;
    }
    
}


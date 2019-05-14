//class Tablero { 
//    private Casilla tablero[][];
//
//    public Tablero() {
//        Casilla tablero [][] = new Casilla[8][8];
//        this.tablero = tablero;     
//    }
//    public void ponerPiezas(){
//    for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                tablero[i][j] = new Casilla();
//            }         
//        }
//         // Poner las piezas negras
//    Torre torreNegra1  = new Torre(false,"T1");
//    Caballo caballoNegro1 = new Caballo(false, "C1");
//    Alfil alfilNegro1 = new Alfil(false, "A1" );
//    Dama damaNegra= new Dama(false, "D");
//    Rey reyNegro = new Rey(false,"R");
//    Alfil alfilNegro2 = new Alfil(false, "A2");
//    Caballo caballoNegro2 = new Caballo(false, "C2");
//    Torre torreNegra2 = new Torre(false, "T2");
//    tablero[0][0].ponerPieza(torreNegra1);
//    tablero[0][1].ponerPieza(caballoNegro1);
//    tablero[0][2].ponerPieza(alfilNegro1);
//    tablero[0][3].ponerPieza(damaNegra);
//    tablero[0][4].ponerPieza(reyNegro);
//    tablero[0][5].ponerPieza(alfilNegro2);
//    tablero[0][6].ponerPieza(caballoNegro2);
//    tablero[0][7].ponerPieza(torreNegra2);
//    for(int i=0; i<8; i++)
//        tablero[1][i].ponerPieza(new Peon(false, "P"));  
//    
//    // Poner las piezas blancas
//    Torre torreBlanca1  = new Torre(false,"T1");
//    Caballo caballoBlanco1 = new Caballo(false, "C1");
//    Alfil alfilBlanco1 = new Alfil(false, "A1" );
//    Dama damaBlanca = new Dama(false, "D");
//    Rey reyBlanco = new Rey(false,"R");
//    Alfil alfilBlanco2 = new Alfil(false, "A2");
//    Caballo caballoBlanco2 = new Caballo(false, "C2");
//    Torre torreBlanca2 = new Torre(false, "T2");
//    tablero[7][0].ponerPieza(torreBlanca1);
//    tablero[7][1].ponerPieza(caballoBlanco1);
//    tablero[7][2].ponerPieza(alfilBlanco1);
//    tablero[7][3].ponerPieza(damaBlanca);
//    tablero[7][4].ponerPieza(reyBlanco);
//    tablero[7][5].ponerPieza(alfilBlanco2);
//    tablero[7][6].ponerPieza(caballoBlanco2);
//    tablero[7][7].ponerPieza(torreBlanca2);
//    for(int i=0; i<8; i++)
//        tablero[6][i].ponerPieza(new Peon(true, "P"));
//    
//    }
//    public void voltearTablero(){
//    
//    }
//    
//    
//    @Override
//    public String toString(){
//        String tablero = ""; 
//        for(int i = 0; i < this.tablero.length; i++){
//            for(int j = 0; j < this.tablero[i].length; j++){ 
//                Pieza piezaDelaCasilla = this.tablero[i][j].getPieza();
//                tablero += "["+ piezaDelaCasilla + " ] "; 
//            }
//            
//            tablero += "\n";
//        }
//        return tablero;
//    }
//
//    public Casilla[][] getTablero() {
//        return tablero;
//    }
//    
//}
//
public class Tablero {
    private Casilla[][] tablero;
    
    public Tablero(){
        this.tablero = new Casilla[8][8];
        for (int i=0; i<8; i++){
            for(int j=0;j<8;j++){
                this.tablero[i][j] = new Casilla();
            }
        }
        for (Casilla[] casillas : this.tablero) {
            for (Casilla casilla : casillas) {
                casilla.setPieza(null);
            }
        }
    }
    public void setCasillas(Casilla[][] casillas) {
        this.tablero = casillas;
    }

    public Casilla[][] getTablero() {
        return this.tablero;
    }
}

//Tablero
//-tablero : Casilla[][] 
//+Tablero(): void
//+setCasillas(int x): void
//+getTablero(): Casilla[][]
    
    

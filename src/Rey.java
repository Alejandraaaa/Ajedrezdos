public class Rey extends Pieza {

    public Rey(boolean blanco) {
        super(blanco);
    }

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

//    Caballo 
//
//<<Constructor>> Rey(esBlanco : boolean);
//+verificarCasillas(): booolean[][]
//+verificarMovimiento(Posicion posicionNueva, Tablero tablero): boolean


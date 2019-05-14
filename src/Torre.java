//public class Torre extends Pieza {
//    private Casilla casilla;
//    public Torre( boolean blanco, String nombre) {
//        super(blanco,nombre);  
//    }
//    
//    public void comer(){
//        
//    }
//    public void mover(Casilla[][] arreglo, Casilla casillaFinal) throws IllegalMovException {
//        int coordenadaInicial = this.conseguirMiCasilla(arreglo).conseguirX(arreglo);
//        int coordenadaInicialDos = this.conseguirMiCasilla(arreglo).conseguirY(arreglo);
//        int coordenadaFinal = casillaFinal.conseguirX(arreglo);
//        int coordenadaFinalDos = casillaFinal.conseguirY(arreglo);
//        if((coordenadaInicial == coordenadaFinal && coordenadaInicialDos != coordenadaFinalDos) || (coordenadaFinalDos == coordenadaFinalDos && coordenadaInicial != coordenadaFinal)){
//           this.conseguirMiCasilla(arreglo).moverPieza(casillaFinal);      
//        } 
//        else{
//            throw new IllegalMovException("Upsi, no puedes hacer esto");
//        }
//    }
//
//    @Override
//    public void verificarMovimiento(Posicion posicion) {
//      
//    }
//
//    
//}
public class Torre extends Pieza {

    public Torre(boolean blanco) {
        super(blanco);
    }

    @Override
    boolean[][] verificarCasillas() {
        boolean [][] casillas = new boolean [8][8];
        int x = this.getPosicion().getX();
        int y = this.getPosicion().getY();
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if (i == x || j == y )
                    casillas[i][j] = true;
                                
            }
        }
        casillas[x][y] = false;
        return casillas;
    }
    
    
    private boolean casillasVacias(Posicion posicionNueva, Tablero tablero) {
            int entrada1 = getPosicion().getX();
            int salida1 = getPosicion().getY();
            int entrada2 = posicionNueva.getX();
            int salida2 = posicionNueva.getY();
            int minX = Math.min(entrada1, entrada2);
            int maxX = Math.max(entrada1, entrada2);
            int minY = Math.min(salida1,salida2);
            int maxY = Math.max(salida1,salida2);
           
            if(entrada1 == entrada2)
                for(int i = minY + 1; i< maxY; i++)
                    if(tablero.getTablero()[entrada1][i].esVacia() == false)
                    return false;
                  
            if(salida1 == salida2)
                for(int i = minX + 1; i< maxX; i++)
                    if(tablero.getTablero()[i][salida1].esVacia() == false)
                       return false;
                   
           return true;
                   
    }
    
    
    
    @Override
    boolean verificarMovimiento(Posicion posicion, Tablero tablero){
        int entrada2 = posicion.getX();
        int salida2 = posicion.getY();
         
           
        if(verificarCasillas()[entrada2][salida2] == false)
           return false;
       
        else
            if (piezasBlancas(tablero)[entrada2][salida2])
                return false;
            else
            if (casillasVacias(posicion, tablero) == false)
                return false;
        return true;
    }
    
}
//Torre
//
//
//<<Constructor>> Torra(esBlanco : boolean);
//+verificarCasillas(): booolean[][]
//+casillasVacias(Posicion posicionNueva, Tablero tablero): boolean[][]
//+verificarMovimiento(Posicion posicionNueva, Tablero tablero) : boolean
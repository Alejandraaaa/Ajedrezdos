//public class Alfil extends Pieza{   
//    @Override
//    public boolean verificarMovimiento(Posicion posicion, Tablero tablero) {
//        Casilla[][] arreglo = tablero.getTablero();
//        int primerCoordenada = (this.conseguirMiCasilla(arreglo)).conseguirX(arreglo);
//        int primerCoordenadaFinal = (this.conseguirMiCasilla(arreglo)).conseguirY(arreglo);
//        int segundaCoordenadaFinal = posicion.getY();
//        boolean [][] casillaValida = new boolean [8][8];
//        for(int i = 0; i < arreglo.length; i++){
//            for(int j = 0; j < arreglo[i].length; j++){
//                if ((i-primerCoordenadaFinal == j-segundaCoordenadaFinal) || (i-segundaCoordenadaFinal == primerCoordenadaFinal-j) ){
//                    casillaValida[i][j] = true; 
//                }
//                else{
//                    casillaValida[primerCoordenadaFinal][segundaCoordenadaFinal] = false;
//                }
////        if(casillaValida[primerCoordenadaFinal][segundaCoordenadaFinal] == false){
////           return false;
////        }
////        else
//        if ((arreglo[primerCoordenadaFinal][segundaCoordenadaFinal].estaVacia() = false) && (arreglo[primerCoordenadaFinal][segundaCoordenadaFinal].isEsBlanco() != this.isEsBlanco()))
//            return false;
//        else
//           
//        return true;
//        }
//
//}
//
//    @Override
//    public String toString() {
//        return "Alfil{" + '}';
//    }
public class Alfil extends Pieza {

    @Override
    boolean[][] verificarCasillas(){
        boolean [][] posicionesPosibles = new boolean [8][8];
        int x = this.getPosicion().getX();//versilocambias aobtenerposicion y lo defines
        int y = this.getPosicion().getY();
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if (i-x == j-y|| i-x == y-j )
                    posicionesPosibles[i][j] = true;
                                
            }
        }
        posicionesPosibles[x][y] = false;
        return posicionesPosibles;
    }
    
    private boolean casillasVacias(Posicion posicionNueva, Tablero tablero) {
        Casilla[][] arreglo = tablero.getTablero();
           int coordenadaInicialUno = getPosicion().getX();
           int coordenadaFinalUno = getPosicion().getY();
           int coordenadaInicialDos = posicionNueva.getX();
           int coordenadaFinalDos = posicionNueva.getY();
           int minX = Math.min(coordenadaInicialUno, coordenadaInicialDos);
           int maxX = Math.max(coordenadaInicialUno, coordenadaInicialDos);
           int minY = Math.min(coordenadaFinalUno,coordenadaFinalDos);
           int maxY = Math.max(coordenadaFinalUno,coordenadaFinalDos);
           
           if((coordenadaInicialUno - coordenadaFinalUno) == (coordenadaFinalUno-coordenadaFinalDos))
               for(int i = minX + 1; i < maxX; i++)
                   if(arreglo[i][minY-minX + i].esVacia() == false)
                       return false;
                  
           if(coordenadaInicialUno - coordenadaInicialDos == coordenadaFinalDos - coordenadaInicialDos)
               for(int i = minX + 1; i < maxX; i++)
                   if(tablero.getTablero()[i][maxY + minY -i].esVacia() == false)
                       return false;
                   
           return true;
                   
    }    
    @Override
    boolean verificarMovimiento(Posicion posicionNueva, Tablero tablero){
           int coordenandaUnoI = getPosicion().getX();
           int coordenadaDosI = getPosicion().getY();
           int coordenadaUnoF = posicionNueva.getX();
           int coordenadaDosF = posicionNueva.getY();
         
           
       if(verificarCasillas()[coordenadaUnoF][coordenadaDosF] == false )
           return false;
       
       else
           if (piezasBlancas(tablero)[coordenadaUnoF][coordenadaDosF])
                return false;
           else
              if (casillasVacias(posicionNueva, tablero) == false)
                  return false;
        return true;
    }
}
//public class Caballo extends Pieza {
//    public Caballo( boolean blanco, String nombre) {
//        super(blanco,nombre);
//    }
//    @Override
//    public void mover() {
//        
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
//
public class Caballo extends Pieza {

    public Caballo(boolean blanco) {
        super(blanco);
    }

    @Override
    boolean[][] verificarCasillas() {
        boolean [][] arreglo = new boolean [8][8];
        int pimerEntrada = this.getPosicion().getX();
        int segundaEntrada = this.getPosicion().getY();
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if (i == pimerEntrada+2){
                    if(j == segundaEntrada+1 || j == segundaEntrada-1)
                        arreglo[i][j] = true;
                }   
                if (i == pimerEntrada+1){
                    if(j == segundaEntrada+2 || j == segundaEntrada-2)
                        arreglo[i][j] = true;
                }
                if (i == pimerEntrada-1){
                    if(j == segundaEntrada+2 || j == segundaEntrada-2)
                        arreglo[i][j] = true;
                }
                if (i == pimerEntrada-2){
                    if(j == segundaEntrada+1 || j == segundaEntrada-1)
                        arreglo[i][j] = true;
                }
            }
        }
        arreglo[pimerEntrada][segundaEntrada] = false;
        return arreglo;
    }
    
    @Override
   boolean verificarMovimiento(Posicion posicion, Tablero tablero){
           int primerEntradaFinal = posicion.getX();
           int segundaEntradaFinal = posicion.getY();
         
           
       if(verificarCasillas()[primerEntradaFinal][segundaEntradaFinal] == false)
           return false; //Revisar este movimiento
       else
           if (piezasBlancas(tablero)[primerEntradaFinal][segundaEntradaFinal] == this.piezasBlancas(tablero)[primerEntradaFinal][segundaEntradaFinal])
                return false;
        return true;
    }
     
}

//Caballo 
//
//<<Constructor>> Caballo(esBlanco : boolean);
//+verificarCasillas(): booolean[][]
//+casillasVacias(Posicion posicionNueva, Tablero tablero): boolean[][]
//+verificarMovimiento(Posicion posicionNueva, Tablero tablero): boolean

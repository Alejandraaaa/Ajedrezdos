//public abstract class Pieza {
//    /*private Casilla casilla;
//    private String nombre;*/
//    private boolean viva;
//    private boolean movLegal;
//    private boolean esBlanco;
//    private Posicion posicion;
//
//    
//    public Pieza(){  
//        this.esBlanco = true;
//    }
//    public Pieza( boolean esBlanco ){ 
//        this.esBlanco = esBlanco;
//        this. posicion = new Posicion(); //cómo podemos justificar ésto?
//    }
//    public boolean isEsBlanco() {
//        return esBlanco;
//    }
//    public void setEsBlanco(boolean blanco){
//        this.esBlanco = blanco;
//    }
//    public Posicion getPosicion(){
//        return this.posicion;
//    }
//    public void setPosicion(Posicion nuevaPosicion){
//        this.posicion = nuevaPosicion;   
//    }
//    abstract public boolean verificarMovimiento(Posicion posicion, Tablero tablero);
//    public boolean verificarCasilla; 
//  
////    public boolean MovLegal(Posicion posicion, Tablero tablero) {   
////        return movLegal;
////    }
//    public boolean[][] equipoBlanco(Tablero tablero){
//        Casilla[][] arreglo = tablero.getTablero();
//        boolean [][] piezasBlancas = new boolean [8][8];
//        for(int i = 0; i < arreglo.length; i++){
//            for(int j = 0; j < arreglo[i].length; j++){
//                if (arreglo[i][j].getPieza().isEsBlanco() == this.isEsBlanco()){
//                    piezasBlancas[i][j] = true;   
//                }
//            }
//        }
//        return piezasBlancas;
//    }
//    public boolean[][] equipoNegro(Tablero tablero){
//        Casilla[][] arreglo = tablero.getTablero();
//        boolean [][] piezasNegras = new boolean [8][8];
//        for(int i = 0; i < 8; i++){
//            for(int j = 0; j < 8; j++){
//                if (arreglo[i][j].getPieza().isEsBlanco() == false){
//                    piezasNegras[i][j] = true;
//                }
//            }
//        }
//        return piezasNegras;
//    }
//    public Casilla conseguirMiCasilla(Casilla[][] arreglo){//Revisar si conviene que sea arreglo o tablero
//        Casilla miCasilla = null;
//        for (int i = 0; i < arreglo.length; i++) {
//            for (int j = 0; j < arreglo[i].length; j++) {   
//                if (this == arreglo[i][j].getPieza()){ 
//                    miCasilla = arreglo[i][j];
//                }          
//            }
//        }
//        return miCasilla;
//        
//    }
//      public void moverPieza(Casilla casillaFinal){
//        casillaFinal.ponerPieza(this);
//    }
//  
// }
//  /*  public String toString(){
//    return " "+ nombre;
//  }*/
public abstract class Pieza {
    private Posicion posicion;
    private boolean esBlanco;

    public Pieza(){
        this(false);        
    }
    public Pieza(boolean blanco) {
        this.esBlanco = blanco;
        this.posicion = new Posicion();
    }
    
    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public boolean isEsBlanco() {
        return esBlanco;
    }

    public void setEsBlanco(boolean blanco) {
        this.esBlanco= esBlanco;
    }
    
   abstract boolean[][] verificarCasillas();
   abstract boolean verificarMovimiento(Posicion posicion, Tablero tablero);
   
   public boolean [][] piezasBlancas(Tablero tablero){
        boolean [][] blancas = new boolean [8][8];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if ((tablero.getTablero()[i][j].getPieza().isEsBlanco() == true))
                    blancas[i][j] = true;
            }    
        }
        return blancas;
    }
   
   public boolean[][] Negros(Tablero tablero){
        Casilla[][] arreglo = tablero.getTablero();//FaltaImplementar porque Tablero no es atributo de casillas
        boolean [][] negras = new boolean [8][8];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if (arreglo[i][j].getPieza().isEsBlanco() == false){
                    negras[i][j] = true;
                }
            }
        }
        return negras; 
   }
    public boolean[][] casillasDisponibles(Tablero tablero){
        Casilla[][] arreglo = tablero.getTablero();
        boolean [][] casillas = new boolean [8][8]; 
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if ((verificarMovimiento(arreglo[i][j].getPieza().getPosicion(), tablero)) == true);
                    casillas[i][j] = true;                
            }
        } 
        
//        for (int j = 7; j>=0; j--) {
//            for (int i = 0; i<8; i++) {
//                if(movimientosPosibles[i][j]){
//                    System.out.print("|("+i+","+j+")|");
//                    continue;
//                }
//                System.out.print("| |");
//            }
//            System.out.println("");
//        }
//   
        return casillas;
    }
    
   
   public boolean mover(Posicion posicionFinal, Tablero tablero){
       if(casillasDisponibles(tablero)[posicionFinal.getX()][posicionFinal.getY()]){
           this.posicion.setX(posicionFinal.getX());
           this.posicion.setY(posicionFinal.getY());
           return true;
       }
       return false;
   }
//   public void imprimirPosicionesPosibles(){
//       boolean [][] posicionesPosibles = posicionesPosibles();
//                      
//       for (int j = 7; j>=0; j--) {
//           for (int i = 0; i<8; i++) {
//               if(posicionesPosibles[i][j]){
//                   System.out.print("|("+i+","+j+")|");
//                   continue;
//               }
//               System.out.print("| |");
//           }
//           System.out.println("");
//       }
//   }

    }



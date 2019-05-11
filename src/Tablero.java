class Tablero { 
    private Casilla tablero[][];

    public Tablero() {
        Casilla tablero [][] = new Casilla[8][8];
        this.tablero = tablero;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = new Casilla(new Posicion(i,j));
                        }
        
        }
    }
//    @Override
//    public String toString(){
//        String tablero = "";//Creamos un valor cadena vacía. 
//        for(int i = 0; i < this.tablero.length; i++){//Recorremos los valores de las filas.
//            for(int j = 0; j < this.tablero[i].length; j++){//Recorremos los valores de las columnas. 
//                
//                tablero += ;//Convertimos los valores detro del arreglo en cadena. 
//            }
//            
//            tablero += "\n"; //Con cada arreglo convertido en cadena damos un salto de linea. 
//        }
//        return tablero;
    }


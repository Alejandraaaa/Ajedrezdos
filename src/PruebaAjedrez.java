public class PruebaAjedrez {
    public static void main(String[] args){
    Tablero tablero = new Tablero();
    tablero.ponerPiezas();
        
     Casilla tablero2[][] = tablero.getTablero();
     tablero2[0][5].moverPieza(tablero2[5][5]);
     System.out.println(tablero);
    }
    
    
}

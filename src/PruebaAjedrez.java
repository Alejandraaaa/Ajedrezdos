public class PruebaAjedrez {
    public static void main(String[] args) throws IllegalMovException{
    Tablero tablero = new Tablero();
    tablero.ponerPiezas();
        
     Casilla tablero2[][] = tablero.getTablero();

      Torre torre = ((Torre)tablero2[0][0].getPieza());
      torre.mover(tablero2, tablero2[4][0]);

     System.out.println(tablero);
    }
    
    
}

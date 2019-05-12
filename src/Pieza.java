public abstract class Pieza {
    private Casilla casilla;
    private boolean esBlanco;
    private boolean movLegal;
    private char nombre;
    private boolean viva;
    public Pieza( boolean blanco, char nombre){
        this.esBlanco = blanco;
        this.nombre = nombre;
    }
    abstract public void mover();  
    abstract public void verificarMovimiento(Posicion posicion);
    public void comer(Casilla casilla){
        
        
    }
    public boolean isEsBlanco() {
        return esBlanco;
    }

    public boolean isMovLegal() {
        return movLegal;
    }

    public char getNombre() {
        return nombre;
    }

    public boolean isViva() {
        return viva;
    }
    public Casilla conseguirMiCasilla(Casilla[][] arreglo){//Revisar si conviene que sea arreglo o tablero
        Casilla miCasilla = null;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {   
                if (this == arreglo[i][j].getPieza()){ 
                    miCasilla = arreglo[i][j];
                }          
            }
        }
        return miCasilla;
        
    }
    public String toString(){
    return " "+ nombre;
    }
}
    


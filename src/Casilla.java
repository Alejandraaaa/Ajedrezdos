//public class Casilla {
//    private Pieza pieza;
//    //private Posicion posicion;
//    private boolean esVacia;
//    public Casilla() {
//        
//    }
//    public Pieza getPieza() {
//        return pieza;
//    }
//    public void setPieza(Pieza pieza) {
//        this.pieza = pieza;
//    }
//
//    public boolean isEsVacia() {
//        return esVacia;
//    }
//    public boolean estaVacia(){
//        if(this.pieza != null){
//            esVacia = false;
//        }
//        else{
//            esVacia = true;
//        }
//        return esVacia;
//    }
//    public int conseguirX(Casilla [][] arreglo) {
//        int y =0;
//        for (int i = 0; i < arreglo.length; i++) {
//            for (int j = 0; j < arreglo[i].length; j++) {   
//                if (this == arreglo[i][j])
//                y = j;                           
//            }
//        }
//        return y;
//    }
//    public int conseguirY(Casilla[][] arreglo) {
//        int x = 0;
//        for (int i = 0; i < arreglo.length; i++) {
//            for (Casilla casilla : arreglo[i]) {
//                if (this == casilla) 
//                x = i;
//            }
//        }
//        return x;
//    }
//    
//    public void ponerPieza(Pieza pieza){   
//        this.pieza = pieza;
//    }
//
//    public String toString(){
//        String pieza = "";
//           pieza = "[" + this.pieza + " ] ";
//        return pieza;
//    }
//}
public class Casilla{
    private Pieza pieza;
    
    public Casilla(){
        this.pieza = null;//Pensar en crear una clase para las casillas vacias
    }
//    public boolean isColor() {
//        return color;
//    }
//
//    public void setColor(boolean color) {
//        this.color = color;
//    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }
    public boolean esVacia() {
    boolean esVacia = true;
    if(this.pieza != null){
            esVacia = false;
        }
        else{
            esVacia = true;
        }
        return esVacia;
    }
}
    
    



/**
 FECHA JUEVES 4 DE JULIO DEL 2019
 *INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 * NOMBRE : BRYAN GONZALEZ 
 * NOMBRE DE PROGRAMA : SERIE FIBONACI
 * MATERIA : PROGRAMACION VISUAL
 * NIVEL : CUARTO DE SISTEMAS NOCTURNO
 */



public class Operaciones {
    
    private  int numero;

    public Operaciones(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
   public void proceso(int numero){
       int x=0,y=1,z=1;
       System.out.println("1");
       for (int i = 1; i <numero; i++) {    
           z=x+y;
           System.out.println(""+z);
           x=y;
           y=z;
           
       }
   }
}
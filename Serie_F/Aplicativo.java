
/**
 FECHA JUEVES 4 DE JULIO DEL 2019
 *INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 * NOMBRE : BRYAN GONZALEZ 
 * NOMBRE DE PROGRAMA : SERIE FIBONACI
 * MATERIA : PROGRAMACION VISUAL
 * NIVEL : CUARTO DE SISTEMAS NOCTURNO
 */



import java.util.Scanner;


public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
      int numero=0,valor;
        Operaciones obj1 = new Operaciones(numero);
          
        do{
           
        System.out.println("Diguite un numero : ");
        numero=entrada.nextInt();
            }while(numero<=0);
      
      valor=obj1.getNumero();
        obj1.proceso(numero); 
    }
}
/**
 La nota final del curso de Desarrollo de aplicaciones móviles está dividido 
en 5 partes: Quices y seguimiento 20%, Prácticas de laboratorio 30%, 
Exposiciones 10%, Proyecto I 15% y Proyecto Final el 25%, desarrolle
un programa en java que permita calcular la nota final de un estudiante del
curso. Después de calcular la nota final el programa imprimirá lo siguiente 
dependiendo de la nota: 
a. Si la nota está entre 0 y 1 imprime “Estas en el lugar equivocado” 
b. Si la nota está entre 1.1 y 2 imprime “Remal”
c. Si la nota está entre 2.1 y 3 imprime “Es posible recuperarse” 
d. Si la nota está entre 3.1 y 4 imprime “Normalito” 
e. Si la nota está entre 4.1 y 4.5 imprime “Muy Bien” 
f. Si la nota está entre 4.6 y 5 imprime “Excelente estudiante”



/**
 *
 * @author Nestor
 */
package punto5;
import java.util.Scanner;

public class Punto5 {

    private Scanner teclado;
    private String nombre;
    private double quices, lab, exposicion,proy1, proyf,def;
    
    public void inicio(){
        teclado = new Scanner(System.in);
        System.out.println("ingrese el nombre del estudiante: ");
        nombre=teclado.next();
        System.out.println("ingrese la nota de los quices: ");
        quices=teclado.nextDouble();
        System.out.println("ingrese la nota del laboratorio: ");
        lab=teclado.nextDouble();
        System.out.println("ingrese la nota de la exposición: ");
        exposicion=teclado.nextDouble();
        System.out.println("ingrese la nota del proyecto 1: ");
        proy1=teclado.nextDouble();
        System.out.println("ingrese la nota del proyecto final: ");
        proyf=teclado.nextDouble();
        
        
    }
    
    public void nota(){
    def=quices*0.2+lab*0.3+exposicion*0.1+proy1*0.15+proyf*0.25;   
    }
    public void mensaje(){
    if (def<=1){
    System.out.println(nombre+" estas en el lugar equivocado"+" tu nota definitiva es "+def);
    }
    if(def>1 && def<=2){
        System.out.println(nombre+" remal"+" tu nota definitiva es "+def);
    }
    if(def>2 && def<=3){
        System.out.println(nombre+" es posible recuperarse"+" tu nota definitiva es "+def);
    }
    if(def>3 && def<=4){
    System.out.println(nombre+" normalito"+" tu nota definitiva es "+def);
    }
    if(def>4 && def<=4.5){
    System.out.println(nombre+" muy bien"+" tu nota definitiva es "+def);
    }
    if(def>4.5 && def<=5){
        System.out.println(nombre+" excelente estudiante"+" tu nota definitiva es "+def);
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto5 definitiva = new Punto5();
        definitiva.inicio();
        definitiva.nota();
        definitiva.mensaje();
    }
    
}

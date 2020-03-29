
package Calculadora;


public class Calculadora {public static void main(String [] args){
    Suma s = new Suma(7,10);
    Resta r = new Resta(8,9);
    Multiplicacion m = new Multiplicacion(50,10);
    Divicion d = new Divicion(50,5);
    
    s.sumar();
    r.restar();
    m.multiplicacion();
    d.divicion();
          
    
    
}   
}

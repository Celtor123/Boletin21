
package boletin21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Boletin21 {
ArrayList <Palabra> palabras;
Scanner a = new Scanner(System.in);
int y;
String g;
   

    public Boletin21() {
        this.palabras = new ArrayList<>();
    }
    public void lectura(){
        while(y<6){
        g= a.next();
        palabras.add(new Palabra(g));
        y++;
        }
    }
     public void ingresar(){
//         Iterator i= palabras.iterator();
//          palabras.forEach((i.hasNext()) -> {
//              i.next();
//              System.out.println(i);
//            });
        
     }
      
    

    public static void main(String[] args) {
         Boletin21 a=new  Boletin21();
         a.lectura();
       a.ingresar();
    }  
}
//1- Codifica un programa  que :
//*  lea unha lista de palabras dende o teclado.
//* Ordene alfabéticamente estas palabras.
//* Escriba o resultado nun ficheiro de texto de xeito que, cada palabra estea nunha liña e éstas esten numeradas 
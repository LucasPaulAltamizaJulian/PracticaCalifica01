/*5.- Crear un arreglo, que nos pida ingresar una palabra, para mostrarlo letra por
letra y la suma de sus caracteres.
 */

package pc1;

import java.util.*;
public class E5 {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        int c=0; System.out.println("Escriba una palabra");
        String palabra=dato.nextLine();
        char caracteres[]=new char[palabra.length()];
        for(int i=0;i<palabra.length();i++){
            c=c+1;
            caracteres[i]=palabra.charAt(i); System.out.println(caracteres[i]);
        }
        System.out.println("la cantidad de caracteres es : "+c);
    }
}

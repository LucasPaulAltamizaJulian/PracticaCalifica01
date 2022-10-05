/*9.- En un certamen de atletismo se desea implementar un control para almacenar
el tiempo de cada corredor y además determinar por los datos obtenidos en los
tiempos de los orredores cual es el ganador. Se debe especificar cuantos
atletas van a participar
 */

package pc1;

import java.util.*; 

public class E9 {
    public static void main(String []args){
        Scanner dato = new Scanner(System.in);
        int c=0; int a; float m =0;
        System.out.println("Ingresarantidad de atletas");
        c = dato.nextInt(); String atleta[] = new String[c];
        float tiempo[] = new float[c];
        for( a=0;a<c;a++){
            System.out.println("Ingreseombre del atleta");
            atleta[a] = dato.next();
            System.out.println("Ingreseiempo del recorrido");
            tiempo[a] = dato.nextFloat();
        }
        for (int i = 1; i < tiempo.length; i++) {
            if (m > tiempo[i]) { m = tiempo[i];
            }else{
                m = tiempo[i];
                System.out.println("Eldor es el atleta con el tiempo "+m); }
        }
    } }
//</editor-fold>

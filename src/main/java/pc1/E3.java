/*3.-Mostrar el promedio de notas de tres cursos
 */

package pc1;

public class E3 {

    //<editor-fold defaultstate="collapsed" desc="comment">
    public static void main(String args[]) {
        String cursos []={"Diseño", "Estadistica","Ingles"};
        int practicas []={14,17,11};
        System.out.println("Promedio de Cursos");
        System.out.println("CURSO NOTA");
        System.out.println("------ ----- ");
        int pp=(practicas[0]+practicas[1]+practicas[2])/3;
        for (int s=0;s<cursos.length;s++){
            System.out.println(cursos[s] + " "+practicas[s]); } System.out.println("Su Promedio es : " +pp);
         }
}

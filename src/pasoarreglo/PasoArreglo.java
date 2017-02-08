/*
Paso de arreglos y elementos individuales de un arreglo a los mètodos
 */
package pasoarreglo;

/**
 *
 * @author carlosjoseanguiano
 */
public class PasoArreglo {

    public static void main(String[] args) {

        int[] arreglo = {1, 2, 3, 4, 5};

        System.out.println("Efectos de pasar una referencia a un arreglo completo\n"
                + "Los valores del arreglo original son : ");

        //Imprime los elementos originales del arreglo
        for (int valor : arreglo) {
            System.out.printf("%d ", valor);
        }
        modificarArreglo(arreglo);//Pasa la referencia del arreglo
        System.out.println("\n\nLos elementos del arreglo modificado son: ");

        //Imprime los elementos modificados del arreglo
        for (int valor : arreglo) {
            System.out.printf(" %d", valor);
        }
        System.out.printf("\n\nEfectos de pasar el valor de un elemento del arreglo : \n"
                + "arreglo[3] antes de modificar %d\n ", arreglo[3]);

        modificarElemento(arreglo[3]);
        System.out.printf("arreglo[3] despues de modificarElemento : %d\n", arreglo[3]);
    }

    //Multiplica cada elemento de un arreglo por 2
    public static void modificarArreglo(int[] arreglo2) {
        for (int i = 0; i < arreglo2.length; i++) {
            arreglo2[i] *= 2;
        }
    }

    //Multiplica el elemento por 2
    public static void modificarElemento(int elemento) {

        elemento *= 2;
        System.out.printf("Valor del elemento en modificarElemento :%d\n", elemento);
    }
}

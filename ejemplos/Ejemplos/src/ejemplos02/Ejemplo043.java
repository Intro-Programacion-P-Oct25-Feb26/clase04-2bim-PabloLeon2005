/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo043 {

    public static void main(String[] args) {
        // 
        int[] valores1 = {10, 100, 1000, 20, 200, 2000};
        int[] valores2 = {1000, 1001, 1002, 1003, 1004, 1005};
        for (int i = 0; i < valores1.length; i++) {

            int v1 = valores1[i];
            int v2 = valores2[i];
        obtenerSuma(v1, v2); // se invoca al método (procedimiento) obtenerSuma

        }
         /*
        En el código tenemos dos arreglos, cada uno con valores distintos, lo que
        buscamos es sumar cada posición igual (la posicion 0 del primero con
        la posición 0 del segundo y así sucecivamente), para eso usamos un ciclo 
        repetitivo en el cual declaramos dos variables, cada una en cada repetición
        del ciclo toman el valor de la posición del arreglo, pues al arreglo le 
        añadimos un +1 para que vaya pasando por cada posición del arreglo hasta
        llegar al ultimo (esto con uso del .lenght) luego que las variables toman 
        el valor correspondiente llaman a un procedimiento que agarra los argumentos
        enviados y los suma, para después de eso, imprimir el mensaje con el
        valor que nos dio por total
        
        */
        
    }

    public static void obtenerSuma(int a, int b) {
        int suma;
        suma = a + b;
        System.out.printf("El valor de la suma es: %d\n", suma);

    }

}

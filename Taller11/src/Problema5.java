/***
 * Problema 05
Generar las funciones/métodos que devuelvan las suma, resta y multiplicación de un arreglo bidimensional cuadrado; 
* mismo que se lo recibe como parámetro.
* @author Cristhian Quizhpe
 */
import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] suma, resta, producto;
        System.out.print("Ingrese el tamaño de la Matriz cuadrada: ");
        int n = input.nextInt();

        int[][] matriz1 = new int[n][n];
        int[][] matriz2 = new int[n][n];
        

        generarMatriz(matriz1);
        generarMatriz(matriz2);

        presentaMatriz(matriz1, "Matriz 1");
        presentaMatriz(matriz2, "Matriz 2");

        System.out.println("Menu de Operaciones:");
        System.out.println("1.- Suma de matrices");
        System.out.println("2.- Resta de matrices");
        System.out.println("3.- Multiplicacion de matrices");
        System.out.println("4.- Salir");

        int opcion;
        do {
            System.out.print("Seleccione una opcion: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    suma = sumaMatriz(matriz1, matriz2);
                    System.out.println("Resultado de la suma:");
                    presentaMatriz(suma, "Suma");
                    break;

                case 2:
                    resta = restaMatriz(matriz1, matriz2);
                    System.out.println("Resultado de la resta:");
                    presentaMatriz(resta, "Resta");
                    break;

                case 3:
                    producto = multiplicacionMatriz(matriz1, matriz2);
                    System.out.println("Resultado de la multiplicacion:");
                    presentaMatriz(producto, "Multiplicacion");
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 4);

        input.close();
    }

    public static void generarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10); 
            }
        }
    }

    public static void presentaMatriz(int[][] matriz, String titulo) {
        System.out.println(titulo + ":");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] sumaMatriz(int[][] matriz1, int[][] matriz2) {
        int n = matriz1.length;
        int[][] suma = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return suma;
    }

    public static int[][] restaMatriz(int[][] matriz1, int[][] matriz2) {
        int n = matriz1.length;
        int[][] resta = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resta[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        return resta;
    }

    public static int[][] multiplicacionMatriz(int[][] matriz1, int[][] matriz2) {
        int n = matriz1.length;
        int[][] producto = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    producto[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return producto;
    }
}
/***
 * run:
Ingrese el tama�o de la Matriz cuadrada: 4
Matriz 1:
8	2	2	3	
5	7	3	0	
0	8	9	5	
8	3	5	8	
Matriz 2:
2	2	0	8	
1	8	6	3	
9	8	5	0	
4	8	9	9	
Menu de Operaciones:
1.- Suma de matrices
2.- Resta de matrices
3.- Multiplicacion de matrices
4.- Salir
Seleccione una opcion: 1
Resultado de la suma:
Suma:
10	4	2	11	
6	15	9	3	
9	16	14	5	
12	11	14	17	
Seleccione una opcion: 2
Resultado de la resta:
Resta:
6	0	2	-5	
4	-1	-3	-3	
-9	0	4	5	
4	-5	-4	-1	
Seleccione una opcion: 3
Resultado de la multiplicacion:
Multiplicacion:
48	72	49	97	
44	90	57	61	
109	176	138	69	
96	144	115	145	
Seleccione una opcion: 4
Saliendo...
BUILD SUCCESSFUL (total time: 26 seconds)
 */
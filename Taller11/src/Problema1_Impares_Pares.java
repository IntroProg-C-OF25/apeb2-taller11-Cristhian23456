
/**
 * Problema 01
Generar los procedimientos y/o funciones que impriman los valor pares, impares y el promedio de un arreglo bidimensional.
* El (los) procedimiento(s) o método(s) deben ser invocados desde el método principal (quien es el único responsable 
* de gestionar las entradas/salidas); además el método debe recibir como parámetro un arreglo bidimensional.
@author Cristhian Quizhpe
 */
import java.util.Scanner;

public class Problema1_Impares_Pares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limFila, limColumna;
        
        System.out.print("Ingrese el limite de filas: ");
        limFila = input.nextInt();
        System.out.print("Ingrese el limite de columnas: ");
        limColumna = input.nextInt();
        
        int[][] matriz = new int[limFila][limColumna];
        
        generarMatriz(matriz);
        presentaMatriz(matriz);
        paresImparesMatriz(matriz);
        promedioMatriz(matriz);
    }

    public static void generarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void presentaMatriz(int[][] matriz) {
        System.out.println("Matriz Completa:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void paresImparesMatriz(int[][] matriz) {
        System.out.println("\nElementos Pares:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print((matriz[i][j] % 2 == 0) ? matriz[i][j] + "\t" : "");
            }
            System.out.println();
        }
        
        System.out.println("\nElementos Impares:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print((matriz[i][j] % 2 != 0) ? matriz[i][j] + "\t" : "");
            }
            System.out.println();
        }
    }

    public static void promedioMatriz(int[][] matriz) {
        int suma = 0;
        double promedio;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        promedio = (double) suma / (matriz.length * matriz[0].length);
        System.out.printf("\nPromedio de los elementos de la matriz: %.2f\n", promedio);

    }
}


/***
 * run:
Ingrese el limite de filas: 3
Ingrese el limite de columnas: 4
Matriz Completa:
5	7	4	8	
6	9	3	7	
0	9	7	6	

Elementos Pares:
4	8	
6	
0	6	

Elementos Impares:
5	7	
9	3	7	
9	7	

Promedio de los elementos de la matriz: 5,92
BUILD SUCCESSFUL (total time: 3 seconds)
 */
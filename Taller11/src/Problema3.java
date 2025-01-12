/**
 *Problema 03
Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio cualitativo de los parámetros. 
* Si el promedio es: De 0 a 5 el promedio cualitativo es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 
* el promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente. A la función se la debe llamar desde un 
* método principal. Los parámetros necesarios para llamar a la función, deben ser ingresados solicitados al usuario.
 * @author Cristhian Quizhpe
 */
import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, nota4;
        String promedioCualitativo;

        System.out.print("Ingrese 4 notas:");
        nota1 = input.nextDouble();
        nota2 = input.nextDouble();
        nota3 = input.nextDouble();
        nota4 = input.nextDouble();

        promedioCualitativo = obtenerPromedioCualitativo(nota1, nota2, nota3, nota4);
        System.out.println("El promedio cualitativo es: " + promedioCualitativo);
    }

    public static String obtenerPromedioCualitativo(double n1, double n2, double n3, double n4) {
        double promedio = (n1 + n2 + n3 + n4) / 4;

        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else if (promedio > 5 && promedio <= 8) {
            return "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            return "Muy Bueno";
        } else if (promedio > 9 && promedio <= 10) {
            return "Sobresaliente";
        } else {
            return "Promedio no válido";
        }
    }
}

/***
 * Ingrese 4 notas:3 4 7 8
El promedio cualitativo es: Bueno
BUILD SUCCESSFUL (total time: 8 seconds)
 */
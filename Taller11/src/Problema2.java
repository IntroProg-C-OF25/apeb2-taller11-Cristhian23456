/**
 * Generar una solución que implemente 3 procedimientos. Que permitan calcular el área de un cuadrado, 
 * área de un triángulo y área de un rectángulo. Cada procedimiento/función debe recibir los datos necesarios 
 * y generar el valor correspondiente. Se debe invocar a los procedimientos desde un método principal; 
 * Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado; 2 se llama al procedimiento 
 * obtenerAreaTriangulo; 3 se llama al procedimiento obtenerAreaCuadrado.
El área del cuadrado es igual a lado x lado x lado x lado
El área del triángulo es igual a (base x altura)/2
El área del rectángulo es igual a base x altura
 * @author Cristhian Quizhpe
 */
import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char opc;
        double altri = 0, basetri = 0;
        double altRect = 0, baseRect = 0;
        double lado = 0;

        System.out.println("Menu:");
        System.out.println("1.- Area Cuadrado");
        System.out.println("2.- Area Triangulo");
        System.out.println("3.- Area Rectangulo");
        System.out.print("Ingrese una opcion: ");
        opc = input.next().charAt(0);

        switch (opc) {
            case '1': 
                System.out.println("Area de un Cuadrado");
                System.out.print("Ingrese el lado del cuadrado: ");
                lado = input.nextDouble();
                System.out.println("El area del cuadrado es: " + areaCuadrado(lado));
                break;

            case '2': 
                System.out.println("Area de un Triangulo");
                System.out.print("Ingrese la altura (h): ");
                altri = input.nextDouble();
                System.out.print("Ingrese la base (b): ");
                basetri = input.nextDouble();
                System.out.println("El area del triangulo es: " + areaTriangulo(basetri, altri));
                break;

            case '3': 
                System.out.println("Área de un Rectangulo");
                System.out.print("Ingrese la altura (h): ");
                altRect = input.nextDouble();
                System.out.print("Ingrese la base (b): ");
                baseRect = input.nextDouble();
                System.out.println("El area del rectangulo es: " + areaRectangulo(baseRect, altRect));
                break;

            default:
                System.out.println("Opción no valida. Por favor, seleccione una opcion valida.");
                break;
        }
    }

    public static double areaCuadrado(double lado) {
        return lado * lado; 
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2; 
    }

    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }
}
/***
 * run:
Menu:
1.- Area Cuadrado
2.- Area Triangulo
3.- Area Rectangulo
Ingrese una opcion: 1
Area de un Cuadrado
Ingrese el lado del cuadrado: 4
El area del cuadrado es: 16.0
BUILD SUCCESSFUL (total time: 9 seconds)
 */

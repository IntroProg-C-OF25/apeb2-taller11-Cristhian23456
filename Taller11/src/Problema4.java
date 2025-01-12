/***
 * Problema 04
Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular el valor del predio de un bien inmueble. Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, cédula del cliente).
En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio y el número de kilowatios del mes. Y se genera en pantalla el siguiente reporte: Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10

En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener el valor del predio se saca el 2% del valor del inmueble. Y se genera el siguiente reporte:

Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que pagar de predio $ 600.

En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz; 2 se llama al procedimiento calcularPredio. Los datos que se necesita en cada procedimiento se los debe ingresar por teclado.
* @author Cristhian Quizhpe
 */
import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;  
        String nombre, cedula;
        double valorKW, kilovatios, valorInmueble;

        do {
            System.out.println("Menu:");
            System.out.println("1.- Calcular valor de la planilla de luz");
            System.out.println("2.- Calcular predio de un bien inmueble");
            System.out.println("3.- Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = input.nextInt();  
            input.nextLine();  

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del cliente:");
                    nombre = input.nextLine(); 
                    System.out.println("Ingrese la cedula del cliente:");
                    cedula = input.nextLine();  
                    System.out.println("Ingrese el valor del kilovatio:");
                    valorKW = input.nextDouble();  
                    System.out.println("Ingrese el numero de kilovatios consumidos:");
                    kilovatios = input.nextDouble(); 
                    input.nextLine();  
                    calcularValorLuz(nombre, cedula, valorKW, kilovatios);
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del cliente:");
                    nombre = input.nextLine();  
                    System.out.println("Ingrese la cedula del cliente:");
                    cedula = input.nextLine();  
                    System.out.println("Ingrese el valor del inmueble:");
                    valorInmueble = input.nextDouble(); 
                    input.nextLine(); 
                    calcularPredio(nombre, cedula, valorInmueble);
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 3);

    }

    public static void calcularValorLuz(String nombre, String cedula, double valorKW, double kilovatios) {
        double total = valorKW * kilovatios;
        System.out.println("Cliente " + nombre + " con cedula " + cedula + " debe cancelar el valor de $" + total);
    }

    public static void calcularPredio(String nombre, String cedula, double valorInmueble) {
        double predio = valorInmueble * 0.02;
        System.out.println("Cliente " + nombre + " con cedula " + cedula + " tiene un bien inmueble valorado en $" +
                valorInmueble + " y debe pagar de predio $" + predio);
    }
}

/***
 * run:
Menu:
1.- Calcular valor de la planilla de luz
2.- Calcular predio de un bien inmueble
3.- Salir
Seleccione una opcion: 1
Ingrese el nombre del cliente:
Ana 
Ingrese la cedula del cliente:
1234567
Ingrese el valor del kilovatio:
3,5
Ingrese el numero de kilovatios consumidos:
23
Cliente Ana  con cedula 1234567 debe cancelar el valor de $80.5
Menu:
1.- Calcular valor de la planilla de luz
2.- Calcular predio de un bien inmueble
3.- Salir
Seleccione una opcion: 2
Ingrese el nombre del cliente:
Karen
Ingrese la cedula del cliente:
2345678
Ingrese el valor del inmueble:
7000
Cliente Karen con cedula 2345678 tiene un bien inmueble valorado en $7000.0 y debe pagar de predio $140.0
Menu:
1.- Calcular valor de la planilla de luz
2.- Calcular predio de un bien inmueble
3.- Salir
Seleccione una opcion: 3
Saliendo...
BUILD SUCCESSFUL (total time: 50 seconds)
 */





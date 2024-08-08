import java.util.Scanner; //Permite leer entradas.

/**
 * Clase Calculotiempo: encargada de encontrar el tiempo que tarda una persona
 * en bicicleta en moverse de una ciudad a otra, esto utilizando km/h.
 * @author Sol Martínez
 * @since 02/08/2024
 * */

public class Calculotiempo {
    
    /**
     * Método principal de la clase encargada de procesar la obtención del tiempo 
     * que tarda una persona en viajar de una ciudad a otra en bicicleta.
     * @param args listado de valores
     */
    
     public static void main (String [] args){  
        Scanner scan = new Scanner(System.in); // método con el cual se pueden leer las entradas.

        //Ingreso de la distancia entre las dos cidades y la velocidad constante de la bicicleta.

        System.out.print("Ingrese la distancia entre las dos ciudades (en km)");
        double distancia = scan.nextDouble();
        System.out.print("Ingrese la velocidad constante de la bicicleta (en km/h)");
        double velocidad = scan.nextDouble();

        /*Declaración de variables que contienen los procesos para poder calcular el tiempo del viaje*/

        double tiempo = distancia/ velocidad;

        //Mostrar resultados.

        System.out.print("El tiempo que tardará la persona en llegar a su destino será de = ");
        System.out.println(velocidad);
        System.out.print("horas");
        scan.close();
    }
}

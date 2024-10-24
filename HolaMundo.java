import java.util.Scanner;

/**
 * HolaMundo
 */
public class HolaMundo {

    public static void main(String[] args) {
        //Imprimir datos en pantalla / consola / terminal
        //println salta de linea
        System.out.println("Hola Sergio");
        //print NO salta de linea 
        System.out.print("Como van las cosas");
        System.out.println();
        System.out.printf("Aqui va una cadena: %s%n", "Sergio");
        System.out.printf("Aqui va una cadena: %d%n", 10);
        
        var scanner = new Scanner (System.in);
        System.out.println("Por favor imprima un numero entero: ");
        var entero = scanner.nextLine();
        System.out.println(entero);

        scanner.close();
        }
}   
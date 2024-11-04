import java.util.Scanner;


public class PalabraUsuario {
    /**
     * @param args
     */
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Introduzca palabra 1: ");
        var pala1 = scanner.nextLine();
        System.out.println("Introduzca palabra 2: ");
        var pala2 = scanner.nextLine();
        System.out.println("Introduzca palabra 3: ");
        var pala3 = scanner.nextLine();
        System.out.printf("%s %s %s", pala1,pala2,pala3);

        scanner.close();
    }
}

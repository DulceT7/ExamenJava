import java.util.Scanner;
public class Examen{
    public static void main(String [] args){


        Scanner scanner = new Scanner(System.in);


        System.out.println("[1] la suma de un número y su triple");
        System.out.println("[2] el doble de un numero menos 5");
        System.out.println("[3]La mitad de un número más su cuadrado");
        System.out.println("[4]La suma de un número su doble y el triple");
        System.out.println("[?] : ");

        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:

            System.out.println("<------------------>");
            System.out.println("Primer valor de x");
            int n1 = scanner.nextInt();
            double resultaado = 4*n1;
            System.out.println("Resultado" + resultaado);

            break;

            case 2:

            System.out.println("<------------------>");
            System.out.println("Segundo valor de x");
            int n2 = scanner.nextInt();
            double resultado2 = n2*2-5;
            System.out.println("resultado " + resultado2);

            break;

            case 3:
            System.out.println("<------------->");
            System.out.println("Tercer valor de x");
            int n3 = scanner.nextInt();
            double resultado3 = (2.0/n3) + (n3*n3);
            System.out.println("resultado " + resultado3);

            break;

            case 4:
            System.out.println("<-------------->");
            System.out.println("Cuarto valor de x");
            int n4 = scanner.nextInt();
             double resultado4 = n4 + (n4*2) + (n4*3);
             System.out.println("resultado " + resultado4);

            break;

            default:
            System.out.println("Opción no valida");

        }

        System.out.println("Saliendo del programa");
    }
}
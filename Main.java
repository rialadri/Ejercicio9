//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ESTE ARRAY ALMACENARÁ LOS 8 NUMEROS
        int[] numeros = new int[8];

        // OUT PARA PEDIR AL USUARIO LOS NUMEROS
        System.out.println("Por favor, ingresa 8 números enteros:");

        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); // LOS ALMACENAMOS DENTRO DEL ARRAY
        }

        // MIRAMOS SI ES PAR O IMPAR BUSCANDO DECIMALES
        System.out.println("\nLos números ingresados son:");
        for (int i = 0; i < 8; i++) {
            String tipo;
            if (numeros[i] % 2 == 0) {
                tipo = "par";
            } else {
                tipo = "impar";
            }
            System.out.println(numeros[i] + " es " + tipo);
        }

        // FIN DEL SCANNER
        scanner.close();
    }
}
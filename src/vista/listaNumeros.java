package vista;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class listaNumeros {
    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        int numUsuario;
        int[] numeros = new int[100];
        int[] numDivisibles;
        int conteo = 0;

        do {
            System.out.print("Introduzca un número que se encuentre entre el 2 y el 7: \n");
            numUsuario = es.nextInt();
        } while (numUsuario < 2 || numUsuario > 7);

        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        for (int num : numeros) {
            if (num % numUsuario == 0) {
                conteo++;
            }
        }

        numDivisibles = new int[conteo];
        int c = 0;
        for (int num : numeros) {
            if (num % numUsuario == 0) {
                numDivisibles[c++] = num;
            }
        }

        System.out.println("-------------------------------------------");
        System.out.print("Los numeros divisibles para " + numUsuario + " son: \n");
        for (int i = 0; i < numDivisibles.length; i++) {
            System.out.print(numDivisibles[i] + "-");
        }
    }
}  
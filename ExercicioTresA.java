/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import java.util.HashSet;
/**
 *
 * @author Usuario
 */
public class ExercicioTresA {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        HashSet<Integer> elementos = new HashSet<>();
        boolean possuiRepetidos = false;

        System.out.println("Digite os números para preencher a matriz 3x5:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                if (!elementos.add(matriz[i][j])) {
                    possuiRepetidos = true;
                }
            }
        }

        System.out.println("\nMatriz 3x5:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        if (possuiRepetidos) {
            System.out.println("\nA matriz possui elementos repetidos.");
        } else {
            System.out.println("\nA matriz não possui elementos repetidos.");
        }

        scanner.close();
    }
}


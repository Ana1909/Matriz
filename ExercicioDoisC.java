/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ExercicioDoisC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int[] somaLinhas = new int[5]; 

        System.out.println("Digite os números para preencher a matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                somaLinhas[i] += matriz[i][j];
            }
        }

        System.out.println("\nMatriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nA soma de cada linha é:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Linha " + (i + 1) + ": " + somaLinhas[i]);
        }

        scanner.close();
    }
}


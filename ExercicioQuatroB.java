/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ExercicioQuatroB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[4][4];

        // Preenchendo a matriz 4x4
        System.out.println("Digite os números para preencher a matriz 4x4 (valores decimais):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        // Exibindo a matriz
        System.out.println("\nMatriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibindo os valores da diagonal secundária
        System.out.println("\nValores da diagonal secundária:");
        for (int i = 0; i < 4; i++) {
            int j = 3 - i; // Índice para a diagonal secundária
            System.out.println("Elemento [" + i + "][" + j + "]: " + matriz[i][j]);
        }

        scanner.close();
    }
}


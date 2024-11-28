/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ExercicioTresC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        int quantidadeImpares = 0;

        // Preenchendo a matriz 3x5
        System.out.println("Digite os números para preencher a matriz 3x5:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Verifica se o número é ímpar
                if (matriz[i][j] % 2 != 0) {
                    quantidadeImpares++;
                }
            }
        }

        // Exibindo a matriz
        System.out.println("\nMatriz 3x5:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }

        // Exibindo a quantidade de números ímpares
        System.out.println("\nA quantidade de números ímpares na matriz é: " + quantidadeImpares);

        scanner.close();
    }
}


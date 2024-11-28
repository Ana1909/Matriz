/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class ExercicioCincoC {
    public static void main(String[] args) {

        char[][] matriz = new char[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Preenche a 1ª coluna
                if (j == 0) {
                    matriz[i][j] = '*';
                }

                else if (j == 1 && i > 0) {
                    matriz[i][j] = '*';
                }

                else if (j == 2 && i > 1) {
                    matriz[i][j] = '*';
                }

                else if (j == 3 && i == 3) {
                    matriz[i][j] = '*';
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        // Exibindo a matriz
        System.out.println("Matriz 4x4 com a forma de uma rampa de '*' e centro vazio:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");}
            
            System.out.println(); 
        }
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class ExercicioCincoB {
    public static void main(String[] args) {

        String[][] matriz = new String[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if ((i == 0 || i == 3) || (j == 0 || j == 3)) {
                    matriz[i][j] = "*";
                } else {
                    matriz[i][j] = " ";
                }
            }
        }

        System.out.println("Matriz 4x4 com bordas preenchidas com '*' e centro vazio:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

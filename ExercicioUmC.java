/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class ExercicioUmC {
        public static void main(String[] args) {

        double[][] matriz = {
            {1.9, 2.5, 10.0}, 
            {1.0, 7.8, 2.5},   
            {3.5, 2.2, 4.7}
        };


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}


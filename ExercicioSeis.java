/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class ExercicioSeis {
    public static void main(String[] args) {
        final int N_Lin = 3, N_Col = 3; // final para definir constante
        int mat[][] = new int[N_Lin][N_Col];
        int l, c;

        JOptionPane.showMessageDialog(null, "****** Cadastrando dados na matriz ******\n Entre com o valor em cada posição da matriz");

        // Atribuição dos valores na matriz
        for (l = 0; l < N_Lin; l++) {
            for (c = 0; c < N_Col; c++) {
                mat[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Valor linha " + (l + 1) + " coluna " + (c + 1) + ":"));
            } // fim do for da coluna
        } // fim do for da linha

        JOptionPane.showMessageDialog(null, "****** Exibindo os dados da matriz ******");

        // Exibição dos valores na matriz
        for (l = 0; l < N_Lin; l++) {
            for (c = 0; c < N_Col; c++) {
                System.out.print(mat[l][c] + " "); // Exibe os valores lado a lado
            } // fim do for da coluna
            System.out.println(""); // Para organizar a apresentação em linhas diferentes
        } // fim do for da linha
    }
}
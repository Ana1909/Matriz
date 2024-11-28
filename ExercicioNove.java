/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
   import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ExercicioNove {
    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3]; // Inicializa o tabuleiro
        inicializarTabuleiro(tabuleiro);
        executarJogo(tabuleiro);
    }

    // Inicializa o tabuleiro com espaços vazios
    public static void inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    // Exibe o tabuleiro formatado
    public static void exibirTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("-----");
        }
    }

    // Verifica se há um vencedor ou empate
    public static String verificarVencedor(char[][] tabuleiro) {
        // Verifica linhas e colunas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2] && tabuleiro[i][0] != ' ') {
                return String.valueOf(tabuleiro[i][0]); // Linha
            }
            if (tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i] && tabuleiro[0][i] != ' ') {
                return String.valueOf(tabuleiro[0][i]); // Coluna
            }
        }
        // Verifica diagonais
        if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] != ' ') {
            return String.valueOf(tabuleiro[0][0]); // Diagonal principal
        }
        if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[0][2] != ' ') {
            return String.valueOf(tabuleiro[0][2]); // Diagonal secundária
        }
        // Verifica empate
        boolean empate = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    empate = false;
                    break;
                }
            }
        }
        if (empate) return "Empate";

        return null; // Jogo continua
    }

    // Executa o jogo da velha
    public static void executarJogo(char[][] tabuleiro) {
        Scanner scanner = new Scanner(System.in);
        char jogadorAtual = 'X';
        while (true) {
            exibirTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogadorAtual + ", é sua vez!");
            
            int linha, coluna;
            while (true) {
                System.out.print("Escolha a linha (0-2): ");
                linha = scanner.nextInt();
                System.out.print("Escolha a coluna (0-2): ");
                coluna = scanner.nextInt();

                if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                    break; // Jogada válida
                } else {
                    System.out.println("Posição inválida ou já ocupada. Tente novamente.");
                }
            }

            // Realiza a jogada
            tabuleiro[linha][coluna] = jogadorAtual;

            // Verifica vencedor
            String vencedor = verificarVencedor(tabuleiro);
            if (vencedor != null) {
                exibirTabuleiro(tabuleiro);
                if (vencedor.equals("Empate")) {
                    System.out.println("O jogo terminou em empate!");
                } else {
                    System.out.println("O jogador " + vencedor + " venceu!");
                }
                break;
            }

            // Alterna o jogador
            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }
        scanner.close();
    }
}



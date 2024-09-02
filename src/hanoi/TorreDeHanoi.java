package hanoi;

import java.util.Scanner;

public class TorreDeHanoi {
    // Atributos da classe
    private int numDiscos;

    // Construtor
    public TorreDeHanoi(int numDiscos) {
        this.numDiscos = numDiscos;
    }

    // Método que realiza o movimento de um disco entre dois pinos
    private void mover(int origem, int destino) {
        System.out.println(origem + " -> " + destino);
    }

    // Método que implementa a recursão
    private void resolverHanoi(int n, int origem, int destino, int trabalho) {
        if (n > 0) {
            resolverHanoi(n - 1, origem, trabalho, destino);
            mover(origem, destino);
            resolverHanoi(n - 1, trabalho, destino, origem);
        }
    }

    // Método para iniciar a resolução da Torre de Hanoi
    public void iniciar() {
        resolverHanoi(numDiscos, 1, 3, 2);
    }

    // Método principal para executar o programa
    public static void main(String[] args) {
        // Recebe o número de discos digitado pelo usuário
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número de discos: ");
        int n = entrada.nextInt();

        // Cria uma instância da classe TorreDeHanoi e inicia a solução
        TorreDeHanoi hanoi = new TorreDeHanoi(n);
        hanoi.iniciar();
    }
}

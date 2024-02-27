
package jogodavelha;

import java.util.Random;

public class Computador extends Jogador {

    public Computador(int jogador) {
        super(jogador);
        System.out.println("Jogador 'Computador' criado!");
    }

    @Override
    public void jogar(Tabuleiro tabuleiro) {
        Random random = new Random();

        int linha, coluna;
        do {
            linha = random.nextInt(3);
            coluna = random.nextInt(3);
            tentativa[0] = linha;
            tentativa[1] = coluna;
        } while (!checaTentativa(tentativa, tabuleiro));

        System.out.println("O computador escolheu a posição: Linha " + (linha + 1) + ", Coluna " + (coluna + 1));
        tabuleiro.setPosicao(tentativa, jogador);
    }

    @Override
    public void Tentativa(Tabuleiro tabuleiro) {
    }
}


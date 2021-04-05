package kon.laiser.fernando;

import java.util.Random;

public class Dado {
    private int numeroLados;
    private int faceAtual;
    private int[] FACES;

    public Dado(int numeroLados) {
        this.numeroLados = numeroLados;
        FACES = new int[this.numeroLados];

        for (int i = 0; i < this.numeroLados; i++){
            FACES[i] = i+1;
        }
    }

    /**
     * Método que realiza o lançamento do dado e atribui dentro da
     * face atua o valor do lançamento
     * @return
     */

    private void lancarDados(){
        Random random = new Random();
        this.faceAtual = random.nextInt(this.numeroLados);
    }

    /**
     * Método que retorna a face atual do dado
     * @return Face atual sorteada
     */

    public int lerFaceAtual(){
        return FACES[this.faceAtual];
    }

    /**
     * Método que realiza o lançamento do dado e retorna a face atual
     * @return o valor da face atual recém sorteada
     */

    public int lancarDadoELerFace(){
        lancarDados();
        return lerFaceAtual();
    }
}

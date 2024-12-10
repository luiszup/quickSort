public class Main {
    public static void main(String[] args) {
        // Declaração e inicialização de um array de inteiros
        int[] vetor = {2, 4, 6, 4, 10, 15, 3};

        // Exibe o array desordenado
        System.out.println("Desordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }

        // Chama o metodo quicksort para ordenar o array
        quicksort(vetor, 0, vetor.length - 1);

        // Exibe o array ordenado
        System.out.println("Ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
    }

    // Metodo que implementa o algoritmo de quicksort
    static void quicksort(int[] vetor, int menor, int maior) {
        // Verifica se ainda há elementos para ordenar
        if(menor < maior) {
            // Encontra o índice da partição
            int p = particao(vetor, menor, maior);
            // Ordena recursivamente os elementos à esquerda da partição
            quicksort(vetor, menor, p);
            // Ordena recursivamente os elementos à direita da partição
            quicksort(vetor, p + 1, maior);
        }
    }

    // Metodo que realiza a partição do array
    static int particao(int[] vetor, int menor, int maior) {
        // Calcula o índice do meio e escolhe o pivô
        int meio = (int)(menor + maior) / 2;
        int pivo = vetor[meio];

        // Inicializa os ponteiros para percorrer o array
        int i = menor - 1; // Ponteiro para elementos menores que o pivô
        int j = maior + 1; // Ponteiro para elementos maiores que o pivô

        // Loop infinito para realizar a partição
        while(true) {
            // Move o ponteiro 'i' para a direita até encontrar um elemento maior ou igual ao pivô
            do {
                i++;
            } while (vetor[i] < pivo);

            // Move o ponteiro 'j' para a esquerda até encontrar um elemento menor ou igual ao pivô
            do {
                j--;
            } while (vetor[j] > pivo);

            // Se os ponteiros se cruzarem, retorna o índice da partição
            if (i >= j) {
                return j;
            }

            // Troca os elementos nas posições 'i' e 'j'
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }
}
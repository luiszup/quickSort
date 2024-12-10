public class Main {
    public static void main(String[] args) {
        int[] vetor = {2, 4, 6, 4, 10, 15, 3};

        System.out.println("Desordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }

        quicksort(vetor, 0, vetor.length - 1);

        System.out.println("Ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
    }

    static void quicksort(int[] vetor, int menor, int maior) {
        if(menor < maior) {
            int p = particao(vetor, menor, maior);
            quicksort(vetor, menor, p);
            quicksort(vetor, p + 1, maior);
        }
    }

    static int particao(int[] vetor, int menor, int maior) {
        int meio = (int)(menor + maior) / 2;
        int pivo = vetor[meio];
        int i = menor - 1;
        int j = maior + 1;
        while(true) {
            do {
                i++;
            } while (vetor[i] < pivo);
            do {
                j--;
            } while (vetor[j] > pivo);
            if (i >= j) {
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }
}
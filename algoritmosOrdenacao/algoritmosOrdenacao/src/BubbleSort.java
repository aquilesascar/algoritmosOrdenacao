public class BubbleSort {
    public void bubbleSort(int v[], int n) {//n é o tamanho do vetor
        int i, fim, aux;
        for (fim = n - 1; fim > 0; fim--) {
            for (i = 0; i < fim; i++) {
                if (v[i] > v[i + 1]) {
                    aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                }
            }
        }
    }
}

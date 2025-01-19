public class Merge {
    public void mergeSort(int vetor[], int inicio, int fim){
        if(inicio < fim){
            int meio = (inicio+fim)/2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio+1, fim);
            merge(vetor, inicio, meio, fim);

        }
    }
    public void merge(int vetor[], int inicio, int meio, int fim){
        int com1 = inicio;
        int com2 = meio+1;
        int comAux = 0;
        int vetAux[] = new int[fim - inicio + 1];
        while(com1 <= meio && com2 <= fim){
            if (vetor[com1] <= vetor[com2]){
                vetAux[comAux] = vetor[com1];
                com1++;
            }else{
                vetAux[comAux] = vetor[com2];
                com2++;
                comAux++;
            }while(com1<=meio){//caso ainda haja elementos na primeira metade
                vetAux[comAux] = vetor[com1];
                comAux++;
                com1++;
            }while(com2<=fim){//caso a=haja elementos na segunda metade
                vetAux[comAux] = vetor[com2];
                comAux++;
                com2++;
            }for (comAux=inicio; comAux<=fim; comAux++){//move os elementos de volta para o vetor original
                vetor[comAux] = vetAux[comAux - inicio];
            }
        }
    }
}

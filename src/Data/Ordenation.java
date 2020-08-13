package Data;

import org.jetbrains.annotations.NotNull;

public class Ordenation {

    public Ordenation() {}

    public int[] insertionSort(int[] data, int n) {
        int numSorted = 1;
        int index;
        while (numSorted < n) {
            // Pega o primeiro valor não ordenado
            int unsortedValue = data[numSorted];
            // e insere ele entre os ordenados
            for (index = numSorted; index > 0; index--) {
                if (unsortedValue < data[index-1]){
                    data[index] = data[index -1];
                } else {
                    break;
                }
            }
            // reinserir o valor
            data[index] = unsortedValue;
            numSorted++;
        }
        return data;
    }
    private static void merge (int data[], int temp[], int low, int middle, int high) {
        int ri = low; // result index
        int ti = low; // temp index
        int di = middle; // destination index
        // ENquanto duas listas não estão vazias ele merge o menor valor
        while (ti < middle && di <= high) {
            if (data[di] < temp[ti]) {
                data[ri++] = data[di++];
            } else {
                data[ri++] = temp[ti++];
            }
            while (ti < middle) {
                data[ri++] = temp[ti++];
            }
        }
    }
    private static void mergeSortRecusivo(int data[], int temp[], int low, int high) {
        int n = high - low+1;
        int middle = low + n/2;
        int i;
        if (n < 2) return;
            // Move a menor metade para o armazenamento temporario
            for (i = low; i < middle; i++) {
                temp[i] = data[i];
            }
        //ordenar a menor metade do array
        mergeSortRecusivo(temp, data, low, middle - 1);
        // ordena a "upper" do array
        mergeSortRecusivo(data, temp, middle, high);

        merge(data, temp, low, middle, high);

    }
    public int[] mergeSort(int[] data, int n) {
        mergeSortRecusivo(data, new int[n], 0, n - 1);
        return data;
    }
    public int[] selectionSort(int[] data, int n) {
        int numberUnsorted = n;
        int index;
        int min;
        while (numberUnsorted > 0) {
            // determinando o valor maior no array
            min = 0;
            for (index = 1; index < numberUnsorted; index++) {
                if (data[min] < data[index]) min = index;
            }
            swap(data, min, numberUnsorted -1);
            numberUnsorted--;
        }
        return data;
    }
    public void swap(@NotNull int data[], int first_index, int second_index) {
        int smallestNumber = data[first_index];
        data[first_index] =  data[second_index];
        data[second_index] = smallestNumber;
    }
}

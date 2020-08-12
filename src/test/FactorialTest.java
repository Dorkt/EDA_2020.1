package test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;

import Data.Factorial;
import Data.Ordenation;
public class FactorialTest {
    @Test
    public void TestaResultadoDoFatorial() throws IOException {
        Factorial factorial = new Factorial();
        Assertions.assertEquals(120, factorial.factorial_recursive(5));
        Assertions.assertEquals(24, factorial.factorial_recursive(4));
        System.out.println("RESULT = " + factorial.factorial_recursive(5));
    }

    @Test
    public void TestaOrdenacaoInsertion() throws  IOException {
        Ordenation ordenation = new Ordenation();
        int [] expected = { 2, 4, 5, 8, 9, 15};
        int array[] = {5, 8, 15, 2, 4, 9};
        Assertions.assertArrayEquals(expected, ordenation.insertionSort(array, array.length));
        int [] newArray = ordenation.insertionSort(array, array.length);
        for (int itens : newArray) {
            System.out.printf(" %d ", itens);
        }
    }
    @Test
    public void TesteMergeSort () throws IOException{
            Ordenation ordenation = new Ordenation();
            int [] expected = {2, 4, 5, 8, 9, 15};
            int [] actual = {5, 8, 15, 2, 4, 9};
            Assertions.assertArrayEquals(expected, ordenation.mergeSort(actual, actual.length));
            int [] newArray = ordenation.mergeSort(actual, actual.length);
            for (int itens : newArray) {
                System.out.printf(" %d ", itens);
            }
    }
}

package Data;



public class Executor {
    public static void main(String[] args) {
        Ordenation ordenation = new Ordenation();
        int array[] = {5, 8, 15, 2, 4, 9};

        ordenation.selectionSort(array, array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println("ELEMENTO = " + array[i]);
        }
        Factorial factorial = new Factorial();
        Integer result = factorial.factorial_recursive(5);
        System.out.println("The value is: " + result);
        ordenation.mergeSort(array, args.length);

    }
}

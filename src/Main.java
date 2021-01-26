import java.util.Arrays;
import java.util.Scanner;

class Main {
    static int arraySize;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rozmiar tablicy liczb całkowitych");
        arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj liczbę: ");
            int number = scanner.nextInt();
            array[i] = number;
        }
        System.out.println("Dla liczb: ");
        System.out.println(Arrays.toString(array));

        System.out.println("Liczby uporządkowane to: ");
        int[] bubbleSort = bubbleSort(array);

        System.out.println(Arrays.toString(bubbleSort));

        ComparatorAndCreate comparator = new ComparatorAndCreate();

        System.out.println("Liczba porównań dla tablicy: " + Arrays.toString(comparator.createTableOneToFive()) +
                " to:" + comparator.countComparator(comparator.createTableOneToFive()));
        System.out.println("Liczba porównań dla tablicy: " + Arrays.toString(comparator.createTableFiveToOne()) +
                " to:" + comparator.countComparator(comparator.createTableFiveToOne()));
        System.out.println("Liczba porównań dla tablicy: " + printOneHundredToOne() +
                " to:" + comparator.countComparator(comparator.createTableOneHundredToOne()));
        System.out.println("Liczba porównań dla tablicy: " + printOneToNinetyNine() +
                " to:" + comparator.countComparator(comparator.createTableOneToNinetyNine()));
    }

    static String printOneHundredToOne() {
        return "[100, 99, ..., 2, 1]";
    }

    static String printOneToNinetyNine() {
        return "[1, 2, ..., 98, 99]";
    }

    static int[] bubbleSort(int[] array) {
        int x;
        do {
            for (int i = 0; i < arraySize - 1; i++) {
                if (array[i] > array[i + 1]) {
                    x = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = x;
                }
            }
            arraySize = arraySize - 1;
        } while (arraySize > 1);
        return array;
    }

}

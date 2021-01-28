class ComparatorAndCreate {
    public String comparisons(int[] array) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if ((array[i] > array[i + 1])) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count1++;
                }
            }
            count2++;
        }
        String print;
        if (count1 != 0) {
            print = Integer.toString(count1 * count2);
        } else {
            print = Integer.toString(count2);
        }
        return print;
    }

    public int[] createTableFiveToOne() {
        return new int[]{5, 4, 3, 2, 1};
    }

    public int[] createTableOneToFive() {
        return new int[]{1, 2, 3, 4, 5};
    }

    public int[] createTableOneToNinetyNine() {
        int[] tableOneToNinetyNine = new int[99];
        for (int i = 0; i < tableOneToNinetyNine.length; i++) {
            tableOneToNinetyNine[i] = i + 1;
        }
        return tableOneToNinetyNine;
    }

    public int[] createTableOneHundredToOne() {
        int[] tableOneHundredToOne = new int[100];
        for (int i = 0; i < tableOneHundredToOne.length; i++) {
            tableOneHundredToOne[i] = tableOneHundredToOne.length - i;
        }
        return tableOneHundredToOne;
    }
}

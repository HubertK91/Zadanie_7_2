class ComparatorAndCreate {
    int countComparator(int[] array) {
        int n = 0;
        if (array[n] > array[n + 1]) {
            return (int) Math.pow((array.length - 1), 2);
        } else {
            return array.length - 1;
        }
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

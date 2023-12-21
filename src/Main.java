public class Main {
    public static void main(String[] args) {
        CustomList customList = new CustomList(new int[]{6, 5, 16, 26, 1, 8, 9, 7, 6});
        System.out.println("Original array1: " + customList);

        customList.selectionSort();
        System.out.println("Selection sort result: " + customList);

        customList.reverse();
        System.out.println("Reversed array: " + customList);

        customList.bubbleSort();
        System.out.println("Bubble sort result: " + customList);

        System.out.println();

        CustomList customList2 = new CustomList(new int[]{4, 5, 13, 26, -11, 8, 0, 7, 6});
        System.out.println("Original array2: " + customList2);

        customList2.bubbleSort(true);
        System.out.println("Bubble desc sort result: " + customList2);

        System.out.println();

        CustomList customList3 = new CustomList(new int[]{4, 15, 123, 11, 18, 0, 7, 7});
        System.out.println("Original array3: " + customList3);

        customList3.selectionSort(true);
        System.out.println("Selection desc sort result: " + customList3);

        System.out.println();

        CustomList customList4 = new CustomList(new int[]{4, 5, -13, 26, -11, 8, 0, 7, 6});
        System.out.println("Original array4: " + customList4);
        customList4.invert();
        System.out.println("Inverted array4: " + customList4);
        customList4.positive();
        System.out.println("Positive array4: " + customList4);

        System.out.println();

        CustomList customList5 = new CustomList(new int[]{4, 5, -13, 26, -11, 8, 0, 7, 6});
        System.out.println("Original array5: " + customList5);
        customList5.changeSign(true);
        System.out.println("Positive array5: " + customList4);

        System.out.println();

        CustomList customList6 = new CustomList(new int[]{4, 5, -13, 26, -11, 8, 0, 7, 6});
        System.out.println("Original array6: " + customList6);
        customList6.changeSign(false);
        System.out.println("Positive array5: " + customList6);

        System.out.println();

        CustomList customList7 = new CustomList(new int[]{4, -3, 15, -6, 13, 2, 26, -5, 2});
        System.out.println("Original array7: " + customList7);
        customList7.insertionSort();
        System.out.println("Insertion sort result: " + customList7);
    }
}

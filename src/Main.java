public class Main {
    public static void main(String[] args) {
        CustomList customList = new CustomList(new int[]{6, 5, 16, 26, 1, 8, 9, 7});
        System.out.println(customList);
        customList.selectionSort();
        System.out.println(customList);
    }
}

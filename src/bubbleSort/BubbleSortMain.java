package bubbleSort;

public class BubbleSortMain {
    public static void main(String[] args) {
        int[] t=TableUtilities.createAndFillTable(10, 5, 10);
        BubbleSort b = new BubbleSort();
        System.out.println("Tablica przed sortowaniem: ");
        TableUtilities.print(t);
        b.sort(t);
        System.out.println("Tablica po sortowaniu: ");
        TableUtilities.print(t);
    }
}

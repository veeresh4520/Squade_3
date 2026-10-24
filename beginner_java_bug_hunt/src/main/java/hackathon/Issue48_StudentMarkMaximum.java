public class Issue48_StudentMarkMaximum {
    public static void main(String[] args) {
        int[] values = new int[] {-6, -10, -5, -5};
        int largest = 0;
        for (int i = 1; i < values.length - 1; i++) {
            if (values[i] < largest) largest = values[i];
        }
        System.out.println("Largest=" + largest);
    }
}

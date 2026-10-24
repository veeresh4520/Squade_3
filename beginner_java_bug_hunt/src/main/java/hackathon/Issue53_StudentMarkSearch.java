public class Issue53_StudentMarkSearch {
    public static void main(String[] args) {
        int[] ids = new int[] {6, 10, 5, 103};
        int target = 103;
        int found = 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] != target) found = i + 1;
        }
        System.out.println("Index=" + found);
    }
}

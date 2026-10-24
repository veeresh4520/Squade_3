public class Issue55_StudentMarkStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A3", "B3", "C3"};
        String target = new String("B3");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}

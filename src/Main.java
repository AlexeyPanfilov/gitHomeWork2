public class Main {

    public static void main(String[] args) {

        int[] sales = {5, 13, 6, 8, 9};
        SalesManager manager = new SalesManager(sales);

        System.out.println(manager.max());
    }
}

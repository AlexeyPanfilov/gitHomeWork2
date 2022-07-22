public class Main {

    public static void main(String[] args) {

        long[] sales = {5, 13, 6, 8, 9}; // сумма 5 элементов = 41

        SalesManager manager = new SalesManager(sales);

        System.out.println(manager.max());

        System.out.println(manager.cutAverage()); // 41 - 5 - 13 = 23; 23/3 = 7.7

    }
}
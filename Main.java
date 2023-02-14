
    public class Main {
        public static void main(String[] args) {

            int[] sales = new int[] {10, 40, 4, 500, 55};

            SalesManager salesManager = new SalesManager(sales);

            int max = salesManager.max();

            System.out.println(max);

        }
    }


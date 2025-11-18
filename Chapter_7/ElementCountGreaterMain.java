public class ElementCountGreaterMain {

    public static void main(String[] args) {

        int[] responseTimes = {100, 200, 150, 300};

        CountElementGreater calculator = new CountElementGreater();

        int result = calculator.countElementsGreater(responseTimes);

        System.out.println(result);
    }
}

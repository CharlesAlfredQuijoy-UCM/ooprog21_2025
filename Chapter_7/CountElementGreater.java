public class CountElementGreater {

    public int countElementsGreater(int[] arr) {
        if (arr.length <= 1) return 0;

        int count = 0;
        double sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            double avg = sum / i;

            if (arr[i] > avg) {
                count++;
            }

            sum += arr[i];
        }

        return count;
    }
}

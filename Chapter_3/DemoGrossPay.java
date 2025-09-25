public class DemoGrossPay {
    // Method to calculate and display gross pay
    public static void calculateGross(double hoursWorked) {
        final double HOURLY_RATE = 22.75; // fixed hourly rate
        double grossPay = hoursWorked * HOURLY_RATE;
        System.out.println(hoursWorked + " hours at $" + HOURLY_RATE + " per hour is $" + grossPay);
    }

    public static void main(String[] args) {
        // Test cases as shown in the output
        calculateGross(10.0);
        calculateGross(25.0);
        calculateGross(37.5);
    }
}
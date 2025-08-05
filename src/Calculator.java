public class Calculator {


    public int sum(int first, int second) {
        return first + second;

    }

    public int subtract(int first, int second) {
        return first - second;
    }


    public int multiply(int first, int second) {
        return first * second;
    }

    public int divide(int first, int second) {
        return first / second;

    }

    public int medie(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public int restul(int numar1, int numar2) {
        return numar1 % numar2;
    }

    public double fahrenheitToCelsius(double tempF) {
        return (5.0 / 9.0) * (tempF - 32.0);
    }

    public double inchesToMeters(double inches) {
        final double METERS_PER_INCH = 0.0254;
        return inches * METERS_PER_INCH;
    }












}



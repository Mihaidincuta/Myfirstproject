//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

/*
        System.out.println("Hello World!");

       System.out.println("Hello");
        System.out.println("Mihai");
        printMyName();

        byte myByteVariable = 3 + 5;
        System.out.println(myByteVariable);
        sum();


        myByteVariable = 20 / 10;
        System.out.println(myByteVariable);
        divide();

        myByteVariable = -5 + 8 * 6;
        System.out.println(myByteVariable);
        summultipli();

        myByteVariable = (55 + 9) % 9;
        System.out.println(myByteVariable);
        modulo();

        myByteVariable = 20 + -3 * 5 / 8;
        System.out.println(myByteVariable);
        summultiplidivide();

        myByteVariable = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(myByteVariable);
        sumdividemultplimodulo();


    }


    public static void printMyName() {
        System.out.println("Hello");
        System.out.println("Mihai");
   }

    public static void sum() {
        byte myByteVariable = (3 + 5);
        System.out.println(myByteVariable);
    }

    public static void divide(){
        byte myByteVariable = (20 / 10);
        System.out.println(myByteVariable);

    }

    public static void summultipli() {
        byte myByteVariable = (-5 + 8 * 6);
        System.out.println(myByteVariable);
    }

    public static void modulo() {
        byte myByteVariable = ((55 + 9) % 9);
        System.out.println(myByteVariable);
    }

    public static void summultiplidivide() {
        byte myByteVariable = (20 + -3 * 5 / 8);
        System.out.println(myByteVariable);
    }

    public static void sumdividemultplimodulo() {
        byte myByteVariable = (5 + 15 / 3 * 2 - 8 % 3);
        System.out.println(myByteVariable); */
        modelJava();
        fata();


        Calculator calc = new Calculator();


        int number1 = 10;
        int number2 = 5;


        System.out.println("Rezultatul adunarii este: " + calc.sum(number1, number2));
        System.out.println("Rezultatul scaderii este: " + calc.subtract(number1, number2));
        System.out.println("Rezultatul inmultirii este: " + calc.multiply(number1, number2));
        System.out.println("Rezultatul impartirii este: " + calc.divide(number1, number2));

        int a = 5;
        int b = 6;
        int c = 7;

        int media = calc.medie(a, b, c);

        System.out.println("Media numerelor " + 5 + ", " + 6 + " și " + 7 + " este: " + media);

        int numar1 = 15;
        int numar2 = 4;
        int rest = calc.restul(numar1, numar2);

        System.out.println("Restul impartirii lui " + numar1 + " la " + numar2 + " este: " + rest);

        double tempF = 65.0;
        double tempC = calc.fahrenheitToCelsius(tempF);
        System.out.println(tempF +"F este egal cu "+ tempC +"C");

        double distantaInInch = 85.0;
        double distantaInMetri = calc.inchesToMeters(distantaInInch);

        System.out.println(distantaInInch + " inch este egal cu " + distantaInMetri + " metri.");

    }






    public static void modelJava() {
        System.out.println("   J    a   v     v   a");
        System.out.println("   J   a a   v   v   a a");
        System.out.println("J  J  aaaaa   V V   aaaaa");
        System.out.println(" JJ  a     a   V   a     a");


    }




    public static void fata() {
        System.out.println(" +\"\"\"\"\"\"\"\"\"+");
        System.out.println(" [|  o   o  |]");
        System.out.println(" |    ^     |");
        System.out.println(" |   '-'    |");
        System.out.println(" +----------+");


    }












}
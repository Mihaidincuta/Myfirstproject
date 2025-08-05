//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


     /*   System.out.println("Hello World!");

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


        LogicalOp op = new LogicalOp();

        int biggest = op.checkBiggerNumber(2, 3);

        System.out.println("The bigger number is: " + biggest);

        String result1 = op.compareText("FastTrackIT");
        System.out.println(result1);

        String result2 = op.compareText("Hello Mihai");
        System.out.println(result2);



        // Condiția 1 îndeplinită
        String test1 = op.textAndNumber("FastTrackIT", 2);
        System.out.println("Test 1: " + test1);

        // Condiția 2 îndeplinită
        String test2 = op.textAndNumber("Fasttrackit", 6);
        System.out.println("Test 2: " + test2);

        // Niciuna dintre condiții îndeplinită
        String test3 = op.textAndNumber("FastTrackIT", 10);
        System.out.println("Test 3: " + test3);




        String first = op.snowAmount(10);
        System.out.println(first);

        String second = op.snowAmount(5);
        System.out.println(second);




        String rezultat1 = op.numberType(5);
        System.out.println(rezultat1);

        String rezultat2 = op.numberType(4);
        System.out.println(rezultat2);

        String rezultat3 = op.numberType(2);
        System.out.println(rezultat3);


        op.displayNumber(5);
        op.displayNumber(15);




        boolean isEven1 = op.isNumberEven(8);
        System.out.println("Is 8 an even number? " + isEven1);

        boolean isEven2 = op.isNumberEven(5);
        System.out.println("Is 5 an even number? " + isEven2);





        boolean vote1 = op.isEligibleToVote(25);
        System.out.println("A 25 years old person is eligible to vote? " + vote1);

        boolean Vote2 = op.isEligibleToVote(15);
        System.out.println("A 15 years old person is eligible to vote? " + Vote2);




        int gratest1 = op.gratestNumber(5, 2, 8);
        System.out.println("The gratest number is: " + gratest1);

        int gratest2 = op.gratestNumber(10, 25, 3);
        System.out.println("The gratest number is: " + gratest2);

        int gratest3 = op.gratestNumber(7, 4, 12);
        System.out.println("The gratest number is: " + gratest3);

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
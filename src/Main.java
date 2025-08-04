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





        int number1 = 10;
        int number2 = 5;

        System.out.println("Rezultatul adunarii este: " + sum(number1, number2));
        System.out.println("Rezultatul scaderii este: " + subtract(number1, number2));
        System.out.println("Rezultatul inmultirii este: " + multiply(number1, number2));
        System.out.println("Rezultatul impartirii este: " + divide(number1, number2));
    }


    public static int sum(int first, int second) {
        return first + second;
    }

    public static int subtract(int first, int second) {
        return first - second;
    }


    public static int multiply(int first, int second) {
        return first * second;
    }

    public static int divide(int first, int second) {
        return first / second;


    }

    public static void modelJava() {
        System.out.println("   J    a   v     v   a");
        System.out.println("   J   a a   v   v   a a");
        System.out.println("J  J  aaaaa   V V   aaaaa");
        System.out.println(" JJ  a     a   V   a     a");





        int a = 5;
        int b = 6;
        int c = 7;

        int media = medie(a, b, c);

        System.out.println("Media numerelor " + 5 + ", " + 6 + " și " + 7 + " este: " + media);


    }
    public static int medie(int a, int b, int c){
        return (a + b + c)/ 3;

    }

    public static void fata() {
        System.out.println(" +\"\"\"\"\"\"\"\"\"+");
        System.out.println(" [|  o   o  |]");
        System.out.println(" |    ^     |");
        System.out.println(" |   '-'    |");
        System.out.println(" +----------+");
    }















}



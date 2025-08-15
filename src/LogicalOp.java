import javax.swing.*;

public class LogicalOp {


    public static void main(String[] args){



    }

    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }

    }
    public String compareText(String text) {
        if (text.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }


    }
    public String textAndNumber(String text, int number) {
        if (text.equals("FastTrackIT") && number <= 3) {
            return text + " " + number;
        } else if (!text.equals("FastTrackIT") && number >= 4) {
            return number + " " + text;
        } else {
            return "Condiții neîndeplinite.";
        }

    }
    public String snowAmount(int snowAmount) {
        if (snowAmount > 8 || snowAmount == 6) {
            return "The amount of snow this winter was(cm): " + snowAmount;
        } else {
            return "The forecast snow is(cm): " + snowAmount;
        }


    }
    public String numberType(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else {
            return "The number is lower than 3";
        }
    }

    public void displayNumber(int number) {
        switch (number) {
            case 1:
                System.out.println("The number is: 1 !");
                break;
            case 2:
                System.out.println("The number is: 2 !");
                break;
            case 3:
                System.out.println("The number is: 3 !");
                break;
            case 4:
                System.out.println("The number is: 4 !");
                break;
            case 5:
                System.out.println("The number is: 5 !");
                break;
            default:
                System.out.println("Doesen't exist.");

        }
    }
    public boolean isNumberEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEligibleToVote(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    public int gratestNumber(int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else {
            return third;
        }



    }
    //1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public void printFromnumberTo100(int number){
        for(int i = number; i<=100; i++){
            System.out.println(i);
        }


        }
//2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
// Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
// Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
// Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public void printFromnumberToMinus100(int number){
        for(int i = number; i>=-100; i--){
            System.out.println(i);
        }
    }

    //3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
    // pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // numaratoarea sa se faca de la x, la y.
    //Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    //Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

public void countBetweenNumbers(int first, int second){
        for(int i = first; i<=second; i++){
            System.out.println(i);
        }
}

//4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
// Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
// si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru
// iar int y  este cel de-al doilea, daca x  este mai mare decat y,
// atunci numaratoarea sa fie de la y la x).
//Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
//Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

public void countFromsmallestToLargest(int x, int y) {
    if (x < y);
    for (int i = x; i <= y; i++) {
        System.out.println(i);
    }


}
public void countFromLargestToSmallest(int x, int y){
        if(x > y);
        for(int i = y; i >= x; i--){
            System.out.println(i);
        }

}
//5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

public void printEvenNumbers(){
        for(int i = 2; i <= 100; i +=2){
            System.out.println(i);
        }
}
//6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void printOddNumbers(){
        for(int i = 1; i <= 100; i +=2){
            System.out.println(i);
        }
    }
//7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
// Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
// iar la final sa returneze rezultatul.
// Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public void sumNumbers(){
        int sum = 0;
        for(int i = 1; i <= 100; i++){

            sum = sum + i;

        }
        System.out.println(sum);
    }

//8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
// Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
// si sa calculeze media numerelor. La final, metoda sa returneze media. Apelati metoda in clasa Main,
// metoda main() pentru a verifica daca functioneaza.

public void averageNumbers(){
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum = sum + i;
        }
    System.out.println(sum/100f);
}

//9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
//*******
//******
//*****
//****
//***
//**
//*
//Cateva mentiuni:
//- pentru a putea rezolva problema, trebuie folosite doua bucle for. O bucla se va construi in alta bucla.
//- prima bucla for se va ocupa de afisarea pe orizontala, si cealalta pe verticala
//- semnul asterisk (*) se poate afisa sub forma de string
//Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public void printPattern() {
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}



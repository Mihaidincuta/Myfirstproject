import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LogicalOp {




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
    // Tema Lab 10
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
    for(int i = 0; i <= 100; i ++){
        if(i % 2 == 0){
            System.out.println(i);
        }
    }
}

//6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void printOddNumbers(){
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

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

//9. Creati o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
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
        for (int j = 7; j >= 1; j--) {

            String text = "";

            for (int i = j; i >= 1; i--) {

                text = text + "*";

            }

            System.out.println(text);

        }
    }

//1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
// Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100,
// pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
// deoarece metoda afiseaza, nu returneaza.
// Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public void firstToLast(int first, int last){
        while(first <= last){
            System.out.println(first);
            first++;

        }
    }

//2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
// Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
// pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
// deoarece metoda afiseaza, nu returneaza.
// Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public void minusNumbers(int num1, int num2){
     while(num1 >= num2){
         System.out.println(num1);
         num1--;

     }
    }
//3. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
// Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
// pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
// numaratoarea sa se faca de la x, la y.
//Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
//Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

public void countBetween(int firstNumber, int secondNumber){
  while(firstNumber <= secondNumber){
      System.out.println(firstNumber);
      firstNumber++;


  }

}

//4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
// Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare
// de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
// daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
//Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
//Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

 public void countFromFirstToLast(int c, int d){
     if (c < d) {
         while (c <= d) {
             System.out.print(c);
             c++;
         }
     }
     else if(d < c){
         while(d <= c){
             System.out.println(c);
             c++;

         }

     }
     else{
         System.out.println("The numbers are equal");
     }
     }
//5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void evenNumbersWhile(){
     int i = 1;
     while(i<=100){
         if(i % 2 == 0){
             System.out.println(i);
         }
         i++;

     }
    }
//6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void oddNumbersWhile(){
        int i = 1;
        while(i <=100){
            if (i % 2 != 0) {
                System.out.print(i);
            }
            i++;

        }
    }

    //7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
    // Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
    // Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public float sumAndAverage(int numberone, int numbertwo) {
        float sum = 0;
        int count = 0;
        while (numberone <= numbertwo) {
            sum = sum + numberone;
            count++;
            numberone++;
        }
        return sum/count;


    }

   //8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7,
    // din acel interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public float divideAverageOfSeven(int firstnum, int lastnum){
        float count = 0;
        float sum = 0;
        while(firstnum<=lastnum){
            if(firstnum % 7 == 0){
                count++;
                sum += firstnum;

            }
            firstnum++;

        }
        return sum/count;

    }
//9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

    public void printFibonacci(){
        int count = 20;
        int num1 = 0;
        int num2= 1;

        int i = 0;

        while(i < count){
            System.out.print(num1+" ");

            int sumOfPrevTwo = num1 + num2;

            num1 = num2;

            num2 = sumOfPrevTwo;

            i++;

        }
    }
//10. Creati o metoda numita CozaLozaWoza.
//Metoda va afisa:
//- numerele de la 1 la 110
//- 11 numere pe linie
//- se va afisa Coza pentru numerele care sunt multiplu de 3 (1 2 Coza 4)
//- se va afisa Loza pentru numerele care sunt multiplu de 5 (2 3 4 Loza 6)
//- se va afisa Woza pentru numerele care sunt multiplu de 7 (4 5 6 Woza 8)
//- se va afisa CozaLoza pentru numerele care sunt multiplu de 3 SI 5
//- se va afisa CozaWoza pentru multiplu de 3 SI 7
//- se va afisa WozaLoza pentru multiplu de 5 SI 7
//- se va afisa CozaLozaWoza pentru multiplu de 3 SI 5 SI 7
//Ar trebui sa arate similar:
//1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11
//Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22
//23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
//......
//Apelati metoda in main() pentru a verifica daca functioneaza.

 public void wozaCozaLoza(){
        int i = 1;
     while (i <= 110) {

         if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {

             System.out.print("CozaLozaWoza ");

         } else if (i % 5 == 0 && i % 7 == 0) {

             System.out.print("WozaLoza ");

         } else if (i % 3 == 0 && i % 7 == 0) {

             System.out.print("CozaWoza ");

         } else if (i % 3 == 0 && i % 5 == 0) {

             System.out.print("CozaLoza ");

         } else if (i % 7 == 0) {

             System.out.print("Woza ");

         } else if (i % 5 == 0) {

             System.out.print("Loza ");

         } else if (i % 3 == 0) {

             System.out.print("Coza ");

         }
         else {

             System.out.print(i + " ");

         }

         if (i % 11 == 0) {

             System.out.println();

         }

         i++;
     }
 }

 //LAb 11
    //Tema Arrays

    //2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100.
    // Sa se afiseze progresul in consola pe tot parcursul.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public void firstArray(){
        int[] myArray = new int[100];
        for(int i = 0; i< myArray.length; i++){
            myArray[i] = i + 1;
        }

        for(int i = 0; i< myArray.length; i++){
            System.out.println(myArray[i]);

        }

    }

    //3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol,
    // si sa il returneze populat cu toate valorile pare de la 1 la 100.
    // Apelati metoda in main() pentru a verifica daca functioneaza. Atentie, metoda returneaza un array,
    // deci acesta va trebui surprins si afisat folosind o bucla.

    public int [] evenNumbersArray(int[] evenArray){
        int j = 0;

        for(int i = 1; i<= 100; i++){
            if(i % 2 ==0){
                evenArray[j] = i;
                j++;

            }
        }
        return evenArray;

    }

    // 4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
    // Metoda sa calculeze si sa returneze media numerelor din array.
    //Apelati metoda in main() pentru a verifica daca functioneaza.

    public float getAverageArray(int[] myArray){
        float sum = 0;
    for(int i = 0; i < myArray.length; i++){
       sum +=myArray[i];

    }
    return (sum / myArray.length);

    }

    //5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori,
    // si un parametru de tip String. Metoda sa verifice daca valoarea string-ului primit
    // se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean checkInArray(String[] arrString, String input) {


        for (int i = 0; i < arrString.length; i++) {

            if (arrString[i].equals(input)) {

                return true;

            }

        }

        return false;

    }

    //6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori,
    // si un parametru de tip numar. Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da,
    // atunci sa returneze pozitia pe care se afla numarul.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public int findNumberArray(int[] numbers, int numberTofind){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == numberTofind){
                return  i;

            }
        }
        return -1;


    }

    //7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - -

    public void drawLines() {

        char[] line = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',};


        for(int i = 0; i <= 10; i++) {

            System.out.println(line);

        }

    }

    //8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori,
    // si un parametru de tip numar. Metoda sa verifice daca numarul exista in array, si daca da,
    // sa returneze array-ul primit, fara acel numar.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public int[] removeNumFromArray(int[] myArray, int num){
        int[] secondArray = new int[myArray.length];

        int j = 0;

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] == num)

                continue;

            secondArray[j++] = myArray[i];

        }

        int[] finArray = new int[j];



        for (int i = 0; i < j; i++)

            finArray[i] = secondArray[i];

        return finArray;


    }

   //9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public int secondNumber(int[] myArray) {
        int temporary = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    temporary = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temporary;
                }
            }
        }
        return myArray[1];
    }

    //10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
    // Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public int[] firstToSecondArray(int[] firsatArray, int[] secondArray){
        for (int i = 0, j = 0; i < firsatArray.length; i++) {

            secondArray[j] = firsatArray[i];

            j++;

        }

        return secondArray;

    }

    //Tema optionala - Java Arrays
    //1. Creati o metoda care insereze un element pe o pozitie specifica intr-un array.

    public static int[] insertElement(int[] originalArray, int elementToInsert, int position){

        int[] newArray = new int[originalArray.length+ 1];
        for(int i = 0; i< position; i++){
            newArray[i] = originalArray[i];

        }
        newArray[position] = elementToInsert;

        for(int i =position; i< originalArray.length; i++){
            newArray[i +1] = originalArray[i];

        }
        return newArray;





    }

    //2. Creati o metoda care sa gaseasca cel mai mare si cel mai mic numar dintr-un array.

    public void findMinMax(int[] myArray){

        int min = myArray[0];
        int max = myArray[0];
        for(int i = 1; i< myArray.length; i++){
            if(myArray[i]< min){
                min= myArray[i];
            }
            if(myArray[i]> max){
               max = myArray[i];

            }
        }
        System.out.println("The smallest number is: " + min);
        System.out.println("The gratest number is: " + max);


    }

    //3. Creati o metoda care sa inverseze valorile unui array de int-uri.

    public void reverseArray(int[] numbers){
        int start = +0;
        int end = numbers.length -1;
        while(start < end){
            int x = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = x;

            start++;
            end--;

        }


    }

    public void printArray(int[] array){
        for(int element : array){
            System.out.println(element + " ");

        }
        System.out.println();
    }

    //4. Creati o metoda care sa gaseasca toate valorile duplicate dintr-un array.

    public void findDuplicates(int[] numbers){

        Arrays.sort(numbers);

        for(int i = 0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    //5. Creati o metoda care sa gaseasca toate elementele comune intre doua array-uri (array de String).

    public void findCommonElements(String[] array1, String[] array2){
        Arrays.sort(array1);
        Arrays.sort(array2);
        int i = 0;
        int j = 0;
        System.out.print("Common element are: ");

        while(i< array1.length && j<array2.length){
            if (array1[i]. compareTo(array2[j]) <0){
                i++;

            }else if(array1[i]. compareTo(array2[j])> 0){
                j++;

            }else{
                System.out.print(array1[i]);
                i++;
                j++;

            }
        }


    }

    //6. Creati o metoda care sa primeasca un array de numere ne-ordonat, si sa il returneze ordonat crescator.

    public int[] selectionSort(int[] array){

        int[] sortedArray = array.clone();
        int n = sortedArray.length;
         for(int i = 0; i< n - 1; i++){
             int minIndex = i;

             for(int j = i+ 1; j< n; j++){
                 if(sortedArray[j]< sortedArray[minIndex]){
                     minIndex = j;

                 }

             }
             int x = sortedArray[minIndex];
             sortedArray[minIndex] = sortedArray[i];
             sortedArray[i] = x;
         }

         return sortedArray;

    }




    //Lab12
    //Liste

    //1.Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista,
    // fiecare pe rand nou.

    public void firstList() {

        List<Integer> myList = new ArrayList<>();


        myList.add(5);
        myList.add(7);
        myList.add(10);
        myList.add(15);

        for (Object row: myList) {
            System.out.println(row);

        }


    }

    //2.Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
    // si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.


    public void addNumberToTheEnd(List<Integer> list, int number){
        list.add(number);



    }

    //3.Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista,
    // iar celalalt un numar intreg. Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista,
    // fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.

    public void printListFromNumber(List<Integer> myList , int position){

        for(int i = position; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }

    //4.Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand,
    // toate valorile din lista, dar invers(de la capat la inceput).

    public void  printListFromEnd(List<Integer> listFromEnd, int number){

        for( int i = listFromEnd.size() - 1; i >= 0; i--){
            System.out.println(listFromEnd.get(i));

        }


    }

    //5.Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg,
    // si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita,
    // iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.

    public void addStringToList(List<String> myList, int position, String text){
     myList.add(position, text);


    }

    //6.Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista,
    // iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.

    public void addListToFirstPosition(List<Integer> list, int number){
        list.add(0, number);


    }

    //7.Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista,
    // si pe ce pozitie. (Ex: “Pe pozitia 1 valoarea este 4”).

    public void printListWithIndex(List<Integer>myList){

        for(int i= 0; i< myList.size(); i++){

            int x = i + 1;
            int y = myList.get(i);

            System.out.println("On position "+ x + " the value is "+ y);

        }
    }

    //8.Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.

    public void printListTheGratest(List<Integer> myList){
        int maxNumber= myList.get(0);
        for(int i= 1; i< myList.size(); i++){
            int currentNumber = myList.get(i);

            if(currentNumber> maxNumber){
                maxNumber= currentNumber;

            }


        }
        System.out.println("The gratest number is "+ maxNumber);


    }

    //Tema optionala - Lists
    //1.Scrieti o metoda Java care sa schimbe pozitia a doua elemente intr-o Lista.

    public void swapElements(List<String> myList, int firstElements, int secondElements){

        String x = myList.get(firstElements);

        myList.set(firstElements, myList.get(secondElements));

        myList.set(secondElements, x);


    }

    //2.Scrieti o metoda Java care sa primeasca o Lista si sa returneze o alta lista,
    // care sa contina doar numerele pare din lista primita.

    public List<Integer> getEvenNumbers(List<Integer> myList){
        List<Integer> evenNumbersList = new ArrayList<>();
        for(Integer number: myList){

            if(number % 2== 0){
                evenNumbersList.add(number);

            }
        }
        return evenNumbersList;




    }

    //3.Scrieti o metoda Java care sa primeasca parametru o Lista nesortata, si sa returneze Lista sortata crescator.
    //Atentie, sortarea sa se faca programatic(adica logica sa fie scrisa de voi),
    // si nu folosit librarie externa, precum Collection.sort().








}



















import java.util.Arrays;


public class Main3 {

    public static void main(String[] args) {


        LogicalOp op = new LogicalOp();

       /* //2

         op.firstArray();

        //3

       int[] evenNumbersArray = new int[50];
      evenNumbersArray = op.evenNumbersArray(evenNumbersArray);

       for(int i = 0; i < evenNumbersArray.length; i++){
       System.out.println(evenNumbersArray[i]);
          }


        //4

        int[] numbers = {10,20,30, 40, 50};
        float average = op.getAverageArray(numbers);
        System.out.println(average);

       //5

        String[] names = {"Maria", "Andrei", "Alex", "Andreea", "Elena", "Marian", "George"};
        String nameToFind = "Elena";
        boolean found = op.checkInArray(names,nameToFind);

        String notToFind = "Lucian";
        boolean notFound = op.checkInArray(names, notToFind);

        System.out.println(nameToFind + ": " + found);
        System.out.println(notToFind + ": " + notFound);

        //6

        int[] myArray = {1, 2, 3, 4, 5, 6};

        int existing = 4;
        int position1 = op.findNumberArray(myArray , existing);

        int nonExisting = 50;
        int position2 = op.findNumberArray(myArray , nonExisting);

        System.out.println("The number " + existing + " it's found at the position: " + position1);
        System.out.println("The number " + nonExisting + " it's found at the position: " + position2);

        //7

        op.drawLines();

        //8

        int[] orgArray = {10, 20, 35, 40, 65, 85};
        int numToRemove = 35;
        int[] finArray = op.removeNumFromArray(orgArray , numToRemove);

        for (int i = 0; i < finArray.length; i++) {
            System.out.println(finArray[i]);
        }

        //9

        int[] numbers1 = {12,15,5,7,9,10};
        int secondnum = op.secondNumber(numbers1);
        System.out.println(secondnum);

        //10

        int[] firstArray = {10, 25, 34, 67, 89};
        int[] secondArray = new int[firstArray.length];
        int[] finalArray = op.firstToSecondArray(firstArray , secondArray);

        for(int i = 0; i < firstArray.length; i++){
            System.out.println(firstArray[i]);
        }
        System.out.println();

        for(int i = 0; i < finalArray.length; i++){
            System.out.println(finalArray[i]);
        }*/

        //Optional
        //1

        int[] originalArray = {10, 20, 30, 40};
        int element = 25;
        int position = 4;


        int[] newArray = op.insertElement(originalArray, element, position);

      //  System.out.println(Arrays.toString(newArray));

        //2

        int[] numbers = {5, 8, 2, 10, 3, 1};

      //  op.findMinMax(numbers);

        //3

        int[] myArray = {10, 20, 30, 40, 50};

        op.reverseArray(myArray); // Apel pe instanța `op`

     //   System.out.println("Array-ul inversat este: ");
     //   op.printArray(myArray);

        //4

        int[] myNumbers = {1, 2, 5, 4, 1, 5, 6, 8, 2};
    //    op.findDuplicates(myNumbers);

        //5

        String[] names1 = {"Adrian", "Maria", "Mihai", "Mihaela"};
        String[] names2 = {"Maria", "Lucian", "Daniel", "Adrian"};

      //  op.findCommonElements(names1, names2);

        //6

        int[] myNewArray = {64, 25, 12, 22, 11};

        int[] sortedArray = op.selectionSort(myNewArray);

        System.out.println("Sorted Array is: " + Arrays.toString(sortedArray));








































    }













}



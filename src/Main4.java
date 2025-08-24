import java.util.ArrayList;
import java.util.List;

public class Main4 {

    public static void main(String[] args) {


        LogicalOp op = new LogicalOp();

        //1

       // op.firstList();

        //2

        List<Integer>Numbers = new ArrayList<>();

        Numbers.add(5);
        Numbers.add(10);


        int number = 15;
        op.addNumberToTheEnd(Numbers , number);

       // System.out.println("The list after adding the number " + number + ": " + Numbers);


        //3

        List<Integer> mySecondList = new ArrayList<>();

        mySecondList.add(3);
        mySecondList.add(9);
        mySecondList.add(12);
        mySecondList.add(13);
        mySecondList.add(27);

      //  op.printListFromNumber(mySecondList , 2);

        //4

        List<Integer> listFromEnd = new ArrayList<>();
        listFromEnd.add(5);
        listFromEnd.add(8);
        listFromEnd.add(10);
        listFromEnd.add(15);
        listFromEnd.add(25);

      //  op.printListFromEnd(listFromEnd , 1);

        //5
        List<String> myList = new ArrayList<>();
        myList.add("Marian");
        myList.add("Vasile");
        myList.add("Ion");
        myList.add("Lucian");

        op.addStringToList(myList, 2, "Added to the second index");
      //  System.out.println(myList);

        //6

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);

        int newNumber = 25;
        op.addListToFirstPosition(numbers, newNumber);

      //  System.out.println(numbers);

        //7

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(4);
        numbers1.add(8);
        numbers1.add(15);
        numbers1.add(16);

     //   op.printListWithIndex(numbers1);

        //8

       // op.printListTheGratest(numbers1);

        //Optional
        //1

        List<String> colors = new ArrayList<>();
        colors.add("Rosu");
        colors.add("Verde");
        colors.add("Albastru");
        colors.add("Galben");

        op.swapElements(colors, 0, 3);

      //  System.out.println(colors);

        //2

        List<Integer> evenNumbersList = op.getEvenNumbers(numbers1);

        System.out.println(evenNumbersList);



















    }




}

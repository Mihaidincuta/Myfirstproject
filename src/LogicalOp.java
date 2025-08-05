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






}



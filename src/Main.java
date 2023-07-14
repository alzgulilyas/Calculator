import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.replaceAll(" ", "");

        System.out.println(calc(input));
    }


    public static String calc(String input) {
        String[] numbers = new String[2];
        int result=0;
        String operator = null;
        if (input.indexOf('+') > 0) {
            numbers = input.split("[+]", 2);
            operator = "plus";
        } else if (input.indexOf('-') > 0) {
            numbers = input.split("[-]", 2);
            operator = "minus";
        } else if (input.indexOf('*') > 0) {
            numbers = input.split("[*]", 2);
            operator = "multiply";
        } else if (input.indexOf('/') > 0) {
            numbers = input.split("[/]", 2);
            operator = "divide";
        } else{
            System.out.println("One of these operators: +, -, *, / have not been found");
            return "";
        }
        try {
            int number1 = Integer.parseInt(numbers[0]);
            int number2 = Integer.parseInt(numbers[1]);
            if(number1>10 || number1<1 || number2>10 || number2<1 ){
                System.out.println("Error: number out of range");
                return "";
            }
            switch(operator){
                case "plus": result = number1+number2;
                    break;
                case "minus": result = number1-number2;
                    break;
                case "multiply": result = number1*number2;
                    break;
                case "division": result = number1/number2;
                    break;
            }
        }
        catch (NumberFormatException e) {
            System.out.println("you can only use 2 integers");
            return "";
        }


        String idkwiamdoingit = String.valueOf(result);
        return idkwiamdoingit;
    }



}
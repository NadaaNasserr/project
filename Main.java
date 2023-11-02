import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);


        System.out.println("Pleasr Enter Number 1 to Show  menu Or 0 exit calculator program");
        int num = S.nextInt();
        ArrayList<Integer> array = new ArrayList<>();

        while (num != 0 && num ==1) {

            System.out.println("Enter 1 to addition the numbers\n" +
                    "\n" +
                    "Enter 2 to subtraction the numbers\n" +
                    "\n" +
                    "Enter 3 to multiplication the numbers\n" +
                    "\n" +
                    "Enter 4 to division the numbers\n" +
                    "\n" +
                    "Enter 5 to modulus the numbers\n" +
                    "\n" +
                    "Enter 6 to find minimum number\n" +
                    "\n" +
                    "Enter 7 to find maximum number\n" +
                    "\n" +
                    "Enter 8 to find the average of numbers\n" +
                    "\n" +
                    "Enter 9 to print the last result in calculator\n" +
                    "\n" +
                    "Enter 10 to print the list of all results in calculator");

            System.out.println("please Enter number 1 to calculator");
            int num1 = S.nextInt();

            System.out.println("please Enter number 2 to calculator");
            int num2 = S.nextInt();

            System.out.println("please Enter operation");
            String operation = S.next();



            switch (operation) {

                case "addition":
                    System.out.println(num1 + " + " + num2 + " = " + addition(num1, num2));
                    if(operation.equals("addition"))
                        array.add(addition(num1, num2));
                    break;
                case "subtraction":
                    System.out.println(num1 + " - " + num2 + " = " + subtraction(num1, num2));
                    if(operation.equals("subtraction"))
                        array.add(subtraction(num1, num2));
                    break;

                case "multiplication":
                    System.out.println(num1 + " x " + num2 + " = " + multiplication(num1, num2));
                    if(operation.equals("multiplication"))
                        array.add(multiplication(num1, num2));
                    break;
                case "division":
                    System.out.println(num1 + " / " + num2 + " = " + division(num1, num2));
                    if(operation.equals("division"))
                        array.add(division(num1, num2));
                    break;

                case "modulus":
                    System.out.println(num1 + " % " + num2 + " = " + modulus(num1, num1));
                    if(operation.equals("modulus"))
                        array.add(modulus(num1, num2));
                    break;
                case "minimum":
                    System.out.println(minimum(num1, num2) + "  Is minimum number");
                    if(operation.equals("minimum"))
                        array.add(minimum(num1, num2));
                    break;
                case "maximum":
                    System.out.println(maximum(num1, num2) + " Is maximum number");
                    if(operation.equals("maximum"))
                        array.add(maximum(num1, num2));
                    break;
                case "average":
                    System.out.println("The average of number " + num1 + " , " + num2 + " = " + average(num1, num2));
                    if(operation.equals("average"))
                        array.add(average(num1, num2));
                    break;


                 case "9":
                     System.out.println(" list of all results in calculator: " + array.get(array.size()-1));
break;
                case "10":
                    System.out.println(num1 + " + " + num2 + " = " + addition(num1, num2));
                    System.out.println(num1 + " - " + num2 + " = " + subtraction(num1, num2));
                    System.out.println(num1 + " x " + num2 + " = " + multiplication(num1, num2));
                    System.out.println(num1 + " / " + num2 + " = " + division(num1, num2));
                    System.out.println(num1 + " % " + num2 + " = " + modulus(num1, num1));
                    System.out.println(minimum(num1, num2) + "  Is minimum number");
                    System.out.println(maximum(num1, num2) + " Is maximum number");
                    System.out.println(average(num1, num2));
                    break;

                default:
                    System.out.println("Choose any Mathematical operation or the number 9 to display the last result in the calculator or the number 10 to display all results of the operations in the calculator....");

            }
            System.out.println("Pleasr Enter Number 1 to Show  menu Or 0 exit calculator program");
             num = S.nextInt();

        }
    }


    public static int addition(int num1 , int num2){
        int sum = num1 + num2;
      return sum ;
    }
    public static int subtraction(int num1 , int num2){
        int sub = num1 - num2;

        return sub ;
    }
    public static int multiplication(int num1 , int num2){
        int mult = num1 * num2;

        return mult;
    }
    public static int division(int num1 , int num2){
        int div = num1 / num2;

        return div;
    }
    public static int modulus(int num1 , int num2){
        int mod = num1 % num2 ;

        return mod;
    }
    public static int minimum(int num1 , int num2){
        int min =0 ;
        if (num1 < num2){

            min =num1 ;
        }
        else if( num2 < num1)
        min=  num2;
        return min;
    }
    public static int maximum(int num1 , int num2){
int max =0;
        if (num1 > num2){

            max = num1;
        }
        else if( num2 > num1)
        max = num2;

        return max;
    }
    public static int average(int num1 , int num2){
        int average = (num1 + num2) / 2;


    return average;
    }

}
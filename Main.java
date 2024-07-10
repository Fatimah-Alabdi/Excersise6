import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers , takes two numbers as input
       /* int num1;
        int num2;
try {
    System.out.println("enter first number");
    num1 = scanner.nextInt();
    System.out.println("enter second number");
    num2 = scanner.nextInt();
    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
}catch (InputMismatchException e){
    System.out.println("Invalid input you must enter an integer");
}catch (ArithmeticException e){
    System.out.println(e.getMessage());
}catch (Exception e){
    System.out.println(e.getMessage());
}



        */


        //2. Write a Java program that takes a number as input and prints its multiplication table up to 10.

   /*     int num;
try {


    System.out.println("Enter number: ");
    num = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
        System.out.println(num + " x " + i + " = " + (num * i));


    }
}catch (InputMismatchException e){
    System.out.println("Invalid input you must enter an integer");
}catch (Exception e){
    System.out.println(e.getMessage());
}


    */


        //3. Write a Java program to print the area and perimeter of a circle.

       /* float radius = 0;
        float area = 0;
        float perimeter = 0;


        try {


            System.out.println("Enter the radius of the circle: ");
            radius = scanner.nextFloat();

                check(radius);

            area = (float) (3.14 * (radius * radius));
            perimeter = (float) (2 * 3.14 * radius);
            System.out.println("The perimeter of the circle is " + perimeter);
            System.out.println("The area of the circle is " + area);
        } catch (InputMismatchException e) {
            System.out.println("invalid input");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }




        */





//4.Java program to find out the average of a set of integers


      /*  int num ;
        int integer;
        float average=0;
        int sum=0;
        try {


            System.out.println("Enter  the count of number: ");
            num = scanner.nextInt();

                check(num);


            for (int i = 1; i <= num; i++) {
                System.out.println("enter an integer : ");
                integer = scanner.nextInt();
                sum += integer;
                average = sum / num;

            }
            System.out.println("the average is : " + average);

        }catch (InputMismatchException e) {
            System.out.println("invalid input");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }


       */


        //5. Write a Java program that accepts three integers as input, adds the first two integer
        //together, and then determines whether the sum is equal to the third integer.

       /*
        int n1;
        int n2;
        int n3;
try {


    System.out.println("Enter the first number");
    n1 = scanner.nextInt();
    System.out.println("Enter the second number");
    n2 = scanner.nextInt();
    System.out.println("Enter the third number");
    n3 = scanner.nextInt();
    if (n1 + n2 == n3) {
        System.out.println("True");
    } else
        System.out.println("false");
}catch (InputMismatchException e) {
    System.out.println("Wrong input");
}catch (Exception e) {
    System.out.println(e.getMessage());
}

        */



        //6. Write a Java program to reverse a word.


       /* String text;
        String reverse="";
try {


    System.out.println("enter text to reverse");
    text = scanner.nextLine();

        rev(text);


    for (int i = text.length() - 1; i >= 0; i--) {
        reverse = reverse + text.charAt(i);

    }
    System.out.println("reverse word :" + reverse);

}catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
}catch (Exception e) {
    System.out.println(e.getMessage());
}

*/


        //7 - Java program to check whether the given number is even or odd
/*
        int num;
try {


    System.out.println("Enter number: ");
    num = scanner.nextInt();
    if (num % 2 == 0) {
        System.out.println("even");
    } else
        System.out.println("odd");

}catch (InputMismatchException e){
    System.out.println("invalid input");
}catch (Exception e){
    System.out.println(e.getMessage());
}



 */

//8 - Java program to convert the temperature in Centigrade to Fahrenheit


     /*   float Centigrade;
        float Fahrenheit=0;
try {
    System.out.println("Enter temperature in Centigrade:");
    Centigrade = scanner.nextFloat();
    Centigrade(Centigrade);
    Fahrenheit = (float) ((Centigrade * 1.8) + 32);
    System.out.println("temperature in Fahrenheit: " + Fahrenheit);
}catch (InputMismatchException e){
    System.out.println("Invalid input");
}catch (Exception e){
    System.out.println(e.getMessage());
}

      */

//9.Write a Java program that takes a string and a number from the user,then prints the character in the given index.

       /* String text;
        int n;
        try {


            System.out.println("input a String :");
            text = scanner.nextLine();
            index(text);
            System.out.println("input a number :");
            n = scanner.nextInt();
            index(text, n);
            if (n >= 0 && n < text.length()) {

                System.out.println(text.charAt(n));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        */

//10.Write a Java program to print the area and perimeter of a rectangle.



  /*  float width;
    float height;
    float area = 0;
    float perimeter = 0;

    try {
    System.out.println("width : ");
    width = scanner.nextFloat();
    check(width);
    System.out.println("height : ");
    height = scanner.nextFloat();
    check(height);
    area = width * height;
    perimeter = 2 * (width + height);
    System.out.println("area : " + area);
    System.out.println("perimeter : " + perimeter);
}catch (InputMismatchException e){
    System.out.println("Invalid input");
}catch (Exception e){
    System.out.println(e.getMessage());

}



   */



    }
    public static void check(float num) throws Exception {
        if(num<0){
            throw new Exception("you must enter positive number");
        }
    }
    public static void check(int num) throws Exception {
        if(num<0){
            throw new Exception("you must enter positive number");
        }
    }
    public static void rev(String t) throws Exception {
        if(t.length()<2){
            throw new Exception("you must enter grater than two character");
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(Character.isDigit(ch)){
                throw new Exception("you must enter letter");

            }
        }
    }
    public static void Centigrade(float num) throws Exception {
        if(num<-273.15){
            throw new IllegalArgumentException("Temperature cannot be below absolute zero (-273.15°C).");
        }
    }
    public static void index(String text, int num) throws Exception {
        if (num > text.length()) {
            throw new Exception("you must enter number within the length of the text");
        }

        }
        public static void index(String text) throws Exception {
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (Character.isDigit(ch)) {
                    throw new InputMismatchException("you must enter letter");

                }
            }
        }
    }
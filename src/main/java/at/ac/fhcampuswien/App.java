package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld() {
        System.out.println("Hello World!");
        // Hello World!
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("    __");
        System.out.println(" _(\\     |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |  __");
        System.out.println("      \\}{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__0 (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)( )(_");
        System.out.println("      '___''___");
    }

    //todo Task 3

    public void sumOfLiterals(){

        char char1 = 'Z';
        int integer1 = 0xface;
        int integer2 = 012;
        long long1 = 80L;
        float float1 = 44e-1f;
        float float2 = 5.5f;
        float float3 = 8.88e1f;
        float float4 = 99.9f;
        int sum=0;
        sum = (int) char1 + integer1 + integer2 + (int) long1 + (int) float1 + (int) float2 + (int) float3 + (int) float4;
        System.out.println(sum);
    }


    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int a,b = 0;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(a + b);

    }

    //todo Task 5

    public void swapTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        int a,b = 0;

        System.out.println("Before Swap:");
        System.out.print("x: ");
        a = scanner.nextInt();
        System.out.print("y: ");
        b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap:");
        System.out.println("x: " + a);
        System.out.println("y: " + b);

    }




    //todo Task 6
    public void compareTwoNumbers(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("n1: ");
    int a = scanner.nextInt();
    System.out.print("n2: ");
    int b = scanner.nextInt();
    if (a == b) {
        System.out.print("n1 == n2" + System.lineSeparator());
    } else if (a < b) {
        System.out.print("n2 > n1" + System.lineSeparator());
    } else {
        System.out.print("n1 > n2" + System.lineSeparator());
    }
 }

    //todo Task 7
    public void ratingSalesPerson() {
        Scanner scanner = new Scanner(System.in);

        int sales = 0;
        System.out.print("Enter annual Revenue:");
        sales = scanner.nextInt();
        if (sales < 0 || sales >= 100000) {
            System.out.print("Invalid Revenue" + System.lineSeparator());
        } else if (sales >= 0 && sales < 20000) {
            System.out.print("Poor Revenue" + System.lineSeparator());
        } else if (sales >= 20000 && sales < 50000) {
            System.out.print("Average Revenue" + System.lineSeparator());
        } else if (sales >= 50000 && sales < 80000) {
            System.out.print("Good Revenue" + System.lineSeparator());
        } else if (sales >= 80000 && sales < 100000) {
            System.out.print("Excellent sales Revenue");
        }
    }
   //todo Task 8
        public void getCommissionRate() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter commissionClass: ");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.print("Your Commission Rate was set to 0.01" + System.lineSeparator());
                    break;
                case 2:
                    System.out.print("Your Commission Rate was set to 0.02" + System.lineSeparator());
                    break;
                case 3:
                    System.out.print("Your Commission rate was set to 0.03" + System.lineSeparator());
                    break;
                case 4:
                    System.out.print("Your Commission rate was set to 0.04" + System.lineSeparator());
                    break;
                default:
                    System.out.print("Your Commission Rate was set to 0.0" + System.lineSeparator());
                    break;


            }
        }


        

    //todo Task 9
    public void leapyear(){
    Scanner scanner=new Scanner(System.in);
        System.out.print("Year: ");
        int year = scanner.nextInt();
        if((year%100)==0&&(year%400)!=0){
        System.out.print("Not a Leapyear"+System.lineSeparator());
        }else if((year%400)==0||(year%4)==0){
        System.out.print("Leapyear"+System.lineSeparator());
        }else{
        System.out.print("Not a leapyear"+System.lineSeparator());
        }
        }

    //todo Task 10


    public void transposedNumbers(){
        Scanner scanner = new Scanner(System.in);
        int beforeconversion, afterconversion, a, b, c;
        System.out.print("Number: = ");
        beforeconversion = scanner.nextInt();
        a = beforeconversion/100;
        b = (beforeconversion - a * 100) / 10;
        c = (beforeconversion - a * 100 - b * 10);
        afterconversion = c * 100 + b * 10 * a;
        System.out.print(afterconversion + System.lineSeparator());

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}
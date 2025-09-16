import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Age: ");
//        int age = sc.nextInt();
//
//        if(age> 18){
//            System.out.println("You Are ADULT!!");
//        }
//        else{
//            System.out.println("You Are Child!!");
//        }
//    }

//        //Quiz: find ODD or Even Using if/else
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num = sc.nextInt();
//
//        if(num % 2 == 0){
//            System.out.println("Even");
//        }else{
//            System.out.println("ODD"); }
//

        //using else if (use else if as a if statement for more statements)
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter two numbers");
//        System.out.print("A = ");
//        int a = sc.nextInt();
//        System.out.print("B = ");
//        int b = sc.nextInt();
//
//        if (a == b) {
//            System.out.println("a and b are equal");
//        } else if (a > b) {
//            System.out.println("a is greater than b");
//        } else {
//            System.out.println("a is smaller than b");
//        }

       //SWITCH
       // print Hello,Namaste,Bonjour using switch
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter button: ");
//        int button = sc.nextInt();
//
//        switch (button){
//            case 1 :
//                System.out.println("HELLO");
//                break;
//            case 2 :
//                System.out.println("NAMASTE");
//                break;
//            case 3 :
//                System.out.println("BONJOUR");
//                break;
//            default:
//                System.out.println("Invalid Input!");
//        }
//
//


        // Homework:Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
        //1 : + (Addition) a + b
        //2 : - (Subtraction) a - b
        //3 : * (Multiplication) a * b
        //4 : / (Division) a / b
        //5 : % (Modulo or remainder) a % b
        //Calculate the result according to the operation given and display it to the user.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        System.out.println("Enter a = ");
        double a = sc.nextInt();
        System.out.println("Enter b = ");
        double b = sc.nextInt();
        int button = sc.nextInt();


        switch (button){
            case 1 :
                System.out.println(a+b);
                break;
            case 2 :
                System.out.println(a-b);
                break;
            case 3 :
                System.out.println(a*b);
                break;
            case 4 : if(b==0){
                System.out.println("invalid Division");
            }else {
                System.out.println(a/b);
            }
            break;
            case 5 : if (b==0) {
                System.out.println("invalid Division");
            }else {
                System.out.println(a%b);
            }
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}




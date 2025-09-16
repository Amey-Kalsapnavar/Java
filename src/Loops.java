import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

//        FOR LOOP
//        for (intializer;condition(termination);updation),use variable

//        for (int i=0; i< 100; i++){
//            System.out.println("Amey");
//            }

//        print 0 to 10
//        for (int i=0; i < 11; i++){
//            System.out.println(i);
//        }

//        WHILE LOOP
//        intializer;
//        while(termination condition){
//            print statement;
//            updation;
//        }

//        print 0 to 100
//        int i = 0;
//        while (i<101){
//            System.out.println(i);
//            i++;
//        }

//        DO WHILE LOOP
//          intializer;
//          do {
//              print statement;
//              updation;
//          }while(termination condition);

//      print 0 to 50
//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        }while(i<51);

//        Question: print the sum of First n Natural number
//        Scanner sc = new Scanner(System.in);
//        System.out.print("n = ");
//        int n = sc.nextInt();
//
//        int sum = 0;
//        for(int i=1;i<=n;i++){
//            sum = sum + i;
//        }
//        System.out.print("Addition is = "+sum);


//        Print the table of n ,take input by user
//        Scanner sc = new Scanner(System.in);
//        System.out.print("n = ");
//        int n = sc.nextInt();
//
//        for(int i=1;i<=10;i++){
//            System.out.println(i*n);
//        }


        //Homework1:Print all even numbers till n.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("n = ");
//        int n = sc.nextInt();
//
//        for(int i=0;i<=n;i++){
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//        }

// homework 2:Make a >menu driven program. The user can enter 2 numbers, either 1 or 0.
//If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
//If they enter 0 then stop.
//If he/ she scores :
//Marks >=90 -> print “This is Good”
//89 >= Marks >= 60 -> print “This is also Good”
//59 >= Marks >= 0 -> print “This is Good as well”
//	Because marks don’t matter but our effort does.


        Scanner sc = new Scanner(System.in);
        int input;

        do{ int marks = sc.nextInt();
            if (marks>=90 && marks<=100){
                System.out.println("This is Good");
            }else if (marks<=89 && marks >=60){
                System.out.println("This is also Good");
            }else if (marks<=59 && marks>=0){
                System.out.println("This is Good as well");
            }else{
                System.out.println("invalid");
            }

            System.out.println("Want to continue ? (yes(1) or no(0))");
            input = sc.nextInt();

        } while( 1 == input);
    }
}

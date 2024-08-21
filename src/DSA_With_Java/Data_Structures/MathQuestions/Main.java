package DSA_With_Java.Data_Structures.MathQuestions;

import java.sql.SQLOutput;

public class Main {

    //GCF or GCD
    public static int GCF_Function(int a, int b){

        int GCF = 1; // 1 is a divisor of any integer
        int smaller = Math.min(a, b);

        //Iterate through all possible divisors
        for (int i = 1; i <= smaller ; i++) {
            if(a%i ==0 && b%i == 0){
                GCF = i;
            }
        }

        return GCF;
    }

    //Logic:
    //product of given two numbers = GCD * LCM;
        public static int LCM_Function(int a, int b){

            int GCF = 1; // 1 is a divisor of any integer
            int smaller = Math.min(a, b);

            for (int i = 1; i <= smaller ; i++) {
                if(a%i ==0 && b%i == 0){
                    GCF = i;
                }
            }

            int LCM = a*b/GCF;

        return LCM;
    }

    public static void SquarePattern( int a){
        int n = a;

        //rows
        for (int i = 1; i <= n; i++) {
            //columns
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public static void IncreasingTriange(int a){
        int n = a;

        //rows
            //notice n
        for (int i = 1; i <= n; i++) {
            //columns
                //notice i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public static void  DecreasingTriangle(int a){
        int n = a;
        //rows
            //notice from 0 to n
        for (int i = 1; i <= n; i++) {
            //columns
                //Notice i: from i to n
            for (int j = i; j <= n; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public static void RightTriangle(int a){
        int n = a;
        for (int i = 1; i <=n ; i++) {

            //from i to n
            for (int j = i; j <=n ; j++) {
                System.out.print("  ");
            }
            //from 1 to i
                //for increasing triangle pattern
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void InvertedRightTriange(int a){
        int n = a; //5
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("  ");
            }

            //from i to n
            for (int j = i; j <=n ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public static void HillPattern(int a){
        int n = a;
        for (int i = 1; i <=n ; i++) {

            //from i to n
            for (int j = i; j <=n ; j++) {
                System.out.print("  ");
            }
            //from 1 to i
            //for increasing triangle pattern
            for (int j = 1; j < i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.println("* ");
            }
            System.out.println();
        }

    }

    public static void ReverseHillPattern(int a){
        int n = a;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.println(" ");
             }
            for (int j = i; j <=n ; j++) {
                System.out.println("*");
            }
            for (int j = i; j <=n ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("GCF: " + GCF_Function(50,60));
        System.out.println("LCM: " + LCM_Function(50,60));
        System.out.println();
        SquarePattern(5);
        System.out.println();
        IncreasingTriange(5);
        System.out.println();
        DecreasingTriangle(5);
        System.out.println();
        RightTriangle(5);
        System.out.println();
        InvertedRightTriange(5);
        System.out.println();
        HillPattern(5);
        System.out.println();
        ReverseHillPattern(5);
    }
}

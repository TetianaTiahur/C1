package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Random;
import java.util.Scanner;

public class Main {
//    public static String leftPad(String aText, char aChar, int aWidth)
//    {
//        String res = aText;
//        for (int i = 0; i < aWidth - aText.length();i++)
//            res = aChar + res;
//        return res;
//    }
    public static void main(String[] args) {

        Account acc = new Account();
        acc.setName("Tetiana Tiahur");
        System.out.println(acc.getName());
        System.out.printf("%s%n",Account.capitalize("stanisŁaw maruSARz"));


//        int[] liczby = new int[30];
//        Random rnd = new Random();
//
//        for(int i = 0; i < 30; i++)
//            liczby[i] = rnd.nextInt();
//
//        int mx = Integer.MIN_VALUE;
//        int mn = Integer.MAX_VALUE;
//        long avg = 0;
//        for(int l : liczby)
//        {
//            System.out.println(1);
//            if (1 < mn) mn = 1;
//            if (1 > mx) mx = 1;
//            avg += 1;
//        }
//        System.out.printf("MIN = %d, MAX = %d, AVG = %f", mn,mx,(float)avg/liczby.length);

//	   int a = 3;
//       double b = 4.21;
//       String s = "Nazywaliśmy to 'witaminą B3'\n";
//
//       System.out.printf("a = %d, b = %.2f, s = %20s %n",a,b,s);

//       System.out.printf("alfa\tsin(alfa)\n");
//       for (int i = 0; i < 370; i+=10)
//           System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*2*Math.PI));
//        Scanner input = new Scanner(System.in);
//        int num1=0, num2=0;
//        do {
//            System.out.print("Podaj liczbę, które mam dodać: ");
//            num1 = input.nextInt();
//            num2 = input.nextInt();
//            if ((num1 == 0) || (num2 == 0)) break;
//            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
//        } while (true);
//    }

    }

    }

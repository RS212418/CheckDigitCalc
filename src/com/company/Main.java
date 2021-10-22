package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] barcodenumbers = new int[12];
        System.out.println("Please enter your barcode");
        for (int i = 0; i < barcodenumbers.length; i++) {
            barcodenumbers[i] = input.nextInt();
        }
        System.out.println("Your barcode is " + Arrays.toString(barcodenumbers));
        int number1 = barcodenumbers[1] + barcodenumbers[3] + barcodenumbers[5] + barcodenumbers[7] + barcodenumbers[9] + barcodenumbers[11];
        int number2 = number1 * 3;
        int number3 = barcodenumbers[0] + barcodenumbers[2] + barcodenumbers[4] + barcodenumbers[6] + barcodenumbers[8] + barcodenumbers[10];
        int total =  ((((number2 + number3)/10)+1)*10)-(number2 + number3);
        System.out.println(total);





    }


}


package pl.homework.util;

import java.util.Locale;
import java.util.Scanner;

public class ArrayService {


    public int[] setArray() {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        for (int i = 0; i< arr.length; i++) {
            System.out.println("podaj liczbę numer "+ (i+1));
            arr[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        return arr;
    }

    public int sumSelected(int[] arr) {
        return arr[0]+arr[2]+arr[4];
    }



}

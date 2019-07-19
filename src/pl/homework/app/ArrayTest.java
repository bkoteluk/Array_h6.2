package pl.homework.app;

import pl.homework.util.ArrayService;

public class ArrayTest {
    public static void main(String[] args) {

        ArrayService arrayService = new ArrayService();
        int[] arr = arrayService.setArray();

        System.out.println("Suma pierwszego, trzeciego i piątego elementu tablicy wynosi: "
                + arrayService.sumSelected(arr));
    }
}

package Arary;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraystack<T> {

    public static void main(String[] args) {

        ArrayList<Integer> list_1 = new ArrayList<>(Arrays.asList(3, 2, 4, 1, 5 , 100 , 10));
        ArrayList<Integer> list_2 = new ArrayList<>(Arrays.asList(2, 4, 6 , 5 ,7 ,8 ,100  ));

        // Liiska 3

        ArrayList<Integer> list_3 = new ArrayList<>();

        // Ku shubida liiska 1 liiska 3

        list_3.addAll(list_1);

        // Ku shubida liiska 2 liiska 3

        list_3.addAll(list_2);

        // Ka saarida nuqulka

        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (Integer number : list_3) {
            if (!uniqueList.contains(number)) {
                uniqueList.add(number);
            }
        }

        // Daabaca liiska kowaad, liiska labaad, iyo liiska saddexaad
//
//        System.out.println("List 1: " + list_1);
//        System.out.println("List 2: " + list_2);
        System.out.println("List 3 (Merged): " + uniqueList);
}
}

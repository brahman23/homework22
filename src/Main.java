import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i <50 ; i++) {
            int s =  random.nextInt(1,100);
            list.add(s);
            if(s%2==0){
                list1.add(s);
            }
            else
                list2.add(s);
        }
        System.out.println("list"+list);
        System.out.println("list1"+list1);
        System.out.println("list2"+list2);


    }


}
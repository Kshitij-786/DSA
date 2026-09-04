package dsa;

import javax.swing.text.html.HTMLDocument;
import java.util.*;
public class ListPractice {
    static void main(String[] args) {

        /// Add element and print list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1000);
        list.add(20);
        list.add(300);
        list.add(45240);
        list.add(50);
       // System.out.println(list);

        /// print element through index
     //   System.out.println("Number in list at index 2 is: " + list.get(2));

        /// replace element
//        list.set(1,100);
//        System.out.println("Relacing 20 with 100: " + list.get(1));
//        System.out.println(list);

        /// Find max with loop in List

//            int max = list.get(0);
//
//            for(int i = 0;i< list.size();i++) {
//                if(list.get(i) > max){
//                    max = list.get(i);
//                }
//
//            }
//        System.out.println(max);
        System.out.println( Collections.max(list)); //aslo a method to call a max element
    }
}

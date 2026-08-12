package dsa;
//BASICS OF ARRAY
import java.util.*;
public class array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // print array elements
//        int arr [] = {10,25,7,40,15};
//        int i = 0;
//        while(i<arr.length){
//            System.out.println(arr[i]);
//            i++;
//        }

        // sum of aaray all elements
//        int arr [] = {10,20,30,40,50};
//        int i = 0 , sum = 0;
//        while(i<arr.length){
//            sum += arr[i]; // sum = sum + arr[i];
//            i++;
//        }
//        System.out.println(sum);

        // find max element from array
//        int arr [] = {10,45,23,89,12} , max = 0;
//        for(int i = 0;i<arr.length;i++){
//            if(arr[i]>max){
//                max  = arr[i];
//            }
//        }
//        System.out.println(max);

        // fin min element of array
//        int arr [] = {35,12,67,4,29};
//        int min = arr[arr.length-1]; // can be arr[0]
//        for(int i = 0;i< arr.length;i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        System.out.println(min);

        // count even number in array
//        int arr[] = {10,15,22,7,8,13};
//        int count = 0;
//
//        for(int i =0;i<arr.length;i++){
//            if(arr[i]%2==0){
//                count++;
//            }
//        }
//        System.out.println(count);

        // count positve numbers from array
//        int arr[] = {-5,10,-2,7,0,15,-8};
//        int posNum = 0;
//        for (int i = 0;i< arr.length;i++){
//            if(arr[i]>0){
//                posNum++; // zero is not counted as positive number
//            }
//        }
//        System.out.println(posNum);

        // search element in array
//        int arr[] = {10,25,7,40,15};
//        int target  = sc.nextInt();
//        boolean isFound = false;
//        for (int i = 0;i< arr.length;i++){
//            if(arr[i] == target){
//                isFound = true;
//            }
//        }
//        System.out.println(isFound);

        // Count occurence in array
//        int arr[] = {10,25,25,7,40,25,15};
//        int target  = sc.nextInt();
//        int count = 0;
//        boolean isFound = false;
//        for (int i = 0;i< arr.length;i++){
//            if(arr[i] == target){
//                isFound = true;
//               count++;
//            }
//        }
//        System.out.println(count);

        // Reverse a Array
//        int arr[] = {10,25,25,7,40,25,15};
//        int rev[] = new int[arr.length];
//        for(int i = 0;i<arr.length;i++){
//            rev[i] = arr[arr.length-1-i];
//         System.out.println(rev[i]); //valid but creates more space
//        }

        // Reverse a same array
//        int arr[] = {10,20,30,40,50};
//        int temp;
//        for(int i = 0;i<arr.length/2;i++){ // divide 2 isliye kyuki index 0<->last se or phir 1 <-> sec last se vrna divide nhi karoge toh proper swap nhi ho paaega
//            temp = arr[i];
//            arr[i] = arr[arr.length-1 - i];
//            arr[arr.length-1-i] = temp;
//             // to get reversed array again start a loop
//        }
//        for(int i = 0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }

        // Find second largest element Array
//        int[] arr = {10, 45, 23, 89, 12, 67};
//        int largest,secondLargest;
//        if (arr[0] > arr[1]) {
//            largest = arr[0];
//            secondLargest = arr[1];  // loop start from 2 b/c it guarantees if value is negative then upper code can handle
//        } else {
//            largest = arr[1];
//            secondLargest = arr[0];
//        }
//        for (int i = 2; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                secondLargest = largest;
//                largest = arr[i];
//
//            } else if (arr[i] > secondLargest && arr[i] != largest) {
//                secondLargest = arr[i];
//            }
//        }
//        System.out.println("Largest: " + largest);
//        System.out.println("Second Largest: " + secondLargest);

                // Check wheater array is sorted or not

//            int[] arr = {10, 20, 15, 40, 50};
//            boolean isSort = false;
//            for (int i =1;i < arr.length-1;i++){
//                if ( arr[i-1] <arr[i] && arr[i] < arr[i+1]){
//                    isSort = true;
//                }
//            }
//        System.out.println(isSort);
            }
        }








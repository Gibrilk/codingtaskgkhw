package org.example;

public class problem9hw {
    public static void main(String[] args) {

        int [] array = {5, 8, 3, 12, 9, 6, 20, 1};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 1; i <array.length; i++){
            if(array[i]> largest){
                secondLargest = largest;
                largest = array[i];

            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        System.out.println("Second largest number in the array:  " + secondLargest);
        System.out.println("No second largest number found in the array." );

    }
}

package org.example;

public class problem8hw {
    public static void main(String[] args) {

        int [] array = {5, 8, 3, 12, 9, 6, 20, 1};

        int max = array[0];
        int min = array[0];

        for(int i = 1; i <array.length; i++){
            if(array[i]> max){
                max = array[i];
            }
            if(array[i]< min){
                min = array[i];
            }
        }

        System.out.println("Maximum number in the array: " + max);
        System.out.println("Minimum number in the array: " + min);

    }
}

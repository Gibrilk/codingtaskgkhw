package org.example;

public class problem1hw {
    public static void main(String[] args) {
        double [] temperatures = {75.4, 73.6, 71.6, 83.5, 69.5, 80.1, 63.4};

        double highestTemp = temperatures[0];
        double lowestTemp = temperatures [0];

        for(int i =1; i< temperatures.length; i++){
            if(temperatures[i] > highestTemp){
                highestTemp = temperatures [i];
            }
            if(temperatures[i] < lowestTemp){
                lowestTemp = temperatures[i];
            }
        }

        System.out.println("Highest temperature for the week: " +highestTemp);
        System.out.println("Lowest temperature for the week: " + lowestTemp);
    }
}

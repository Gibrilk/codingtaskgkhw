package org.example;

import java.util.HashSet;
import java.util.Set;

public class problem10hw {
    public static void main(String[] args) {
        String [] array = {"apple", "banana", "orange", "apple", "grape", "banana", "kiwi", "orange"};

        Set<String> uniqueElements = new HashSet<>();
        Set<String> duplicateElements = new HashSet<>();

        for (String element : array){

            if(!uniqueElements.add(element)){
                duplicateElements.add(element);
            }
        }
        if(!duplicateElements.isEmpty()){
            System.out.println("Duplicate elements in the array:");
            for(String duplicate : duplicateElements){
                System.out.println(duplicate);
            }
        }else{
            System.out.println("No duplicate elements found in the array.");
        }

    }
}

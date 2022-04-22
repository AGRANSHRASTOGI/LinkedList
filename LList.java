package com.LinkedList;
import java.util.LinkedList;
public class LList
{     public static void main(String[] args)
        {

            // create linkedlist
            LinkedList<String> animals = new LinkedList<>();

            // Add elements to LinkedList
            animals.add("Dog");
            animals.add("Cat");
            animals.add("Cow");
            System.out.println("LinkedList: " + animals);
            animals.add(1, "Horse");
            System.out.println("Updated LinkedList: " + animals);
            // get the element from the linked list
            String str = animals.get(1);
            System.out.print("Element at index 1: " + str);
            // change elements at index 3
           animals.set(3, "Kotlin");
            System.out.println("Updated LinkedList: " + animals);
            // remove elements from index 1
            String str2 = animals.remove(1);
            System.out.println("Removed Element: " + str2);
            System.out.println("Updated LinkedList: " + animals);
        }
    }


package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random=new Random();

        Integer[] array=new Integer[3];
        ArrayList<Integer>arrayList=new ArrayList<>();
        LinkedList<Integer>linkedList=new LinkedList<>();
        System.out.println("Array\t"+ "arraylist\t"+"linkedlist");


        for (int i = 0; i < 3; i++) {
            array[i] = random.nextInt(2);
            arrayList.add(random.nextInt(2));
            linkedList.add(random.nextInt(2));
            System.out.println(array[i]+"\t\t\t"+arrayList.get(i)+"\t\t\t"+linkedList.get(i));
        }


        Arrays.sort(array, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2)
            {return o1 - o2;}
        });

        arrayList.sort(new Comparator<Integer>() {
            public int compare( Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        linkedList.sort(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {return o1 - o2;}
        });

        System.out.println();
        System.out.println("Sort Array:  "+Arrays.toString(array));
        System.out.println("Sort ArrayList:  "+Arrays.toString(arrayList.toArray()));
        System.out.println("Sort LinkedList:  "+Arrays.toString(linkedList.toArray()));































    }
}

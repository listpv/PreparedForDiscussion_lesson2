package ru.geekbrains;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here


        // ArrayList
        System.out.println("ArrayList");
        Random random = new Random();
        MyArrayList<Integer> mal = new MyArrayList<>(2000006);
        mal.capacityAndSize();
        for (int i = 0; i < 1000000; i++) {
            mal.add(random.nextInt(100));
        }
        mal.capacityAndSize();
        mal.remove(0);
        mal.capacityAndSize();
        mal.remove(0);
        mal.capacityAndSize();
        int index = 999;
        System.out.println("Элемент с индеком " + index + " --- " + mal.get(index));
        for (int i = 0; i < 4; i++) {
            mal.add(random.nextInt(100));
            mal.capacityAndSize();
        }

        // LinkedList
        System.out.println("");
        System.out.println("LinkedList");
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.insertFirst("Maria");
        myLinkedList.insertFirst("Katya");
        myLinkedList.insertFirst("Luba");
        myLinkedList.insertFirst("Tanya");
        myLinkedList.insertLast("Julia");

        System.out.println(myLinkedList);
        System.out.println("Size = " + myLinkedList.size());
        System.out.println(myLinkedList.contains("Katya"));

        int indexLL = myLinkedList.indexOf("Luba");
        System.out.println(myLinkedList.remove(indexLL));
        System.out.println(myLinkedList);
        System.out.println("Size = " + myLinkedList.size());

        myLinkedList.insert(3, "newLuba");
        System.out.println(myLinkedList);
        System.out.println("Size = " + myLinkedList.size());

        System.out.println(myLinkedList.remove("Luba"));
        System.out.println(myLinkedList.remove("newLuba"));

        System.out.println(myLinkedList);
        System.out.println("Size = " + myLinkedList.size());

        while (myLinkedList.iterator().hasNext()){
            System.out.println(myLinkedList.iterator().next());
            myLinkedList.iterator().remove();
            System.out.println(myLinkedList);
        }

        System.out.println(myLinkedList);

    }
}

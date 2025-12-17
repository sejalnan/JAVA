package JAVA.Collections;

import java.util.*;

public class ClassTask {
    public static void main(String[] args) {

        /*
        1.Creat an array list and add 5 integers and print it
        2.Add elements at specific index
        3.Find the size
        4.Access first and last element of arraylist
        5.Remove an element from it using index
        6.Check if an element exist or not
        7.Clear all element from arraylist
        8.Copy one list to another list
        9.Convert an array to list
         */

        ArrayList<Integer> numbers =new ArrayList<Integer>();
        //Add elements
        numbers.add(5);
        numbers.add(55);
        numbers.add(32);
        numbers.add(49);
        numbers.add(34);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);

        numbers.add(5,11);
        numbers.add(6,6);

        //print the list and size of list
        System.out.println("ArrayList: "+numbers);
        System.out.println("ArrayList Size: "+numbers.size());

        //first and last element
        System.out.println("First Element:" +numbers.getFirst());
        System.out.println("Last Element:" +numbers.getLast());

        //remove element
        numbers.remove(2);
        System.out.println("Element Removed From Arraylist");
        System.out.println("ArrayList :"+numbers);

        //element exists
        System.out.println("Element Present or Not:"+numbers.contains(5));

        //copy
        ArrayList<Integer> numbers2 =new ArrayList<Integer>();
        numbers2.add(55);
        numbers2.add(22);
        numbers.addAll(numbers2);
        System.out.println(numbers);

        //arr to list
        int[] a={2,3,5,1};

        //trasversal a list--for loop
        System.out.println("ArrayList: "+numbers);
        System.out.println("Elements of Arraylist (FOR-LOOP): ");
        for (int i=0;i< numbers.size() ;i++)
        {
            System.out.println(numbers.get(i));
        }

        //trasversal a list--for each
        System.out.println("Elements of Arraylist (FOR EACH): ");
        for(int i:numbers)
        {
            System.out.println(i);
        }

        //transversal a list --iterator
        System.out.println("Elements of Arraylist (ITERATOR): ");
        Iterator<Integer> it= numbers.iterator();

            while(it.hasNext()){
                System.out.println(it.next());
            }

        //reverse arraylist
        System.out.println("Reversed List:"+numbers.reversed()); //only give reversed view

        Collections.reverse(numbers);//Permanantly reversed
        System.out.println("Reversed List:"+numbers);


        //printing the count of even numbers in Arraylist
        int Evencount=0;
        for (int el:numbers)
            if(el%2==0) Evencount++;

        System.out.println("Count of Even Numbers :"+Evencount);


        //printing the count of odd numbers in Arraylist
        int Oddcount=0;
        for (int el:numbers)
            if(el%2!=0) Oddcount++;

        System.out.println("Count of Even Numbers :"+Oddcount);

        //find the avg of elements
        int Tcount=Evencount+Oddcount;
        int sum=0;
        for (int el:numbers){
            sum=sum+el;
        }
        float avg=sum/Tcount;
        System.out.println("Average of Arraylist Elements is: "+avg);

        //find largest and smallest element
        Collections.sort(numbers);
        System.out.println("Min Value: "+numbers.getFirst());
        System.out.println("Max Value: "+numbers.getLast());

        //find the frequency of each element
        ArrayList<Integer> count= new ArrayList<>();

            for (int i=0;i<=100;i++) count.add(0);
            for(Integer value:numbers){
                int currentValue= count.get(value)+1;
                count.set(value,currentValue);

            }
            System.out.println(count.get(5));

        //hashmap solution
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(Integer value:numbers){
            hm.put(value, hm.getOrDefault(value,0)+1);
        }
        System.out.println(hm);

        }

    }









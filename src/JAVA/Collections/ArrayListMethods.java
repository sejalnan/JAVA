package JAVA.Collections;
import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods {
    public static void main(String[] args)  throws ArrayIndexOutOfBoundsException{

        ArrayList<Integer> list=new ArrayList<Integer>();
        //add(number)
        list.add(12);
        list.add(2);
        list.add(4);
        list.add(90);
        list.add(28);

        //add(index,number)
        list.add(2,32);
        list.add(6,7);

        System.out.println(list);

        //contains()
        System.out.println(list.contains(5));

        //index of any number
        System.out.println(list.indexOf(2));
        System.out.println(list.lastIndexOf(4));

        //size of arraylist
        System.out.println("Size of Array:" +list.size());

        //get index
        System.out.println(list.get(4));

        //isempty
        System.out.println(list.isEmpty());

        //set
        list.set(2,19);
        System.out.println(list);

        //remove
        list.remove(1);


    }
}

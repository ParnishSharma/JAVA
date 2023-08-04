package Arraylist; 
import java.util.ArrayList;
import java.util.Collections;

//elements stored in non contigous form and there is one more diffrence is that in:
//in array we can store primitive dt {int float} but in array list we store objects
//arraylist usually forms in heap
//in any collection framwork we do some basic functions:
//add ,get ,modify or add inbetween,delete
//        Integer | Float | String |  
//ADD   SIZE    REMOVE    ITERATE      addAll     removeAll     clear
//list has {(arraylist   ,  linkedlist  ,   vector has stack }
//QUEUE has FIFO IT HAS THREE MAIN CLASSES PriorityQueue ,LinkedList , Dequeue
//SET has HashSet ,LinkedHashSet , SortedSet has TreeSet
//Map has HashMap ,LinkedHashMap,SortedMapand Hashtable

public class Arraylis1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
         list.add(1); list.add(2); list.add(3);
        System.out.println(list);
        int  element=list.get(0);
        System.out.println(element);
        //print in any index
        list.add(2,4);
        System.out.println(list);
        //set element
        list.set(0,3);
                System.out.println(list);
                //delete
                list.remove(2);
        //list size
        int size=list.size();
        System.out.println(size);    
        
        Collections.sort(list);
        System.out.println(list);
        list.clear();
        System.out.println(list);


    }
    
}

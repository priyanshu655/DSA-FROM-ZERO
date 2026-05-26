package javaCollectionFrameworks;
import java.util.LinkedList;
public class LL1{
    public static void main(String[] args) {
        //create linkedlist
        LinkedList<Integer> l1=new LinkedList<>();
        //adding elements in linkedlist
        l1.addFirst(1);
        l1.addLast(2);
        l1.addLast(3);
        System.out.println(l1);
        //remove leemtns from linked list
        l1.removeFirst();
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);
    }
}
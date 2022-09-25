import java.util.LinkedList;
import java.util.List;

/**
 * @author Дмитрий Карпушов 24.09.2022
 */
public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(1));
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
        myLinkedList.remove(0);
        System.out.println(myLinkedList);

    }
}

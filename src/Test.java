public class Test {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list1=new DoublyLinkedList<>();
        list1.addFirst(4);
        list1.addLast(5);
        list1.addLast(6);
        list1.addFirst(3);

        System.out.println(list1.middle());
        DoublyLinkedList<Integer> list2=new DoublyLinkedList<>();
        list2.addFirst(7);
        list2.addLast(8);
        list2.addLast(9);
        list1.con(list2);
        System.out.println(list1.size());
        while (!list1.isEmpty())
        {
            System.out.print(list1.removeFirst()+" ");

        }
    }

}

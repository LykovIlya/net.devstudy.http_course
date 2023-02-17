package devstudy.lection1.homework;

public class LinkedList {
    private Item first;
    private Item last;
    private int size;

    public void add(int element) {
        if (first == null) {
            first = new Item(element, 0);
            last = first;
        } else {
            Item temp = new Item(element, last.getIndex() + 1);
            last.setNext(temp);
            last = temp;
        }
        size++;
    }

    public int remove(int index) {
        return 0;
    }
}

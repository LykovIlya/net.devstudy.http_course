package devstudy.lection1.homework;

public class Item {
    private Item next;
    private Item previous;
    private int value;
    private int index;

    public Item(Item next, Item previous, int value, int index) {
        this.next = next;
        this.previous = previous;
        this.value = value;
        this.index = index;
    }

    public Item(int value, int index) {
        this.value = value;
        this.index = index;
    }

    Item getNext() {
        return next;
    }

    void setNext(Item next) {
        this.next = next;
    }

    int getValue() {
        return value;
    }

    Item getPrevious() {
        return previous;
    }

    public Item(int value) {
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}

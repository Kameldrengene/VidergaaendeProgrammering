package Lektion4.stak;

interface Stak <E> {
    void push(E data);
    E pop();
    boolean isEmpty();
    boolean isFull();
    void show();
}

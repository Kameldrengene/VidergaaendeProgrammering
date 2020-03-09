package Lektion4;

public interface IStak<T> {
    
    void push(T e);
    T pop();
    boolean isEmpty();
    boolean isFull();
    void show();
    
}

package Lektion4;

import java.util.ArrayList;

public class Stak<T> implements IStak {
    
    ArrayList<T> stak = new ArrayList<>();
    
//    @Override
//    public void push(T e) {
//        stak.add(e);
//    }
    
    @Override
    public void push(Object e) {
    
    }
    
    @Override
    public Object pop() {
        return null;
    }
    
    @Override
    public boolean isEmpty() {
        return false;
    }
    
    @Override
    public boolean isFull() {
        return false;
    }
    
    @Override
    public void show() {
    
    }
    
    
}

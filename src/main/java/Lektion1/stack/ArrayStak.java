package Lektion1.stack;

public class ArrayStak implements Stak {

    private String arrayStak[];
    private int top;
    private int size;

    public ArrayStak(int size) {
        this.size = size;
        arrayStak = new String[this.size];
        top = -1;
    }

    public void push(String e) {
        if (!isFull()) {
            arrayStak[++top] = e;
        }
    }

    public String pop() {

        if (!isEmpty()) {
            return arrayStak[top--];
        }
            return "Empty";
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return (size == top - 1);
    }

    public void show() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arrayStak[i]);
        }
        System.out.println("---");
    }
}

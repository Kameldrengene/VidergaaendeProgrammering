package Lektion1.stack;
//Denne klasse er til for at holde styr på det næste element. Se LinkedList på Geeks4geeks https://www.geeksforgeeks.org/data-structures/linked-list/

public class Item {
    String input;
    Item ptr;

    public Item(String input, Item ptr){
        this.input = input;
        this.ptr = ptr;
    }
}

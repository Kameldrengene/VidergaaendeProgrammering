package Lektion3.OpgaveSimpel2LagsModel;

public class IngredientNotFoundException extends Exception {

    public IngredientNotFoundException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
